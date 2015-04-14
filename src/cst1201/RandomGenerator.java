package cst1201;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Programming Sameen Qaiser
 */
public class RandomGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //TODO: Create a Scanner object to read keyboard input.
        Scanner scan = new Scanner(System.in);
        
        //getting min number from user
        System.out.println("Enter the min number");
        int minNumer = scan.nextInt();
        
       //getting max number from user
        System.out.println("Enter the max number");
        int maxNumer = scan.nextInt();
        
        //getting how many numbers the user wants to generate
        System.out.println("How many random numbers you want to generate");
        int randNumer = scan.nextInt();
        
        //generating random numbers
        Random random = new Random();
        
       double avg = 0;
       int count =0;
       int maxNumber =0;
       int minNumber=0;
       
        for(int i =0; i <randNumer; i++){
            int randomNumer = random.nextInt(maxNumer-minNumer)+minNumer;
            if(randomNumer >= minNumer){
                avg = randomNumer + avg;
                System.out.println("The random number is "+randomNumer);
                if(randomNumer > maxNumber){
                    maxNumber = randomNumer;
                }
                if(randomNumer < minNumber){
                    minNumber = randomNumer;
                }
                count++;
            }
        }
        
        System.out.println("The sum is "+avg);
        System.out.println("The count is "+count);
        System.out.println("The max number is "+maxNumber);
        System.out.println("The min number is "+minNumber);
        System.out.println("The average is "+avg/count);
        
        
    }
    
}

