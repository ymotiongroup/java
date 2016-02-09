/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sumadora;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ivan
 */
public class Servlet extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest request,HttpServletResponse response)
           throws ServletException,IOException {
       
        procesarPeticion(request , response);
   
   }
   @Override
   protected void doPost(HttpServletRequest request,HttpServletResponse reponse)
           throws ServletException,IOException{
        procesarPeticion(request, reponse);
   }
   
   private void procesarPeticion(HttpServletRequest request,HttpServletResponse response)
           throws ServerException,IOException{
           response.setContentType("text/html;charset=UTFS8");
             try {
                 int param1 = Integer.parseInt(request.getParameter("param1"));
                 int param2 = Integer.parseInt(request.getParameter("param2"));
                    int result = param1 + param2;
                    response.setStatus(200);
                    PrintWriter out = response.getWriter();
                    out.println();
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Calculadora</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("el resultado de la suma de :"+ param1);
                    out.println("<br><br>");
                    out.println("</body>");
                    out.println("</html>");
                    
              } catch (NumberFormatException ex) {
                    response.sendError(500, Error.class+"algunos de los numeros no contenian digitos validos." );
                    
             }
      }



}
