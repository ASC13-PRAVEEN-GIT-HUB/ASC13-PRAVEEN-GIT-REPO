package lab1;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 2;

        For(num);
        While(num);
        DoWhile(num);
    }


    public static void For(int number) {
        System.out.println("Multiplication table using for loop:");
        for (int i = 1; i <= 3; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }


    public static void While(int number) {
        System.out.println("\nMultiplication table using while loop:");
        int i = 1;
        while (i <= 3) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
    }


    public static void DoWhile(int number) {
        System.out.println("Multiplication table using do-while loop:");
        int i = 1;
        do {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        } while (i <= 3);
    }



}
