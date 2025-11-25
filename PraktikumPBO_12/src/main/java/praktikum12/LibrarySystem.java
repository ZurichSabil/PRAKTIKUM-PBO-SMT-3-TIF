package praktikum12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySystem {

    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private static List<Buku> bukuList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n=== Menu Sistem Manajemen Buku ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Simpan ke File Teks (buku.txt)");
            System.out.println("3. Simpan Objek ke File Serial (buku.ser)");
            System.out.println("4. Tampilkan Buku dari File Teks");
            System.out.println("5. Tampilkan Buku dari File Serial");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            int pilih = scanner.nextInt();
            scanner.nextLine();

            switch (pilih) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerial();
                case 4 -> bacaDariFileTeks();
                case 5 -> bacaDariFileSerial();
                case 6 -> { System.out.println("Program selesai."); return; }
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void tambahBuku(Scanner scanner) {
        System.out.print("Judul: ");
        String judul = scanner.nextLine();

        System.out.print("Pengarang: ");
        String pengarang = scanner.nextLine();

        System.out.print("Tahun Terbit: ");
        int tahun = scanner.nextInt();

        bukuList.add(new Buku(judul, pengarang, tahun));
        System.out.println("Buku berhasil ditambahkan!");
    }

    private static void simpanKeFileTeks() {
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {

            for (Buku b : bukuList) {
                writer.write(b.toString() + "\n");
            }

            System.out.println("Data buku berhasil disimpan ke file teks.");
        } catch (IOException e) {
            System.out.println("Error saat menyimpan ke file teks.");
        }
    }

    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {

            oos.writeObject(bukuList);
            System.out.println("Objek buku berhasil disimpan ke file serial.");

        } catch (IOException e) {
            System.out.println("Error saat melakukan serialisasi.");
        }
    }

    private static void bacaDariFileTeks() {
        System.out.println("\n=== Data Buku dalam buku.txt ===");

        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Gagal membaca buku.txt");
        }
    }

    private static void bacaDariFileSerial() {
        System.out.println("\n=== Data Buku dalam buku.ser ===");

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {

            List<Buku> list = (List<Buku>) ois.readObject();
            for (Buku b : list) {
                b.tampilkanInfo();
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Gagal membaca file serial.");
        }
    }
}
