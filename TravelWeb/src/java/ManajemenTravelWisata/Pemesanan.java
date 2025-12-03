package ManajemenTravelWisata;

public class Pemesanan {

    private Pelanggan pelanggan;
    private PaketWisata paket;
    private int jumlahOrang;
    private double totalHarga;
    private String status;
    public Pemesanan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
        this.status = "PENDING";
    }
    public void tambahItem(PaketWisata paket, int jumlah) {
        this.paket = paket;
        this.jumlahOrang = jumlah;
        this.totalHarga = paket.getHarga() * jumlah;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public PaketWisata getPaket() {
        return paket;
    }

    public int getJumlahOrang() {
        return jumlahOrang;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
