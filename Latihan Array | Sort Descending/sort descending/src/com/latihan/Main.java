package com.latihan;
public class Main {
    // Main Method
    public static void main(String[] args) {
        System.out.println("==Buat Program: sort descending==");

        // array variable
        int[] angka = {2, 9, -7, 10, 5};

        // tampilkan sebelum-Nya
        System.out.print("Before sorting    : ");
        for (int value : angka) {
            System.out.print(value + " ");
        }

        System.out.println();

        // algorithm: selection sort
        for (int i = 0; i < angka.length -1; i++) {
            // mencari index/bilangan terbesar untuk diurutkan.
            int max_idx = i; // variable max_idx-> adalah variable untuk menyimpan index/bilangan/urutan yang terbesar.
                            // atau terkecil .
            for (int j = i+1; j < angka.length; j++) {
                if (angka[j] > angka[max_idx]) {
                    max_idx = j;
                }
            }
            
            // Swap
            int temp = angka[max_idx];
            angka[max_idx] = angka[i];
            angka[i] = temp;

        }

        // tampilkan hasil-Nya
        System.out.print("after sorting     : ");
        for (int value : angka) {
            System.out.print(value + " ");
        }
    }
}
