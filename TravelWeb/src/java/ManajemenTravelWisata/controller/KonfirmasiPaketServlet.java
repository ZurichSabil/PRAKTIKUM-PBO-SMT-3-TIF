package ManajemenTravelWisata.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/konfirmasi-paket")
public class KonfirmasiPaketServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String jenisPaket = request.getParameter("jenisPaket");
        String paket = request.getParameter("paket");
        String jumlahStr = request.getParameter("jumlah");

        int jumlah = 0;
        if (jumlahStr != null && !jumlahStr.isEmpty()) {
            jumlah = Integer.parseInt(jumlahStr);
        }

        int harga = jenisPaket.equals("domestik") ? 2500000 : 7500000;
        int total = harga * jumlah;

        out.println("<html><head><title>Konfirmasi</title>");
        out.println("<style>");
        out.println("body{font-family:Arial;background:#f0f3f7;margin:0;padding:0;}");
        out.println(".container{width:420px;margin:60px auto;background:white;padding:30px;border-radius:10px;box-shadow:0 0 15px #00000020;}");
        out.println("h2{text-align:center;color:#2c3e50;margin-bottom:25px;}");
        out.println("label{font-weight:bold;}");
        out.println("button{width:100%;padding:12px;background:#3498db;color:white;border:none;border-radius:6px;font-size:17px;font-weight:bold;cursor:pointer;}");
        out.println("</style>");
        out.println("</head><body>");
        out.println("<div class='container'>");
        out.println("<h2>Konfirmasi Paket</h2>");
        out.println("<p><b>Jenis Paket:</b> " + jenisPaket + "</p>");
        out.println("<p><b>Paket Dipilih:</b> " + paket + "</p>");
        out.println("<p><b>Jumlah Orang:</b> " + jumlah + "</p>");
        out.println("<p><b>Total Harga:</b> Rp " + total + "</p>");
        out.println("<form action='metode-pembayaran' method='POST'>");
        out.println("<input type='hidden' name='jenisPaket' value='" + jenisPaket + "'>");
        out.println("<input type='hidden' name='paket' value='" + paket + "'>");
        out.println("<input type='hidden' name='jumlah' value='" + jumlah + "'>");
        out.println("<input type='hidden' name='total' value='" + total + "'>");
        out.println("<button type='submit'>Lanjut ke Pembayaran</button>");
        out.println("</form>");
        out.println("</div></body></html>");
    }
}
