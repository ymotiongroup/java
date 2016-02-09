/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "ConfigServlet"
        ,urlPatterns = "/ConfigServlet",
        initParams = {
           @WebInitParam(name = "param1",value = "Hola"),
           @WebInitParam(name = "param2" ,value = "Mundo")
           }
        )
  
public class ServletAnnotation extends HttpServlet {

    /**
     *
     * @param config
     * @throws ServerException
     */

    public void init(ServletConfig config)
             throws ServerException{
         Enumeration<String> parameters = config.getInitParameterNames();
     }

}
