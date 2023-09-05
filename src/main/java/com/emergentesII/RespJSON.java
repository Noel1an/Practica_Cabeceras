
package com.emergentesII;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author taery
 */
@WebServlet(name = "RespJSON", urlPatterns = {"/RespJSON"})
public class RespJSON extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        //response.setHeader("Content-Disposition","attachmet;filename = empleados.json");
        PrintWriter out = response.getWriter();
        try{
            out.println("{\"empleados\":[");
            out.println("{\"nombre\":\"Bruno\":\"Apellido\":\"Diaz\":},");
            out.println("{\"nombre\":\"Juan Jose\":\"Apellido\":\"Paredes\":},");
            out.println("{\"nombre\":\"Dolores\":\"Apellido\":\"Fuentes\":},");
            out.println("]}");
        }finally{
            out.close();
            
        }
    }
}
