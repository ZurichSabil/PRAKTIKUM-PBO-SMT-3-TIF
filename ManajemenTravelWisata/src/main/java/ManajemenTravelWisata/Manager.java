package ManajemenTravelWisata;

import java.io.*;
import java.util.*;

public class Manager {
    public static void savePelanggan(List<Pelanggan> list, String file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(list);
        } catch (Exception e) {
            System.out.println("[GAGAL] Menyimpan data pelanggan: " + e.getMessage());
        }
    }

    public static List<Pelanggan> loadPelanggan(String file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Pelanggan>) ois.readObject();
        } catch (Exception e) {
            System.out.println("[INFO] Tidak dapat memuat data pelanggan: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public static void savePaket(List<PaketWisata> list, String file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(list);
        } catch (Exception e) {
            System.out.println("[GAGAL] Menyimpan data paket wisata: " + e.getMessage());
        }
    }

    public static List<PaketWisata> loadPaket(String file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<PaketWisata>) ois.readObject();
        } catch (Exception e) {
            System.out.println("[INFO] Tidak dapat memuat data paket wisata: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public static void savePemesanan(List<Pemesanan> list, String file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(list);
        } catch (Exception e) {
            System.out.println("[GAGAL] Menyimpan data pemesanan: " + e.getMessage());
        }
    }

    public static List<Pemesanan> loadPemesanan(String file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Pemesanan>) ois.readObject();
        } catch (Exception e) {
            System.out.println("[INFO] Tidak dapat memuat data pemesanan: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public static void saveAll(Object data, String file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(data);
        } catch (Exception e) {
            System.out.println("[GAGAL] Menyimpan objek: " + e.getMessage());
        }
    }

    public static Object loadAll(String file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return ois.readObject();
        } catch (Exception e) {
            System.out.println("[INFO] Tidak dapat memuat objek: " + e.getMessage());
            return null;
        }
    }
}
