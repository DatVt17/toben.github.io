/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.accountDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class createAccount extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet createAccount</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet createAccount at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String account = request.getParameter("username");
        String password = request.getParameter("password");
        String rePassword = request.getParameter("repassword");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String birthday = request.getParameter("birthday");
        accountDao dao = new accountDao();
        Validation validation = new Validation();
        String gender1 = validation.checkGender(gender);
        if (!validation.checkUserName(account)) {
            request.setAttribute("wrongUser", "Accounts not be blank, request from 8-16 character");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        } else if (!validation.checkPassword(password)) {
            request.setAttribute("wrongPassword", "Password not be blank, request from 8-16 character");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        } else if (!validation.checkEmail(email)) {
            request.setAttribute("wrongEmail", "Email not be blank, request from 8-16 character");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        } else if (!validation.checkDuplicatPassword(password, rePassword)) {
            request.setAttribute("wrongDuplicatePassword", "Import password not precision");
            response.sendRedirect("signup.jsp");
        } else {
            dao.createStudent(account, password, email, gender1, birthday);
            response.sendRedirect("login.jsp");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
