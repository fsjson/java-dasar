package com.latihan;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Main Method
        System.out.println("== Main Method ==");

        // int
        int[] arrayAngka1 = {2,3,5,1,12,7,60,6,8,9};
        int[] arrayAngka2 = {0,4,3,2,1,5,9,8,7,4};

        // double
        double[] arrayAngka3 = {91,901,-1,0,13,88,19};

        // sorting reverse, mengurutkan tapi kebalik
        printArray(arrayAngka1, "array 1");
        reverse1(arrayAngka1);
        printArray(arrayAngka1, "reverse 1");

        printArray(arrayAngka2, "array 2");
        reverse2(arrayAngka2);
        printArray(arrayAngka2, "reverse 2");

        printArray2(arrayAngka3,"array 3");
        reverse_3(arrayAngka3);
        printArray2(arrayAngka3, "reverse ke-3");

    }

    // print array Int Method
    private static void printArray(int[] data, String message){
        System.out.println(message + " = " + Arrays.toString(data));
    }

    // print array double Method
    private static void printArray2(double[] data, String message){
        System.out.println(message + " = " + Arrays.toString(data));
    }

    // reverse 3 sort double array (MANUAL)
    private static void reverse_3(double[] dataArray) {

        // 1. sort array
        // pake --> algoritma: bubble sort
        for (int i = 0; i<dataArray.length; i++) {
            for (int j = 0; j<dataArray.length - 1; j++) {
                if (dataArray[j] > dataArray[j+1]) {
                    // swap
                    double temp        = dataArray[j];
                    dataArray[j]      = dataArray[j+1];
                    dataArray[j+1]    = temp;
                }
            }
        }

        // tampilkan hasil sorting
        System.out.print("Hasil, setelah sorting: ");
        for (double i : dataArray) {
            System.out.print(i + " ");
        }

        System.out.println();

        // 3. sort reverse
        for (int i = 0; i < dataArray.length/2; i++) {
            double temp = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length-1) - i];
            dataArray[(dataArray.length-1) -i] = temp;
        }

    }


    // reverse 2 Int sort array
    private static void reverse2(int[] dataArray){
        Arrays.sort(dataArray);
        int buffer;

        for (int i = 0; i < dataArray.length/2 ; i++){
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[(dataArray.length - 1) - i] = buffer;
        }
    }

    // reverse 1 Int sort array
    private static void reverse1(int[] dataArray){
        Arrays.sort(dataArray);
        int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);

        for (int i = 0; i < dataArray.length; i++){
            dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
    }
}
