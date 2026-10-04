/**
 * Andrew Estrada
 * CSD-420
 * 10/4/26
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Mod4_2_Part2 {

    //This is the code for 500,000 integers.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> firstList = new LinkedList<>();
        
        for (int i = 1; i <= 500000; i++) {
            firstList.add(i);
        }

        System.out.println("\n");
        System.out.println("Press Enter to execute iteration through 500,000 elements");

        scanner.nextLine();

        for (Integer num : firstList) {
            System.out.println(num);
        }

        System.out.println("");

        System.out.println("Press Enter to execute index return of 500,000th element");

        scanner.nextLine();

        Integer num2 = firstList.get(499999);
        System.out.println(num2);

        scanner.close();

        System.out.println("");
    }
}

//The iteration takes much longer than the getting method. Using the get method takes slightly more brain power because of the first element being index (0) instead of index (1).
//Because of the LinkedList using containers chained one in front of another, iteration is highly linear. Though the index number is always still known to the system.