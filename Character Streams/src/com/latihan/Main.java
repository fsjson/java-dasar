package com.latihan;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.PrintWriter;


public class Main {

    public static void main(String[] args) throws IOException{

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("xanadu.txt");
            outputStream = new FileWriter("characteroutput.txt");

            int data;
            System.out.print("Isi File:\n");
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);

                System.out.print((char) data);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }


        // another example:

        BufferedReader in = null;
        PrintWriter out = null;

        try {
            in = new BufferedReader(new FileReader("xanadu.txt"));
            out = new PrintWriter(new FileWriter("characteroutput.txt"));

            String l;
            while ((l = in.readLine()) != null) {
                out.println(l);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }


    }

}
