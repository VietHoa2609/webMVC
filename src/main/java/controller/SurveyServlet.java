package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Survey;

@WebServlet(name = "SurveyServlet", urlPatterns = {"/survey"})
public class SurveyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // về trang form
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String firstName = req.getParameter("firstName");
        String lastName  = req.getParameter("lastName");
        String email     = req.getParameter("email");
        String dob       = req.getParameter("dob");
        String heardFrom = req.getParameter("heardFrom");
        boolean receive  = req.getParameter("receive") != null;   // checkbox
        boolean emailAnn = req.getParameter("emailAnn") != null;  // checkbox
        String contact   = req.getParameter("contact");

        Survey survey = new Survey(firstName, lastName, email, dob,
                                   heardFrom, receive, emailAnn, contact);

        req.setAttribute("survey", survey);
        req.getRequestDispatcher("/thanks.jsp").forward(req, resp);
    }
}
