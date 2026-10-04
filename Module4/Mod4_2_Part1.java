/**
 * Andrew Estrada
 * CSD-420
 * 10/4/26
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Mod4_2_Part1 {

    //This is the code for 50,000 integers

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> firstList = new LinkedList<>();
        
        for (int i = 1; i <= 50000; i++) {
            firstList.add(i);
        }

        System.out.println("\n");
        System.out.println("Press Enter to execute iteration through 50,000 elements");

        scanner.nextLine();

        for (Integer num : firstList) {
            System.out.println(num);
        }

        System.out.println("");

        System.out.println("Press Enter to execute index return of 50,000th element");

        scanner.nextLine();

        Integer num2 = firstList.get(49999);
        System.out.println(num2);

        scanner.close();

        System.out.println("");
    }
}

//Comments in part2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>