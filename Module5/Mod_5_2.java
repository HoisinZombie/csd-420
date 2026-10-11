/**
 * Andrew Estrada
 * 10/8/26
 * CSD-420
 * Module 5.2
 */
import java.util.TreeSet;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

//Unfortunately my code is not working as intended on my end, but since you sent back that it
//was working fine on your machine and I didn't have much time left to complete the assignment
//I've tried to continue on with the code even without being able to compile it myself.

public class Mod_5_2 {
    public static void main(String[] args){

        File wordFile = new File("collection_of_words.txt");

        try (Scanner scanner = new Scanner(wordFile)) {
            while (scanner.hasNextLine()) {
                String words = scanner.nextLine();
                System.out.println(words);
            }
        }

        catch (FileNotFoundException e) {
            System.out.println("File error: Not Located");
            e.printStackTrace();
        }

        TreeSet wordTree = new TreeSet(words);

        System.out.println(wordTree);

        System.out.println(wordTree.descendingSet());

    }
}
