/*
Andrew Estrada
Module 6.2
CSD-420
10/18/26
 */

import java.util.Arrays;
import java.util.Comparator;


public class Mod_6_2{

    //comparable example method
    public static <T extends Comparable<T>> void comparableSort(T[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
        }

    //comparator example method
    public static <T> void comparatorSort(T[] array, Comparator<? super T> comparator) {
        Arrays.sort(array, comparator);
    }

    public static void main(String[] args) {

        //Arrays for comparable example
        Integer [] numbers = {6, 2, 9, 5, 1, 8, 7, 10, 3, 4};

        String [] colors = {"red", "blue", "green", "yellow", "orange", "white", "black", "purple", "brown", "pink"};

        //Arrays for comparator example
        Integer [] numbers2 = {6, 2, 9, 5, 1, 8, 7, 10, 3, 4};

        String [] colors2 = {"red", "blue", "green", "yellow", "orange", "white", "black", "purple", "brown", "pink"};

        //Comparable execution
        System.out.println("");
        System.out.println("Comparable example:");
        System.out.println("");
        System.out.println("Original array: " + Arrays.toString(colors));
        comparableSort(colors);
        System.out.println("Array sorted by alphabet: " + Arrays.toString(colors));
        System.out.println("");
        System.out.println("Original array: " + Arrays.toString(numbers));
        comparableSort(numbers);
        System.out.println("Array sorted by value: " + Arrays.toString(numbers));
        System.out.println("\n");

        //Comparator execution
        System.out.println("\n");
        System.out.println("Comparator example:");
        System.out.println("");
        System.out.println("Original array: " + Arrays.toString(colors2));
        comparatorSort(colors2, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("Array sorted by letter count: " + Arrays.toString(colors2));
        System.out.println("");
        System.out.println("Original array: " + Arrays.toString(numbers2));
        comparatorSort(numbers2, (n1, n2) -> Integer.compare (n2, n1));
        System.out.println("Array sorted by reverse value: " + Arrays.toString(numbers2));
        System.out.println("\n");
    }
}