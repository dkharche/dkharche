
import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {

    public static void main(String[] args) {
        int MyNumber = (int) (Math.random() * 100);

        Scanner sc = new Scanner(System.in);
        int UserNumber = 0;

        do {
            System.out.println("Guess a number");

            UserNumber = sc.nextInt();

            if (MyNumber == UserNumber) {
                System.out.println("woowwow.. u won");
                break;

            } else if (MyNumber < UserNumber) {
                System.out.println("your number is too high");

            } else if (MyNumber > UserNumber) {
                System.out.println("your number is small ");
            }

        } while (UserNumber >= 0);
        System.out.print("my number was");
        System.out.println(MyNumber);

    }

}
