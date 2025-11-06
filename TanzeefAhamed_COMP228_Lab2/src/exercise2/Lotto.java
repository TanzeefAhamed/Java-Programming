package exercise2;
import javax.swing.JOptionPane;
import java.security.SecureRandom;

public class Lotto {

    int[] randomNumber = new int[3];

    // constructor fills array with random numbers 1–9
    public Lotto() {
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < 3; i++) {
            randomNumber[i] = random.nextInt(9) + 1;
        }
    }
    public int[] getNumbers() {
        return randomNumber;
    }
}