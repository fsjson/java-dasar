package com.latihan;

public class Main {
    public static void main(String[] args){

//        System.out.println("Ini adalah err-message try-catch");
        tryExceptions();

//        System.out.println("Ini adalah err-message Finally");
        Finally();

//        System.out.println("Ini adalah err-message Throw-Statement");
        throw_Statement(17);

    }

    // Ini adalah Contoh Program TRY-CATCH,
    private static void tryExceptions() {


        try {
            //  Block of code to try
            // Block dari Barisan kode untuk mencoba. apakah terdapat error/kesalahan atau tidak?

            // Program

            int[] myNumbers = new int[5];
            int cecking = myNumbers[10];
            System.out.println(cecking); // maka akan error

        }
        catch(Exception exceptionsMessage) {
            //  Block of code to handle errors
            // block dari code untuk meng-Handle/mengatasi sebuah error jika terjadi.

            // The program

            System.err.println("Something went wrong.");
        }
    }


    // Ini adalah contoh program FINALLY

    // The Finally statement lets you execute code, after try...catch
    // Finally Statement memperbolahkan/mengizinkan anda mengeksekusi kode program, setelah try...catch statement.
    private static void Finally(){


        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.err.println(e); // memanggil terdapat error apa dalam sebuah variable e --> message exceptions
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }


    // ini adalah contoh program Throw statement

    // The throw statement allows you to create a custom error.
    // Throw Statement mengizinkan anda untuk membuat sebuah Kustom error.

    // The throw statement is used together with an exception type.
    // There are many exception types
    // available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException,
    // SecurityException, etc:
    private static void throw_Statement(int age) {

        // contoh program mengecek umur:

        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }



    }

}
