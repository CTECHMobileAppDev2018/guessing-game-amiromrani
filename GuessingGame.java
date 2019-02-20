import java.util.Scanner;
import java.util.Random;

  
public class GuessingGame {

    public static void main(String[] args) {
     
    
        System.out.println("Welcome to the guessing game."); 
      System.out.println("you have to guess a number from 1 to 100 ");
      Scanner input = new Scanner(System.in);  // Create a Scanner object
      System.out.println("Enter your guess");
      int userinput = input.nextInt();
       Random rand = new Random(); 
  
        // Generate random integers in range 0 to 100
        int rand_int = rand.nextInt(101); 
        if (userinput == rand_int){
        System.out.println("you got it" );
     
        } else if (userinput > rand_int){  
          System.out.println("your too high");
          
        } else {
            System.out.println("your too low");
        }   
    
 }
    }
