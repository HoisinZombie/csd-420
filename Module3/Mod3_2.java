/**
 * Andrew Estrada
 * CSD-420
 * 9/27/26
 */

import java.util.ArrayList;
import java.util.Random;

public class Mod3_2 {

    //Create method that is passed the original list, iterates through to find duplicates, then adds every number to a new list only once.
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> baseList)  {
        ArrayList<E> noDupe = new ArrayList<>();

        for (E item : baseList) {
            if (!noDupe.contains(item)) {
                noDupe.add(item);
            }
        }

        return noDupe;
    }


    public static void main(String[] args) {

        //Initialize "original" list.
        ArrayList<Integer> baseList = new ArrayList<>();

        //Create random instance.
        Random baseRand = new Random();

        //Add 50 random numbers to the list.
        for (int i = 0; i < 50; i++) {

            int randomNumber = baseRand.nextInt(1,20);

            baseList.add(randomNumber);
        }

        System.out.println("List of 50 random numbers from 1 to 20:");
        System.out.println(baseList);

        ArrayList<Integer> noDupe = removeDuplicates(baseList);
    
        System.out.println("\n");
        System.out.println("Same list, after removing the duplicate numbers:");
        System.out.println(noDupe);
    }
}