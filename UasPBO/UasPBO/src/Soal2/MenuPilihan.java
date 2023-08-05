/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Soal2;

import java.util.Scanner;

/**
 *
 * @author Kelompok 4
 * Bagus Dzakiy Rahman Saputra - 22104410033
 * Ines Rahayu Tyas - 22104410049
 * Muhamad Gus Amix Kusuma - 22104410054
 * Jihan Khansa Nadhila - 22104410055
 * Alfian Anwar Shodiqi -  22104410065
 * Teknik Informatika - Univ.Islam Balitar
 */
public class MenuPilihan {
    
    public static void main(String[] args) {
        int a = 100;
        int b = 25;
        int hasil;
        
        System.out.println("++===========================++");
        System.out.println("||  SWITCH-CASE PERHITUNGAN  ||");
        System.out.println("++===========================++");
        System.out.println("||====== Menu Pilihan: ======||");
        System.out.println("|| 1. a + b                  ||");
        System.out.println("|| 2. a - b                  ||");
        System.out.println("++===========================++");
        System.out.println("Masukkan pilihan Anda : ");
        
        Scanner scanner = new Scanner(System.in);
        int pilihan = scanner.nextInt();
        
        switch (pilihan) {
            case 1:
                hasil = a + b;
                System.out.println("++===========================++");
                System.out.println("|| Hasil dari " + a + " + " + b + " = " + hasil + " ||");
                System.out.println("++===========================++");
                break;
                
            case 2:
                hasil = a - b;
                System.out.println("++===========================++");
                System.out.println("|| Hasil dari " + a + " - " + b + " = " + hasil + "  ||");
                System.out.println("++===========================++");
                break;
                
            default:
                System.out.println("++===========================++");
                System.out.println("||     Pilihan Anda Salah    ||");
                System.out.println("++===========================++");
        }
    }
}
