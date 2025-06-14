import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        if (isPangram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is NOT a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[26];

        for (char ch : sentence.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        for (boolean present : alphabet) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}
