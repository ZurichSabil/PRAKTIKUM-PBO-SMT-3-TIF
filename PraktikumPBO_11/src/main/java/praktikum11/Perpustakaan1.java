package praktikum11;
import java.util.ArrayList;
class Perpustakaan1 {
    private ArrayList<Buku1> daftarBuku;
    public Perpustakaan1() {
        daftarBuku = new ArrayList<>();
    }
    public void tambahBuku(Buku1 buku) {
        daftarBuku.add(buku);
    }
    public void tampilkanBuku() {
        for (Buku1 buku : daftarBuku) {
            buku.infoBuku(); 
        }
    }
}
