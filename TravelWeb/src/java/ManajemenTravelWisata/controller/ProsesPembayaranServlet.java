package ManajemenTravelWisata.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/metode-pembayaran")
public class ProsesPembayaranServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String jenisPaket = request.getParameter("jenisPaket");
        String paket = request.getParameter("paket");
        int jumlah = Integer.parseInt(request.getParameter("jumlah"));
        int total = Integer.parseInt(request.getParameter("total"));
        String metode = request.getParameter("metode");

        out.println("<html><head><title>Metode Pembayaran</title>");
        out.println("<style>");
        out.println("body{font-family:Arial;background:#f0f3f7;margin:0;padding:0;}");
        out.println(".container{width:420px;margin:60px auto;background:white;padding:30px;border-radius:10px;box-shadow:0 0 15px #00000020;}");
        out.println("h2{text-align:center;color:#2c3e50;margin-bottom:25px;}");
        out.println("label{font-weight:bold;}");
        out.println("select, input[type=text]{width:100%;padding:10px;margin:5px 0 15px 0;border-radius:6px;border:1px solid #ccc;}");
        out.println("button{width:100%;padding:12px;background:#3498db;color:white;border:none;border-radius:6px;font-size:17px;font-weight:bold;cursor:pointer;}");
        out.println("</style>");
        out.println("</head><body>");
        out.println("<div class='container'>");
        out.println("<h2>Metode Pembayaran</h2>");
        out.println("<p><b>Jenis Paket:</b> " + jenisPaket + "</p>");
        out.println("<p><b>Paket Dipilih:</b> " + paket + "</p>");
        out.println("<p><b>Jumlah Orang:</b> " + jumlah + "</p>");
        out.println("<p><b>Total Bayar:</b> Rp " + total + "</p>");

        if (metode == null || metode.isEmpty()) {
            // Pilih metode
            out.println("<form action='metode-pembayaran' method='POST'>");
            out.println("<input type='hidden' name='jenisPaket' value='" + jenisPaket + "'>");
            out.println("<input type='hidden' name='paket' value='" + paket + "'>");
            out.println("<input type='hidden' name='jumlah' value='" + jumlah + "'>");
            out.println("<input type='hidden' name='total' value='" + total + "'>");
            out.println("<label>Pilih Metode Pembayaran:</label>");
            out.println("<select name='metode' required>");
            out.println("<option value='bank'>Bank</option>");
            out.println("<option value='ewallet'>E-Wallet</option>");
            out.println("</select><br>");
            out.println("<button type='submit'>Lanjut</button>");
            out.println("</form>");
        } else if (metode.equals("bank")) {
            out.println("<h3>--- Bank Tersedia ---</h3>");
            out.println("<form action='selesai' method='POST'>");
            out.println("<input type='hidden' name='metode' value='bank'>");
            out.println("<input type='hidden' name='total' value='" + total + "'>");
            out.println("<label>Pilih Bank:</label>");
            out.println("<select name='bank' required>");
            out.println("<option value='Panasdalam Bank'>Panasdalam Bank</option>");
            out.println("<option value='Optik Bank'>Optik Bank</option>");
            out.println("<option value='IRB Bank'>IRB Bank</option>");
            out.println("</select>");
            out.println("<label>Nomor Rekening:</label>");
            out.println("<input type='text' name='norek' required>");
            out.println("<button type='submit'>Bayar</button>");
            out.println("</form>");
        } else if (metode.equals("ewallet")) {
            out.println("<h3>--- E-Wallet Tersedia ---</h3>");
            out.println("<form action='selesai' method='POST'>");
            out.println("<input type='hidden' name='metode' value='ewallet'>");
            out.println("<input type='hidden' name='total' value='" + total + "'>");
            out.println("<label>Pilih E-Wallet:</label>");
            out.println("<select name='wallet' required>");
            out.println("<option value='Gopay'>Gopay</option>");
            out.println("<option value='OVO'>OVO</option>");
            out.println("<option value='Dana'>Dana</option>");
            out.println("</select>");
            out.println("<label>Nomor HP:</label>");
            out.println("<input type='text' name='nohp' required>");
            out.println("<button type='submit'>Bayar</button>");
            out.println("</form>");
        }

        out.println("</div></body></html>");
    }
}
