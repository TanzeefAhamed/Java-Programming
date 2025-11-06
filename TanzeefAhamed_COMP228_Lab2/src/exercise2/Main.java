package exercise2;
import javax.swing.*;
import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        //User input number from 3-27
        String input = JOptionPane.showInputDialog("Enter a number between 3 and 27:");

        //Change the users input into an int value
        int userGuess = Integer.parseInt(input);

        //Validation
        if (userGuess < 3 || userGuess > 27) {
            JOptionPane.showMessageDialog(null, "Please enter a number between 3 and 27");
        } else {

            boolean userWin = false;

            for (int i = 1; i < 5; i++) {
                //new random number for each line
                Lotto lotto = new Lotto();

                //get the 3 random numbers from the Lotto object and store them in an array
                int[] nums = lotto.getNumbers();

                //initializes the value of sum from the added numbers
                int sum = nums[0] + nums[1] + nums[2];

                //we get the sum of the random numbers
                sum = nums[0] + nums[1] + nums[2];

                //Show the message dialog for the lotto numbers
                JOptionPane.showMessageDialog(null,
                        "The lotto numbers are: " + nums[0] + ", " + nums[1] + ", " + nums[2] +
                                "\n The Sum is: " + sum);

                //Authenticate the userGuess is equal to the sum, and show dialog message
                if (userGuess == sum) {
                    JOptionPane.showMessageDialog(null,
                            "You Guessed It Correct! You Used Your Life's Luck All At Once! GG'S");
                    userWin = true;
                    break;
                }
            }

            if (!userWin) {
                JOptionPane.showMessageDialog(null, "Better Luck Next Time Lil Bro 😂");
            }
        }
    }
}


