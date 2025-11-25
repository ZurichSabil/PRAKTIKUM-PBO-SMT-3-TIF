package praktikum12;

import java.io.Serializable;

public class Produk implements Serializable {

    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk +
                ", Harga: " + harga +
                ", Stok: " + stok);
    }

    @Override
    public String toString() {
        return namaProduk + " | " + harga + " | " + stok;
    }
}
