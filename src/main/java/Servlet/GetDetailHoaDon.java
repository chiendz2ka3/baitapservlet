package Servlet;

import DAO.Resovle.DetailIplm;
import Entities.ChitietThanhToanVaoEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "GetDetailHoaDon", value = "/GetDetailHoaDon-servlet")
public class GetDetailHoaDon extends HttpServlet {
    int idloaihang=0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        int id = Integer.parseInt(req.getParameter("sid"));
        idloaihang = id;
        DetailIplm detail = new DetailIplm();
        System.out.println("da logoooo: "+ id);
        List<ChitietThanhToanVaoEntity> list = new ArrayList<>();
        list = detail.ListDetailWithid(id);
        float dongia=0;
        for (ChitietThanhToanVaoEntity item: list) {
            dongia +=item.getFsoluongNhap()*item.getGiaban();
        }
        System.out.println("count: "+ list.size());
        req.setAttribute("Giaban", dongia);
        req.setAttribute("list", list);
        req.getRequestDispatcher("View/ShowDetail.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doPost(req, resp);
        if(idloaihang!=0){
            DetailIplm detail = new DetailIplm();
            boolean Check = detail.ThanhToan(idloaihang);
            if (Check) resp.sendRedirect("ListNhacungcap-servlet");
            else resp.sendRedirect("GetDetailHoaDon-servlet");
        }
    }
}
