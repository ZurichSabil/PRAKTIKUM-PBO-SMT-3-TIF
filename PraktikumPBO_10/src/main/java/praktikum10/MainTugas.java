/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum10;



public class MainTugas {
    public static void main(String[] args) {
        
        Pembayaran elektronik = new Elektronik();
        Pembayaran makanan = new Makanan();
        
        double hargaElektronik = 2000000; 
        double hargaMakanan = 50000; 
        
        System.out.println("Harga Elektronik: Rp" + hargaElektronik);
        System.out.println("Pajak Elektronik (10%): Rp" + elektronik.hitungPajak(hargaElektronik));
        
        System.out.println("\nHarga Makanan: Rp" + hargaMakanan);
        System.out.println("Pajak Makanan (5%): Rp" + makanan.hitungPajak(hargaMakanan));
    }
}
