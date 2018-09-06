/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Praktikum;

/**
 *
 * @author Taka
 */
public class praktikum1 {
            public static void main(String[] args) { 
        int a = 40;
        int b = 7;
        try {
            int x = a / b;
            System.out.println("Hasil: " + x); 
            int[] angka = {1, 2, 3, 4, 5}; 
            angka[24] = 72;
            
        }catch (Exception e) {
            System.out.println("Salah");
            System.out.println(e); 
        }
        System.out.println("Selesai");
    }
}
