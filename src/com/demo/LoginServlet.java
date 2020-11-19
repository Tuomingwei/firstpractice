package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.sql.rowset.serial.SerialException;

@WebServlet(name="LoginServlet",urlPatterns={"/login.do"})
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        if(username.equals(password)){
//        if("admin".equals(username)&& "admin".equals(password)){
//            out.println("登录成功！欢迎您， "+username);
            request.setAttribute("username", username);
            RequestDispatcher rd =
                    request.getRequestDispatcher("/welcome.jsp");
            rd.forward(request, response);
        }else{
//            out.println("对不起！您的用户名或密码不正确．");
            RequestDispatcher rd =
                    request.getRequestDispatcher("/login.jsp");
            rd.forward(request, response);
        }
        out.println("</body></html>");
    }
    public void doGet(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);

    }
}
