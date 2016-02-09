package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import model.Friend;
import persistence.FriendPersistFactory;
import persistence.FriendDAO;

public class ReadServlet extends MyCoolServlet {

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        FriendDAO persistenceManager = FriendPersistFactory.getFriendDAO(persistenceMechanism);
        String name = request.getParameter("name");
        Friend friend = persistenceManager.readFriend(name);
        if (friend != null) {
            request.setAttribute("message", "tienen la siguiente informacion almacenada:");
            request.setAttribute("friend", friend);
            gotoURL(displayForm, request, response);
        } else {
            gotoURL(errorForm, request, response);
        }
    }
}
