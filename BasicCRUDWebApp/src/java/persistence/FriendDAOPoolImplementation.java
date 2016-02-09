package persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import model.Friend;

public class FriendDAOPoolImplementation implements FriendDAO {

    private static FriendDAOPoolImplementation persistenceManager = null;
    private DataSource pool;
    private static final Logger logger = Logger.getLogger(FriendDAOJDBCImplementation.class.getName());

    private FriendDAOPoolImplementation() {
        
    }

    public static FriendDAOPoolImplementation getFriendDAOPoolImplementation() {
        if (persistenceManager == null) {
            persistenceManager = new FriendDAOPoolImplementation();
        }
        return persistenceManager;
    }

    @Override
    public boolean setUp(String url, String driver, String user, String password) {
        Context env = null;
        try {
            env = (Context) new InitialContext().lookup("java:comp/env");
            pool = (DataSource) env.lookup("jdbc/myfriends");
            if (pool == null) {
                logger.log(Level.SEVERE, "No se encontro el DataSource");
                return false;
            }
        } catch (NamingException ex) {
            logger.log(Level.SEVERE, "No se pudo abrir la conexión contra base de datos", ex);
            return false;
        }
        return true;
    }

    @Override
    public boolean createFriend(Friend friend) {
        FriendDAO jDBCFriendDAO = prepareForExecutingQuerry();
        if (jDBCFriendDAO == null) {
            return false;
        }
        boolean isExecutedOk = jDBCFriendDAO.createFriend(friend);
        releaseQuerryResources(jDBCFriendDAO);
        return isExecutedOk;
    }

    @Override
    public boolean deleteFriend(String name) {
        FriendDAO jDBCFriendDAO = prepareForExecutingQuerry();
        if (jDBCFriendDAO == null) {
            return false;
        }
        boolean isExecutedOk = jDBCFriendDAO.deleteFriend(name);
        releaseQuerryResources(jDBCFriendDAO);
        return isExecutedOk;
    }

    @Override
    public Friend readFriend(String name) {
        FriendDAO jDBCFriendDAO = prepareForExecutingQuerry();
        if (jDBCFriendDAO == null) {
            return null;
        }
        Friend person = jDBCFriendDAO.readFriend(name);
        releaseQuerryResources(jDBCFriendDAO);
        return person;
    }

    @Override
    public boolean updateFriend(String name, Friend friend) {
        FriendDAO jDBCFriendDAO = prepareForExecutingQuerry();
        if (jDBCFriendDAO == null) {
            return false;
        }
        boolean isExecutedOk = jDBCFriendDAO.updateFriend(name, friend);
        releaseQuerryResources(jDBCFriendDAO);
        return isExecutedOk;
    }

    @Override
    public boolean disconnect() {
        return true;
    }

    private FriendDAO prepareForExecutingQuerry() {
        FriendDAOJDBCImplementation jDBCpersistenceManager = new FriendDAOJDBCImplementation ();
        Connection connection;
        try {
            connection = pool.getConnection();
        } catch (SQLException ex) {
            logger.log(Level.SEVERE, "No se pudo abrir la conexion contra la base de datos", ex);
            return null;
        }
        jDBCpersistenceManager.setConnection(connection);
        return jDBCpersistenceManager;
    }

    private void releaseQuerryResources( FriendDAO  friendDAO) {
        friendDAO.disconnect();
    }
}
