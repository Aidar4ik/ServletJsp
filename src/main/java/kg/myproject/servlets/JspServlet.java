package kg.myproject.servlets;

import kg.myproject.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("temp-serv")
public class JspServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<User> users = new ArrayList<User>() {{
            add(new User("Aidar", "Kyrg", 24));
            add(new User("Mike", "Russ", 32));
            add(new User("Jone", "Engl", 41));
        }};

        req.setAttribute("users",users);
        getServletContext().getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
