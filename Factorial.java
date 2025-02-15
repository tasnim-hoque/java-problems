import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int fact = 1; // Initializing factorial to 1
        for (int i = 1; i <= num; i++) { // Loop from 1 to num
            fact *= i; // Multiply fact by i
        }

        System.out.println("Factorial: " + fact); // Printing result
        sc.close();
    }
}
