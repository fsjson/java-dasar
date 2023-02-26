package com.latihan;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("== Binary Search ==");

        // sort array

        System.out.println("\nsort array\n==============");
        int[] array = {1, 6, 23, 4, 5, 3, 5, 2, 6};

        sebelum(array);
        Arrays.sort(array);
        sesudah(array);

        // search array
        // binary search pake package Arrays

        System.out.println("\nsearch array\n==============");
        System.out.println(Arrays.toString(array));
        int angka = 23;
        int posisi = Arrays.binarySearch(array, angka);
        System.out.println("angka " + angka + " ada di index " + posisi);

        // Binary Search
        // pake algoritma

        System.out.println("\n== Binary Search Manual==");
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        System.out.println(Arrays.toString(arr));
        int key = 23;
        int result = binarySearch(arr, key);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element " + key + " found at index: " + result);

        // Second

        int[] larik =  {21,13,12,9,0,2,2,3,3,112,32,-19,9};
        sebelum(larik);
        Arrays.sort(larik);
        sebelum(larik);

        int num = 9;
        int hasil = binarySearchSecond(larik,num);
        if (hasil == -1) {
            System.out.println("elemen tidak ditemukan");
        } else
            System.out.println("Elemen " + num + " Ditemukan di-Index ke: " + hasil);


    }// End of main method






    private static void sebelum(int[] data) {
        System.out.println("Sebelum = " + Arrays.toString(data));
    }

    private static void sesudah(int[] data) {
        System.out.println("Sesudah = " + Arrays.toString(data));
    }

    // Binary Search Algorithm

    public static int binarySearch(int[] arr, int key) {
        int first = 0;
        int last = arr.length - 1;
        int mid = (first + last) / 2;

        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                return mid;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }

        return -1;
    }

    public static int binarySearchSecond(int[] larik, int num) {

        int low = 0;
        int high = larik.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;

            if (num == larik[mid]) {
               return mid;
            } else if (num < larik[mid]) {
                high = mid - 1;
            } else if (num > larik[mid]) {
                low = mid + 1;
            }
        }
        return -1;
    }


} // end of class Main

