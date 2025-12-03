<%@ page import="ManajemenTravelWisata.PaketWisata" %>
<%@ page import="java.util.List" %>

<%
    List<PaketWisata> paketList = (List<PaketWisata>) request.getAttribute("paketList");
%>

<h2>Daftar Paket Wisata</h2>

<table border="1" cellpadding="8">
    <tr>
        <th>ID Paket</th>
        <th>Nama Paket</th>
        <th>Harga</th>
        <th>Durasi (hari)</th>
        <th>Kuota</th>
        <th>Aksi</th>
    </tr>

    <% if (paketList != null) {
           for (PaketWisata p : paketList) { %>
        <tr>
            <td><%= p.getIdPaket() %></td>
            <td><%= p.getNamaPaket() %></td>
            <td><%= p.getHarga() %></td>
            <td><%= p.getDurasi() %></td>
            <td><%= p.getKuota() %></td>
            <td>
                <a href="detail?id=<%= p.getIdPaket() %>">Detail</a> |
                <a href="edit?id=<%= p.getIdPaket() %>">Edit</a> |
                <a href="hapus?id=<%= p.getIdPaket() %>">Hapus</a>
            </td>
        </tr>
    <%   }
       }
    %>
</table>
