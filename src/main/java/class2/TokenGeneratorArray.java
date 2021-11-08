package class2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TokenGeneratorArray {
    public String tokenGenerator() {

        Scanner sc = new Scanner(System.in);

        char asciTable[] = {33, 35, 36, 37, 38, 40, 41, 43, 49, 50, 55, 57, 64, 71, 72, 73, 78, 83, 85, 98, 99,
                100, 102, 104, 105, 107, 113, 114, 116, 119, 120};
        Random rnd = new Random();

        try {
            System.out.println("Enter the size of the token");
            int userChoiceOfLength = sc.nextInt();
            char[] buf = new char[userChoiceOfLength];

            switch (userChoiceOfLength) {
                case 15:
                    for (int i = 0; i < buf.length; i++)
                        System.out.print(buf[i] = asciTable[rnd.nextInt(asciTable.length)]);
                    break;
                case 10:
                    for (int i = 0; i < buf.length; i++)
                        System.out.print(buf[i] = asciTable[rnd.nextInt(asciTable.length)]);
                    break;
                case 5:
                    for (int i = 0; i < buf.length; i++)
                        System.out.print(buf[i] = asciTable[rnd.nextInt(asciTable.length)]);
                    break;
                default:
                    System.out.println("Size not available");
            }
            return new String(buf);
        } catch (InputMismatchException e) {
            System.out.println("Size must be provided as an integer");
        }
        return null;
    }
}
