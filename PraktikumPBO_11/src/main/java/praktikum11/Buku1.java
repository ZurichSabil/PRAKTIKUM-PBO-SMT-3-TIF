package praktikum11;

public class Buku1 {
    private String judul;
    private Pengarang pengarang; 

    public Buku1(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
        pengarang.infoPengarang();
    }
}