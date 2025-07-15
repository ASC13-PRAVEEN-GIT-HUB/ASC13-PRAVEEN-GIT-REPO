package lab2;

public class LargestNumberApp {
    public static int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int num3 = 3;

        int max = largest(num1, num2, num3);
        System.out.println("The largest number is: " + max);
    }
}
