package Praktikum6.tugas;


public class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        // 20% discount for electronics
        return getHarga() * 0.8;
    }
}