package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import model.Friend;
import persistence.FriendPersistFactory;
import persistence.FriendDAO;

public class DeleteServlet extends MyCoolServlet {

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        FriendDAO persistenceManager = FriendPersistFactory.getFriendDAO(persistenceMechanism);
        String name = request.getParameter("name");
        Friend friend = persistenceManager.readFriend(name);
        if (friend != null && persistenceManager.deleteFriend(name)) {
            request.setAttribute("friend", friend);
            request.setAttribute("message", "ha sido borrado con éxito");
            gotoURL(successForm, request, response);
        } else {
            gotoURL(errorForm, request, response);
        }
    }
}
