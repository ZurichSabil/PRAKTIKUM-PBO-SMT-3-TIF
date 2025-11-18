package praktikum11;

public class MainP {
    public static void main(String[] args) { 
        Buku buku1 = new Buku("Seni Memperkuat Diri");
        Buku buku2 = new Buku("Kode Python Ai Engineer");
        Buku buku3 = new Buku("Handal bersama Java");

        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1); 
        perpustakaan.tambahBuku(buku2); 
        perpustakaan.tambahBuku(buku3);

        System.out.println("Informasi Perpustakaan:");
        perpustakaan.infoPerpustakaan();

        Anggota anggota1 = new Anggota("Nabila");
        Anggota anggota2 = new Anggota("Wicaksono");
        Anggota anggota3 = new Anggota("Zuhdan");

        Klub klub = new Klub("TB Barokah ");
        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);
        klub.tambahAnggota(anggota3);

        System.out.println("\nInformasi Klub:");
        klub.infoKlub();
    }
}