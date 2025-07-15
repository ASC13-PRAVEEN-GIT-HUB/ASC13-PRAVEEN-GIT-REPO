package lab2;

public class DigitWordsApp {
    public static void printDigitsInWords(int number) {
        if (number < 100 || number > 999) {
            System.out.println("Please enter a 3-digit number.");
            return;
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        };
        String numStr = String.valueOf(number);
        for (char digit : numStr.toCharArray()) {
            System.out.print(words[digit - '0'] + " ");
        }
    }
    public static void main(String[] args) {
        int input = 654;
        System.out.print("Input: " + input + "\nOutput: ");
        printDigitsInWords(input);
    }
}
