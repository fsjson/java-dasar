package com.latihan;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Jika Memakai try-catch statement:

//            try {
//                FileInputStream fileInput = new FileInputStream("input.txt");
//            } catch (Exception e){
//                System.err.println(e);
//            }

        // Jika tidak memekai try-catch statement:

        FileInputStream fileInput = new FileInputStream("input.txt");

        System.out.println((char) fileInput.read());
        System.out.println((char) fileInput.read());
        System.out.println((char) fileInput.read());
        System.out.println((char) fileInput.read());
    }

}