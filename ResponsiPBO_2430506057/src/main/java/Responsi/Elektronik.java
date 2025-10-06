package Responsi;

public class Elektronik extends Produk {
    private int garansi; 

    public Elektronik() {}

    public Elektronik(String namaProduk, int harga, int garansi) {
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    public int getGaransi() {
        return garansi;
    }
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }
   @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // panggil method dari Produk
        System.out.println("Garansi: " + garansi + " tahun");
    }
}
