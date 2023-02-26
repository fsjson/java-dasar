package com.latihan;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;

        // Membuka file
        fileInput = new FileInputStream("input.txt");

        // Membaca file
        int data = fileInput.read();

        while (data != -1) {
            System.out.println((char) data);
            data = fileInput.read();
        }

        // Menutup File
        fileInput.close();


        // Salah satu contoh skenario program pembukaan file

        try {
            // Membuka File
            fileInput = new FileInputStream("input2.txt");
            fileOutput = new FileOutputStream("output2.txt");

            // Membaca File
            int buffer = fileInput.read();

            while (buffer != -1) {
                fileOutput.write(buffer);
                buffer = fileInput.read();
            }


        } finally {
            if (fileInput != null) {
                fileInput.close();
            }

            if (fileOutput != null) {
                fileInput.close();
            }
        }

        // yang terakhir (try with resources)


        try (
                FileInputStream in = new FileInputStream("input.txt");
                FileOutputStream out = new FileOutputStream("output.txt")
        ) {

            // Membaca file
            int data2 = in.read();

            while (data2 != -1) {
                out.write((char) data2);
                data2 = in.read();
            }
        }


        // contoh lainnya:

        System.out.printf("\n\nAnother File Stream Example:\n");

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
                System.out.print((char) c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

        // contoh lainnya :

        System.out.println("\n\nAnother Example:");
        FileInputStream input = null;
        FileOutputStream output = null;

        try {
            input = new FileInputStream("name.txt");
            output = new FileOutputStream("list.txt");
            int data3;

            while((data3 = input.read()) != -1) {
                output.write(data3);
                System.out.print((char) data3);
            }
        } finally {
            if (input != null)
                input.close();

            if (output != null)
                output.close();
        }

    }

}

