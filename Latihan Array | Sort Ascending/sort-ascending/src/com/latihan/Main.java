package com.latihan;
import java.util.Scanner;
public class Main {
    // Main Method
    public static void main(String[] args){
        System.out.println("\n==Create an bubble sort | sort ascending==");

        // membuat variable input-an (scan)
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan jumlah angka yang ingin di-Urutkan: ");
        int getInput = scan.nextInt(); // --> variable getInt adalah variable user input Integer

        // membuat variable array yang mana dihasilkan dari inputan User
        int[] numbers = new int[getInput];

        // loop: input sebanyak --> 5 kali
        for (int i = 0; i<numbers.length; i++) {
            System.out.print("input nilai ke-" + i + ": ");
            numbers[i] = scan.nextInt();
        }

        // pake --> algoritma: bubble sort
        for (int i = 0; i<numbers.length; i++) {
            for (int j = 0; j<numbers.length - 1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    // swap
                    int temp        = numbers[j];   // variable temp ---> adalah sebagai variable Tampungan
                                                   // untuk menampung variable numbers[i] -> variable saat ini, dan
                                                  // variable numbers[j+1] -> variable selanjutnya
                    numbers[j]      = numbers[j+1];
                    numbers[j+1]    = temp;
                }
            }
        }

        // menampilkan hasil sortig
        System.out.print("Hasil Pengurutan angka    : ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
