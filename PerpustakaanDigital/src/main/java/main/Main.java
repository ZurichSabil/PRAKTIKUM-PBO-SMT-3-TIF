package main;

import model.*;
import Service.FileManager;
import exception.DataTidakValidException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Buku> daftarBuku = new ArrayList<>();
        List<Anggota> daftarAnggota = new ArrayList<>();
        System.out.println("====================================");
        System.out.println("   SELAMAT DATANG DI PERPUSTAKAAN");
        System.out.println("        PERPUSTAKAAN DIGITAL");
        System.out.println("------------------------------------");

        try {
            String idBuku;
            String judul;
            String penulis;
            while (true) {
                try {
                    System.out.print("ID Buku : ");
                    idBuku = input.nextLine();

                    if (idBuku.isEmpty())
                        throw new DataTidakValidException("ID Buku tidak boleh kosong");
                    if (!idBuku.matches("\\d+"))
                        throw new DataTidakValidException("ID Buku harus berupa angka");
                    break;
                } catch (DataTidakValidException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            while (true) {
                try {
                    System.out.print("Judul Buku: ");
                    judul = input.nextLine();

                    if (judul.isEmpty())
                        throw new DataTidakValidException("Judul buku tidak boleh kosong");

                    break;
                } catch (DataTidakValidException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            System.out.print("Penulis: ");
            penulis = input.nextLine();
            Buku buku = new Buku(idBuku, judul, penulis);
            daftarBuku.add(buku);
            String idAnggota;
            String nama;
            while (true) {
                try {
                    System.out.print("ID Anggota : ");
                    idAnggota = input.nextLine();
                    if (idAnggota.isEmpty())
                        throw new DataTidakValidException("ID Anggota tidak boleh kosong");
                    if (!idAnggota.matches("\\d+"))
                        throw new DataTidakValidException("ID Anggota harus berupa angka");
                    break;
                } catch (DataTidakValidException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            while (true) {
                try {
                    System.out.print("Nama Anggota: ");
                    nama = input.nextLine();

                    if (nama.isEmpty())
                        throw new DataTidakValidException("Nama anggota tidak boleh kosong");
                    break;
                } catch (DataTidakValidException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            Anggota anggota = new Anggota(idAnggota, nama);
            daftarAnggota.add(anggota);
            LocalDate tanggalPinjam = null;
            while (true) {
                try {
                    System.out.print("Tanggal Pinjam (YYYY-MM-DD): ");
                    String inputTanggal = input.nextLine();

                    if (inputTanggal.isEmpty())
                        throw new DataTidakValidException("Tanggal pinjam tidak boleh kosong");

                    tanggalPinjam = LocalDate.parse(inputTanggal);
                    break;

                } catch (Exception e) {
                    System.out.println("Error: Format tanggal harus YYYY-MM-DD");
                }
            }
            FileManager.simpan("buku.dat", daftarBuku);
            FileManager.simpan("anggota.dat", daftarAnggota);

            System.out.println("Data berhasil disimpan.");
            Peminjaman peminjaman =
                    new Peminjaman(anggota, daftarBuku, tanggalPinjam);
            peminjaman.pinjam();
            System.out.println("------------------------------------");
            System.out.println("Terima kasih telah menggunakan");
            System.out.println("Sistem Manajemen Perpustakaan Digital");
            System.out.println("====================================");

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan pada sistem.");
        }
    }
}
