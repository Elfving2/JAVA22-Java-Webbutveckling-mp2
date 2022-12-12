package controller.uppgift2.controll;

import java.io.*;

import controller.uppgift2.model.Bean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/sessionServlet")
public class Servlet extends HttpServlet {

    public void init() {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String usernameOne = "sebbe";
        String passwordOne = "sebbe";

        String usernameTwo = "gabbe";
        String passwordTwo = "gabbe";

        boolean userOne = username.equals(usernameOne) && password.equals(passwordOne);
        boolean userTwo = username.equals(usernameTwo) && password.equals(passwordTwo);

        if(userOne || userTwo) {
            HttpSession httpSession = request.getSession();
            Bean bean = new Bean();
            bean.setUsername(username);
            httpSession.setAttribute("mySession", bean);
            httpSession.setMaxInactiveInterval(10);
            RequestDispatcher rd = request.getRequestDispatcher("user.jsp");
            rd.forward(request, response);
        } else {
            request.setAttribute("wrong", "Wrong username or password");
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher rd = request.getRequestDispatcher("user.jsp");
        rd.forward(request, response);
    }

    public void destroy() {
    }
}