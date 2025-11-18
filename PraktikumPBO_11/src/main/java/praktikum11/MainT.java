package praktikum11;

public class MainT {
    public static void main(String[] args) {

        Pengarang pengarang1 = new Pengarang("Tere Liye");
        Pengarang pengarang2 = new Pengarang("Pramoedya Ananta Toer");

        Buku1 buku1 = new Buku1("Pulang", pengarang1);
        Buku1 buku2 = new Buku1("Bumi Manusia", pengarang2);

        Perpustakaan1 perpustakaan = new Perpustakaan1();

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        System.out.println("\n--- Informasi Perpustakaan ---");
        perpustakaan.tampilkanBuku();
    }
}
