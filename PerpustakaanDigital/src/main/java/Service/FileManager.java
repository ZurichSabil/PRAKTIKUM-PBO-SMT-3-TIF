package Service;

import java.io.*;
import java.util.List;

public class FileManager {

    public static <T> void simpan(String namaFile, List<T> data) {
        try (ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream(namaFile))) {
            oos.writeObject(data);
            System.out.println("Data berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data.");
        }
    }

    public static <T> List<T> baca(String namaFile) {
        try (ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream(namaFile))) {
            return (List<T>) ois.readObject();
        } catch (Exception e) {
            System.out.println("File belum ada / gagal dibaca.");
            return null;
        }
    }
}
