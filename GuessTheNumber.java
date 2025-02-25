import java.util.Scanner;

public class GuessTheNumber {
      public static void main(String[] args) {
        System.out.println("Try Guess A number between 1-100");
        int numberToGuess;
        int urGuess;


        numberToGuess = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner (System.in); {


      do {
            System.out.print("What your guess?");
            urGuess = scanner.nextInt();

            if (urGuess > numberToGuess) {
              System.out.println("Try Lower Number");              
            } else if (urGuess < numberToGuess) {
              System.out.println("Try Higher Number");
            } else {
              System.out.println("Good Job You Made it!!!");
            }
          } while (urGuess != numberToGuess);
          scanner.close();
      }
    }
  }
// Credits to Pak Kashmir :D i took the code from the elearn i just modify it a bit         