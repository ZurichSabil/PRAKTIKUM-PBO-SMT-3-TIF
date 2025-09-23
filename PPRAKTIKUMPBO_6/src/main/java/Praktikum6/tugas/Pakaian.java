package Praktikum6.tugas;

public class Pakaian extends Produk {
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        // 15% discount for clothing
        return getHarga() * 0.85;
    }
}