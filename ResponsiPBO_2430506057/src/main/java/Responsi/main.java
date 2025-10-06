package Responsi;

public class main {
    public static void main(String[] args) {
        Produk produk = new Makanan("Snack", 15000, "2023-12-30");
        Pegawai pegawai = new PegawaiKontrak("Sabil", 3000000, 12);

        produk.tampilkanInfo();
        System.out.println();
        pegawai.tampilkanInfo();
    }
}
