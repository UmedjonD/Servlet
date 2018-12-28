package servlets;

import repository.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    UserRepository userRepository = new UserRepository();

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String login = req.getParameter("firstname");
        String password = req.getParameter("password");

        if (login.equals("user") && password.equals("1234")) {
            req.setAttribute("user",login);
            req.getRequestDispatcher("product").forward(req, resp);
        } else {
            System.out.println("error 1000");
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
