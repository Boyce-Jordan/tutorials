import java.util.*;
/** This program generates random numbers and records the frequency they appear.*/

//Begin main class
public class Apples {
    // main function in the apples class
    public static void main(String[] args){
        // This line is the new creation of a random object which is part of the util library
        Random rand = new Random();
        //Create new array with a length of seven...0 - 6
        int freq[] = new int[7];
        // for loop that keeps count of how many times each number appears
        for(int roll = 1; roll <= 100; roll++){
            // This is the most important line in the program. The 1 + makes it so no 0's appear and the ++freq adds 1 to the appearance of number 1 - 6
            ++freq[1 + rand.nextInt(6)];
        }
        // Header for the output of the program. \t is for tab
        System.out.println("Face\tFrequency");
        // for loop to display the frequency each number appeared
        for(int face = 1; face < freq.length; face++){
            System.out.println(face + "\t" + "\t" + freq[face]);
        }
    }
}
