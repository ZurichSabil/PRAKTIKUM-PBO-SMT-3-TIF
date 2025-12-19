package model;

import java.io.Serializable;

public class Anggota implements Serializable {

    private String idAnggota;
    private String nama;

    public Anggota(String idAnggota, String nama) {
        this.idAnggota = idAnggota;
        this.nama = nama;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return idAnggota + " - " + nama;
    }
}
