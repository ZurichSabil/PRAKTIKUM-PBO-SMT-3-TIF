package model;

public class Buku extends Koleksi {

    private String penulis;

    public Buku(String id, String judul, String penulis) {
        super(id, judul);
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }

    @Override
    public String info() {
        return "ID: " + id +
               ", Judul: " + judul +
               ", Penulis: " + penulis;
    }
}
