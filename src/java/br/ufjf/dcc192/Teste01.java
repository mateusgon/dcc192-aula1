package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello.html")
public class Teste01 extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("VAI CORINTHIANS! E HELLO WORLD! (Server)");
        PrintWriter out = resp.getWriter();
        out.println("<h1>VAI CORINTHIANS! E HELLO WORLD! (Client)</h1>");
    }
    
    
}
