package ManajemenTravelWisata.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/selesai")
public class SelesaiServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String metode = request.getParameter("metode");
        int total = Integer.parseInt(request.getParameter("total"));

        out.println("<html><head><title>Pembayaran Selesai</title>");
        out.println("<style>");
        out.println("body{font-family:Arial;background:#f0f3f7;margin:0;padding:0;}");
        out.println(".container{width:420px;margin:60px auto;background:white;padding:30px;border-radius:10px;box-shadow:0 0 15px #00000020;}");
        out.println("h2{text-align:center;color:#2c3e50;margin-bottom:25px;}");
        out.println("p{font-size:16px;margin:8px 0;}");
        out.println("a{display:block;width:100%;text-align:center;margin-top:20px;padding:12px;background:#3498db;color:white;text-decoration:none;border-radius:6px;font-weight:bold;}");
        out.println("</style>");
        out.println("</head><body>");
        out.println("<div class='container'>");
        out.println("<h2>Pembayaran Selesai</h2>");

        if ("bank".equals(metode)) {
            String bank = request.getParameter("bank");
            String norek = request.getParameter("norek");
            out.println("<p>Metode Pembayaran: <b>Bank</b></p>");
            out.println("<p>Bank: <b>" + bank + "</b></p>");
            out.println("<p>No Rekening: <b>" + norek + "</b></p>");
            out.println("<p>Total Pembayaran: <b>Rp " + total + "</b></p>");
        } else if ("ewallet".equals(metode)) {
            String wallet = request.getParameter("wallet");
            String nohp = request.getParameter("nohp");
            out.println("<p>Metode Pembayaran: <b>E-Wallet</b></p>");
            out.println("<p>E-Wallet: <b>" + wallet + "</b></p>");
            out.println("<p>No HP: <b>" + nohp + "</b></p>");
            out.println("<p>Total Pembayaran: <b>Rp " + total + "</b></p>");
        } else {
            out.println("<p>Metode pembayaran tidak valid!</p>");
        }

        out.println("<a href='index.html'>Kembali ke Beranda</a>");
        out.println("</div></body></html>");
    }
}
