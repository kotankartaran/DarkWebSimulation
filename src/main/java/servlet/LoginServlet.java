package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.UUID;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import dao.DBConnection;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String role = request.getParameter("role");

        String username = "user_" + UUID.randomUUID().toString().substring(0, 5);
        String sessionId = UUID.randomUUID().toString();

        try {
            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO users (username, role, session_id) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, username);
            ps.setString(2, role);
            ps.setString(3, sessionId);

            ps.executeUpdate();

            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("role", role);

            if ("admin".equals(role)) {
                response.sendRedirect("adminDashboard.jsp");
            } else {
                response.sendRedirect("hiddenPage.jsp");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}