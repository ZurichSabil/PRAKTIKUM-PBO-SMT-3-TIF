package ManajemenTravelWisata;

public class Pembayaran {
    private Pemesanan pesanan;
    private MetodePembayaran metode;

    public Pembayaran(Pemesanan pesanan, MetodePembayaran metode) {
        this.pesanan = pesanan;
        this.metode = metode;
    }

    public void lakukanPembayaran() {
        metode.prosesPembayaran(pesanan.getTotalHarga());
        pesanan.setStatus("CONFIRMED");
    }

    public String getStatus() {
        return metode.getStatus();
    }
}
