//Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z)
import java.util.Scanner;

public class Pangram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine().toLowerCase();

        if (checkPangram(sentence)) {
            System.out.println("The entered sentence is a pangram.");
        } else {
            System.out.println("The entered sentence is not a pangram.");
        }
    }

    private static boolean checkPangram(String input) {
        input = input.toLowerCase().replaceAll("[^a-z]", "");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (input.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}
