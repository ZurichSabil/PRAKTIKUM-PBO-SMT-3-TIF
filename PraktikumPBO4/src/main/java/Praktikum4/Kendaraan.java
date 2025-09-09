package Praktikum4;

public class Kendaraan {
    String nama;
    protected int kecepatanMaks;
    public String jenisMesin;

    // Constructor
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }

    // Getter dan Setter untuk menampilkan variabel private nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method public untuk menampilkan informasi Kendaraan
    public void tampilkanInfoKendaraan() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}