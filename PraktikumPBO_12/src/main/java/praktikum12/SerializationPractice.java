package praktikum12;

import java.io.*;

public class SerializationPractice {
    public static void main(String[] args) {
        
        String filePath = "produk.ser";
        Produk produk = new Produk("Laptop", 1500000, 10);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(produk);
            System.out.println("Objek Produk berhasil disimpan ke file: " + filePath);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan objek.");
            e.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Produk p = (Produk) ois.readObject();
            System.out.println("\nObjek Produk berhasil dibaca dari file:");
            p.tampilkanInfo();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saat membaca objek.");
            e.printStackTrace();
        }
    }
}
