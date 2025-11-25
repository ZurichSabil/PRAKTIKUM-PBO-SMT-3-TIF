package praktikum12;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileIOPractice {
    public static void main(String[] args) {

        String filePath = "data.txt";
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Belajar File I/O di Java!\n");
            writer.write("Pemrograman Berorientasi Objek.\n");
            System.out.println("Data berhasil ditulis ke file: " + filePath);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file.");
            e.printStackTrace();
        }
        try (FileReader reader = new FileReader(filePath)) {
            int c;
            System.out.println("\nIsi file:");
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file.");
            e.printStackTrace();
        }
    }
}
