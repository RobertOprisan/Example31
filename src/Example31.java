import java.util.Scanner;
public class Example31 {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        number = input.nextInt();

        for (int line = 1; line <= number; line++) {
            for (int i = 1; i <= number - line; i++) {
                System.out.print("/ ");
            }
            for (int i = line; i >= 1; i--) {
                System.out.print(i + " ");
            }
            for (int i = 2; i <= line; i++) {
                System.out.print(i + " ");
            }
            for (int i = 1; i <= number - line; i++) {
                System.out.print("/ ");

            }
            System.out.println();
        }
    }
}

