package com.emergentesII;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "RespHtml", urlPatterns = {"/RespHtml"})
public class RespHtml extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/HTML");
        PrintWriter out = response.getWriter();
        try{
            out.println("<html>");
            out.println("<head>");
            out.println("<title>RESPUESTA HTML</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>HTML generado desde un servidor Servlet</h1>");
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
        
    } 

}
