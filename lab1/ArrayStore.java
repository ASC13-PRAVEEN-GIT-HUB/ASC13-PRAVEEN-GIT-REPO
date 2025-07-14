package lab1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ArrayStore {
    private final int[] array = new int[10];

    public void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public void displayUsingFor() {
        System.out.println("Array elements (for loop):");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public void displayUsingWhile() {
        System.out.println("Array elements (while loop):");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

    public void sortArray() {
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public int countOccurrences(int number) {
        int count = 0;
        for (int value : array) {
            if (value == number) {
                count++;
            }
        }
        return count;
    }

    public void insertAt(int number, int position) {
        if (position < 0 || position >= array.length) {
            System.out.println("Invalid position.");
            return;
        }
        array[position] = number;
        System.out.println("Inserted " + number + " at position " + position);
    }

    public int[] removeDuplicates() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int value : array) {
            set.add(value);
        }
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int value : set) {
            uniqueArray[index++] = value;
        }
        return uniqueArray;
    }

    public static void main(String[] args) {
        ArrayStore store = new ArrayStore();
        store.acceptInput();

        store.displayUsingFor();
        store.displayUsingWhile();

        store.sortArray();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to count its occurrences: ");
        int numberToCount = scanner.nextInt();
        System.out.println("Occurrences of " + numberToCount + ": " + store.countOccurrences(numberToCount));

        System.out.print("Enter number to insert: ");
        int numToInsert = scanner.nextInt();
        System.out.print("Enter position (0–9): ");
        int position = scanner.nextInt();
        store.insertAt(numToInsert, position);
        store.displayUsingFor();

        int[] noDuplicates = store.removeDuplicates();
        System.out.println("Array without duplicates: " + Arrays.toString(noDuplicates));
    }
}
