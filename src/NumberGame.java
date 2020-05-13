
import java.util.Scanner;

public class NumberGame {

    public static void main(String [] args)
    {
        // generate a number btn 1-100
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("I have chosen a number between 1 to 100. Guess the number");

        for(int i=7; i>0; i--){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Your have "+ i + " guess chances left");
            System.out.println("Enter your guess:");

            int guess = scanner.nextInt();

            if(guess == randomNumber){
                System.out.println("You win!!");
                break;
            }else if(guess > randomNumber){
                System.out.println("Your guess is greater than the number");
            }else {
                System.out.println("Your guess is less than the number");
            }

        }

        System.out.println("You lost");

    }
}
