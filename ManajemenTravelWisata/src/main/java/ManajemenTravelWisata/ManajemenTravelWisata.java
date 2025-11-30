package ManajemenTravelWisata;

import java.util.Scanner;

public class ManajemenTravelWisata {

    private static String inputString(Scanner sc, String label) {
        while (true) {
            System.out.print(label);
            String txt = sc.nextLine().trim();
            if (!txt.isEmpty()) return txt;
            System.out.println("Input tidak boleh kosong!\n");
        }
    }

    private static int inputInt(Scanner sc, String label, int min, int max) {
        while (true) {
            System.out.print(label);
            String txt = sc.nextLine().trim();
            try {
                int angka = Integer.parseInt(txt);
                if (angka < min || angka > max) {
                    System.out.println("Masukkan angka antara " + min + " - " + max + ".\n");
                    continue;
                }
                return angka;
            } catch (NumberFormatException e) {
                System.out.println("Harus berupa angka!\n");
            }
        }
    }

    private static String inputAngka(Scanner sc, String label) {
        while (true) {
            System.out.print(label);
            String txt = sc.nextLine().trim();
            if (txt.matches("\\d+")) return txt;
            System.out.println("Hanya boleh angka!\n");
        }
    }

    private static String inputEmail(Scanner sc) {
        while (true) {
            System.out.print("Email          : ");
            String email = sc.nextLine().trim();
            if (email.contains("@") && email.contains(".")) return email;
            System.out.println("Format email tidak valid!\n");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("---- SISTEM PEMESANAN TRAVEL ----\n");

        String nama = inputString(input, "Nama Pelanggan : ");
        String email = inputEmail(input);
        String hp = inputAngka(input, "No. HP         : ");

        Pelanggan pelanggan = new Pelanggan("C01", nama, email, hp);

        System.out.println("\nPilih Jenis Paket:");
        System.out.println("1. Domestik");
        System.out.println("2. Internasional");

        int pilihJenis = inputInt(input, "Pilihan: ", 1, 2);

        PaketWisata paket = null;

        if (pilihJenis == 1) {
            System.out.println("\n--- Paket Domestik ---");
            System.out.println("1. Bali");
            System.out.println("2. Solo");
            System.out.println("3. Yogyakarta");
            System.out.println("4. Raja Ampat");
            System.out.println("5. Sumba");

            int pilih = inputInt(input, "Pilih: ", 1, 5);

            switch (pilih) {
                case 1 -> paket = new PaketDomestik("D01", "Bali Eksotis", 4500000, 4, 20, "Bali", true);
                case 2 -> paket = new PaketDomestik("D02", "Solo Heritage", 2500000, 3, 15, "Solo", false);
                case 3 -> paket = new PaketDomestik("D03", "Yogyakarta Culture", 3000000, 4, 20, "Yogyakarta", false);
                case 4 -> paket = new PaketDomestik("D04", "Raja Ampat Diving", 15000000, 5, 10, "Raja Ampat", true);
                case 5 -> paket = new PaketDomestik("D05", "Sumba Adventure", 8000000, 5, 12, "Sumba", false);
            }
        }

        else {
            System.out.println("\n--- Paket Internasional ---");
            System.out.println("1. Seoul");
            System.out.println("2. Zurich");
            System.out.println("3. Aachen");
            System.out.println("4. Tokyo");
            System.out.println("5. Manchester");

            int pilih = inputInt(input, "Pilih: ", 1, 5);

            switch (pilih) {
                case 1 -> paket = new PaketInternasional("I01", "Paket Seoul", 12000000, 5, 15, "Korea Selatan", true);
                case 2 -> paket = new PaketInternasional("I02", "Paket Zurich", 22000000, 6, 10, "Swiss", true);
                case 3 -> paket = new PaketInternasional("I03", "Paket Aachen", 18000000, 6, 10, "Jerman", false);
                case 4 -> paket = new PaketInternasional("I04", "Paket Tokyo", 20000000, 5, 12, "Jepang", true);
                case 5 -> paket = new PaketInternasional("I05", "Paket Manchester", 25000000, 6, 12, "Inggris", true);
            }
        }

        int jumlahOrang = inputInt(input, "\nJumlah Orang: ", 1, 100);

        Pemesanan pesanan = pelanggan.buatPemesanan(paket, jumlahOrang);
        System.out.println("\n=== PILIH METODE PEMBAYARAN ===");
        System.out.println("1. Transfer Bank");
        System.out.println("2. E-Wallet");

        int metode = inputInt(input, "Pilih: ", 1, 2);

        MetodePembayaran pembayaranMetode;

        if (metode == 1) {
            System.out.println("\n--- BANK TERSEDIA ---");
            System.out.println("1. Panasdalam Bank");
            System.out.println("2. Optik Bank");
            System.out.println("3. IRB Bank");

            int pilihBank = inputInt(input, "Pilih bank: ", 1, 3);

            String bankName =
                    (pilihBank == 1) ? "Panasdalam Bank" :
                    (pilihBank == 2) ? "Optik Bank" :
                                       "IRB Bank";

            String norek = inputAngka(input, "Masukkan Nomor Rekening: ");

            pembayaranMetode = new TransferBank(bankName, norek);
        }
        else {
            System.out.println("\n--- E-WALLET TERSEDIA ---");
            System.out.println("1. AnadPay");
            System.out.println("2. SinaPay");

            int pilihW = inputInt(input, "Pilih e-wallet: ", 1, 2);

            String walletName = (pilihW == 1) ? "AnadPay" : "SinaPay";

            String akun = inputAngka(input, "Masukkan Nomor Akun: ");

            pembayaranMetode = new EWallet(walletName, akun);
        }

        Pembayaran pembayaran = new Pembayaran(pesanan, pembayaranMetode);
        pembayaran.lakukanPembayaran();

        System.out.println("\nPembayaran selesai!");
        System.out.println("Status: " + pembayaran.getStatus());
    }
}
