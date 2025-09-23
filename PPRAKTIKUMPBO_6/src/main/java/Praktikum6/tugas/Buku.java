package Praktikum6.tugas;

public class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        // 10% discount for books
        return getHarga() * 0.9;
    }
}