/*
Andrew Estrada
CSD-420
9/19/26
*/

import java.util.Arrays;
import java.util.Random;
import java.io.*;

public class Mod2_2_Writer {
    public static void main(String[] args) throws IOException {

        //Create integer array, fill with 5 random numbers, then print 
        int[] intArray = new int[5];

        Random intRand = new Random();

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = intRand.nextInt(100);
        }

        System.out.println(Arrays.toString(intArray));



        //Create double array, fill with 5 random numbers, then print
        double[] doubArray = new double[5];

        Random doubRand = new Random();

        for (int i = 0; i < doubArray.length; i++) {
            doubArray[i] = doubRand.nextDouble(100);
        }

        System.out.println(Arrays.toString(doubArray));



        //Create file and add both arrays to the file. If the file is already created, append data instead
        try (PrintWriter output =
            new PrintWriter(new FileOutputStream("estradadatafile.dat", true))) {

                output.println(Arrays.toString(intArray));
            }

        try (PrintWriter output =
            new PrintWriter(new FileOutputStream("estradadatafile.dat", true))) {

                output.println(Arrays.toString(doubArray));
            }
    }
}