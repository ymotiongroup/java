/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ivan
 */
public class ciclodevida extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request , HttpServletResponse response)
            throws ServerException, IOException {
             
            System.out.println( "context path :"+ request.getContextPath() );
            System.out.println("Local Addr"+request.getLocalAddr() );
            System.out.println("Local Name :" + request.getLocalName());
            System.out.println("Local Port" + request.getLocalPort());
            System.out.println("method" +request.getMethod());
            System.out.println("Protocol :" + request.getProtocol());
            System.out.println("Query String" + request.getQueryString());
            System.out.println("Remote Addr" + request.getRemoteAddr());
            System.out.println("Remote Host" + request.getRemoteHost());
            System.out.println("Remote Port" + request.getRemotePort());
            System.out.println();
            Enumeration<String> headers = request.getHeaderNames();
              while(headers.hasMoreElements()){
                  String header  = headers.nextElement();
                  System.out.println(header + ":" + request.getHeader(header));
              }
              System.out.println();
              Enumeration<String> parameters = request.getParameterNames();
                while(parameters.hasMoreElements()){
                    String parameter = parameters.nextElement();
                     System.out.println(parameter + ":" + request.getParameter(parameter));
                }
    }
   
}
