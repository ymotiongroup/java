package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import model.Friend;
import persistence.FriendPersistFactory;
import persistence.FriendDAO;

public class UpdateServlet extends CreateServlet {

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        FriendDAO persistenceManager = FriendPersistFactory.getFriendDAO(persistenceMechanism);
        String formerName = request.getParameter("formerName");
        Friend friend = super.generateFriendFromRequest(request);
        if (persistenceManager.updateFriend(formerName, friend)) {
            request.setAttribute("friend", friend);
            request.setAttribute("message", "ha sido modificada con éxito");
            gotoURL(successForm, request, response);
        } else {
            gotoURL(errorForm, request, response);
        }
    }
}
