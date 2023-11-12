package Controller;

import DAO.Interface.UserLogin;
import DAO.Resovle.LoginDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "DangNhap", value = "/DangNhap-servlet")
public class DangNhap extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doGet(req, resp);
        System.out.println(" anh chien dep trai vcll");
        resp.setContentType("text/html");
        req.getRequestDispatcher("View/GDdangnhap.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doPost(req, resp);
        try {
            String username = req.getParameter("UserName");
            String password = req.getParameter("password");
            if(username.isEmpty() || password.isEmpty()) {
                resp.sendRedirect("DangNhap-servlet");
                return;
            }
            LoginDAO login = new LoginDAO();
            UserLogin data = new UserLogin(username , password);
            System.out.println(data.toString());
            boolean check = login.Loginuser(data);
            if(check) resp.sendRedirect("ManagerList-servlet");
            else  resp.sendRedirect("DangNhap-servlet");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
