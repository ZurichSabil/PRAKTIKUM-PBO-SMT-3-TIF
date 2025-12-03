package ManajemenTravelWisata.controller;

import ManajemenTravelWisata.Manager;
import ManajemenTravelWisata.PaketWisata;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PaketServlet", urlPatterns = {"/paket"})
public class PaketServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<PaketWisata> daftar = Manager.loadPaket("data_paket.dat");
        request.setAttribute("paketList", daftar);
        request.getRequestDispatcher("paket.jsp").forward(request, response);
    }
}
