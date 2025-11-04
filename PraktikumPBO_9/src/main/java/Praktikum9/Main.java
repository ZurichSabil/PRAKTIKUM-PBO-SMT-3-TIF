package Praktikum9;

public class Main {

    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();

        mobil.info();
        mobil.berjalan();

        System.out.println();

        sepeda.info();
        sepeda.berjalan();
    }
}