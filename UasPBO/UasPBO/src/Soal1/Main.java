/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Soal1;

/**
 *
 * @author Kelompok 4
 * Bagus Dzakiy Rahman Saputra - 22104410033
 * Ines Rahayu Tyas - 22104410049
 * Muhamad Gus Amix Kusuma - 22104410054
 * Jihan Khansa Nadhila - 22104410055
 * Alfian Anwar Shodiqi - 22104410065
 * Teknik Informatika - Univ.Islam Balitar
 */
public class Main implements Pajak{
    
    public String vendor;
    public String tipe;
    public double harga;

    public Main(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }


    @Override
    public double hargaSetelahPpn(double harga) {
        if (harga > 4500000) {
            return harga + (harga * 0.05); // PPN 5%
        } else if (harga >= 4200000) {
            return harga + (harga * 0.02); // PPN 2%
        } else if (harga > 4000000) {
            return harga + (harga * 0.01); // PPN 1%
        } else {
            return harga; // Tidak ada PPN
        }
    }

    public static void main(String[] args) {
        Main barang1 = new Main("Samsung", "A51", 5000000);
        Main barang2 = new Main("Oppo", "Reno 5", 4400000);
        Main barang3 = new Main("Xiaomi", "A1", 4100000);

        double hargaSetelahPPN1 = barang1.hargaSetelahPpn(barang1.harga);
        double hargaSetelahPPN2 = barang2.hargaSetelahPpn(barang2.harga);
        double hargaSetelahPPN3 = barang3.hargaSetelahPpn(barang3.harga);

        System.out.println("++========================================================++");
        System.out.println("||           TABEL HARGA SMARTPHONE SETELAH PPN           ||");
        System.out.println("++========================================================++");
        System.out.println("|| Vendor   | Type    | Harga         | Harga Setelah PPN ||");
        System.out.println("++==========+=========+===============+===================++");
        System.out.println("|| " + barang1.vendor + "  | " + barang1.tipe + "     | " + "Rp." + barang1.harga + "  | Rp."+ hargaSetelahPPN1 + "      ||");
        System.out.println("|| " + barang2.vendor + "     | " + barang2.tipe + "  | " + "Rp." + barang2.harga + "  | Rp."+ hargaSetelahPPN2 + "      ||");
        System.out.println("|| " + barang3.vendor + "   | " + barang3.tipe + "      | " + "Rp." + barang3.harga + "  | Rp."+ hargaSetelahPPN3 + "      ||");
        System.out.println("++==========+=========+===============+===================++");
    }

    
}
