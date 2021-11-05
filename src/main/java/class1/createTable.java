package class1;

import java.util.Arrays;
import java.util.Scanner;

public class createTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ask user for a number
        System.out.println("Please, enter the integer number to set the table size.");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        //create a table
        System.out.println("Please, enter " + size + " values to fulfill the table.");
        for (int i = 0; i < size; i++) {
            int value = sc.nextInt();
            numbers[i] = value;
        }

        //calculate the average and sum
        int length = numbers.length;
        double sum = 0;
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
        }

        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        double average = sum / length;
        System.out.println("Average value of the table is: " + average);
        System.out.println("The maximum value in a table is: " + max);
    }
}