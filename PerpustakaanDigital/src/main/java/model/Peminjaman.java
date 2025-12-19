package model;

import Service.PeminjamanAble;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Peminjaman implements Serializable, PeminjamanAble {

    private Anggota anggota;
    private List<Buku> daftarBuku;

    private LocalDate tanggalPinjam;
    private LocalDate tanggalKembali;

    public Peminjaman(Anggota anggota, List<Buku> daftarBuku, LocalDate tanggalPinjam) {
        this.anggota = anggota;
        this.daftarBuku = daftarBuku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalPinjam.plusDays(14);
    }

    @Override
    public void pinjam() {
        System.out.println("Peminjaman oleh : " + anggota.getNama());
        System.out.println("Tanggal Pinjam : " + tanggalPinjam);
        System.out.println("Batas Kembali  : " + tanggalKembali);
        System.out.println("Jumlah Buku   : " + daftarBuku.size());
    }

    @Override
    public void kembali() {
        System.out.println("Buku telah dikembalikan");
    }
}
