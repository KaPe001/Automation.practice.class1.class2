package class2;

import java.util.Random;
import java.util.Scanner;

public class TokenGeneratorArray {
    public String tokenGenerator() {

        Scanner sc = new Scanner(System.in);

        String digits = "0123456789";
        String specialChars = "~!@#$%^&*()=+{}[]|?ABCDEFGHIJKLMNOPRSTUVWYZabcdfghijklmnoprstuvwyz"
                + digits;
        Random rnd = new Random();

        System.out.println("Enter the size of the token");
        int userChoiceOfLength = sc.nextInt();

        char[] symbols = specialChars.toCharArray();
        char[] buf = new char[userChoiceOfLength];

        switch (userChoiceOfLength) {
            case 15:
                for (int i = 0; i < buf.length; i++)
                    System.out.print(buf[i] = symbols[rnd.nextInt(symbols.length)]);
                break;
            case 10:
                for (int i = 0; i < buf.length; i++)
                    System.out.print(buf[i] = symbols[rnd.nextInt(symbols.length)]);
                break;
            case 5:
                for (int i = 0; i < buf.length; i++)
                    System.out.print(buf[i] = symbols[rnd.nextInt(symbols.length)]);
                break;
            default:
                System.out.println("Size not available");
        }
        return new String(buf);
    }
}
