/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package liveCode;

import java.util.Scanner;

/**
 *
 * @author Muhamad Gus Amix Kusuma
 * Teknik Informatika - Univ.Islam Balitar
 * 22104410054
 */

public class MainKinetic {
    public double M, V ;

    public double getM() {
        return M;
    }

    public void setM(double M) {
        this.M = M;
    }

    public double getV() {
        return V;
    }

    public void setV(double V) {
        this.V = V;
    }

    public double ek(){
    double hasil = 0.5 * M * Math.pow(V,2 );
    return hasil;
    
    }
   
    
    public static void main(String[] args) {
      MainKinetic kinetic = new MainKinetic();
      Scanner scanner = new Scanner(System.in);
      System.out.println(" Masukkan Massa sepeda (kg)");
      kinetic.setM(scanner.nextDouble());
     
      System.out.println("Masukkan Kecepatan Sepeda(m/s) : ");
      kinetic.setV(scanner.nextDouble());
     
    
      System.out.println("M : " + kinetic.getM()+ " kg ");
      System.out.println("V : " + kinetic.getV()+ " m/s ");
      System.out.println("hasil Energi Kinetic = " + kinetic.ek() + " Joule ");
    }
    
}


