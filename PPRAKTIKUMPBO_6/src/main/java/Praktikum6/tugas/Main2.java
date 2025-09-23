package Praktikum6.tugas;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Produk> produkList = new ArrayList<>();
        produkList.add(new Buku("Buku Teknologi Informasi", 100000));
        produkList.add(new Elektronik("Kulkas", 5000000));
        produkList.add(new Pakaian("Baju batik", 200000));

        KeranjangBelanja keranjang = new KeranjangBelanja(produkList);

        System.out.println("Keranjang Belanja:");
        keranjang.displayKeranjang();
    }
}
