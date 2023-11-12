package Controller;

import DAO.Resovle.SupplieimpDao;
import Model.NhacungcapEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListNhacungcap", value = "/ListNhacungcap-servlet")
public class ListNhacungcap extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        SupplieimpDao supplieimpDao = new SupplieimpDao();
        List<NhacungcapEntity> listsuppler = supplieimpDao.Listsupplier();
        System.out.println("count: "+ listsuppler.size());
        for (NhacungcapEntity data : listsuppler) {
            System.out.println(data.toString());
        }
        req.setAttribute("listsuppler" , listsuppler);
        req.getRequestDispatcher("View/dodsNhacungcap.jsp").forward(req,resp);
    }
}
