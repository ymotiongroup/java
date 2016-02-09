/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RestadorServlet" , urlPatterns = { "/RestadorServlet" } )

public class RestadorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServerException,IOException {
               this.procesarPeticion(response, request);
    }
    
    protected void doPost(HttpServletResponse response,HttpServletRequest request)
            throws ServerException,IOException{
                this.procesarPeticion(response, request);
    }
    
    private void procesarPeticion(HttpServletResponse response,HttpServletRequest request)
            throws ServerException,IOException{
        
                try{
                    
                    int param1 = Integer.parseInt(request.getParameter("param1"));
                    int param2 = Integer.parseInt(request.getParameter("param2"));
                    
                    Restar restar = new Restar();
                     int result = restar.restar(param1, param2);
                     request.setAttribute("result", result);
                     //request.getRequestDispatcher("/result.jsp").forward(request,response);
               
                }catch (NumberFormatException ex){
                        
                    request.setAttribute("error", "algunos de los nuemeros no contenian atributos");
                   // request.getRequestDispatcher("/error.jsp").forward(request, response);
                    
                }
    }
  
}
