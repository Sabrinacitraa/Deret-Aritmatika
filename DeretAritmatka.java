/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class DeretAritmatka {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai awal: ");
        int awal = input.nextInt();
        System.out.println("Masukkan nilai beda: ");
        int beda = input.nextInt();
        System.out.println("Masukkan nilai akhir: ");
        int sukuke = input.nextInt();
        System.out.println("Masukkan mau suku ke berapa? : ");
        int suku1 = input.nextInt();
        System.out.println("Masukkan mau suku sampai berapa?: ");
        int suku2 = input.nextInt();
        int u = awal;
        int s = awal;
        

        System.out.println("Deret aritmatikanya adalah");
        for (int i = 1; i <= sukuke; i++) {
                u = u + beda;
            if(i >= suku1 && i <= suku2){
                System.out.print(u+ ",");
                 s = s + u;
            }
           
        }
        s = s - u;
        System.out.println("jumlah = " + s);
    }
}
