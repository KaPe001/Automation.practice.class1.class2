package class2;

import java.util.Random;
import java.util.Scanner;

public class TokenGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String options = "abdocokcdijKSDJDKMSLP0494838286328794#$%^&**()!";
        Random random = new Random();

        System.out.println("How many characters do you want your token to have?");
        int userChoiceOfToken = sc.nextInt();

        switch (userChoiceOfToken) {
            case 15:
                System.out.println("This is your token: ");
                for (int i = 1; i <= 15; i++) {
                    System.out.print(options.charAt(random.nextInt(options.length())));
                }
                break;
            case 10:
                System.out.println("This is your token: ");
                for (int i = 1; i <= 10; i++) {
                    System.out.print(options.charAt(random.nextInt(options.length())));
                }
                break;
            case 5:
                System.out.println("This is your token: ");
                for (int i = 1; i <= 5; i++) {
                    System.out.print(options.charAt(random.nextInt(options.length())));
                }
                break;
            default:
                System.out.println(("This size is not an option."));
        }
    }
}
