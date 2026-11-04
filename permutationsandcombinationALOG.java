
import java.util.Scanner;

public class  permutationsandcombinationALOG{

    public static long factorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.print("Enter r: ");
        int r = input.nextInt();

        if (n <= 0 || r < 0 || r > n) {
            System.out.println("Invalid input");
            return;
        }

        // معادلة التباديل
        long permutations = factorial(n) / factorial(n - r);

        // معادلةالتوافيق
        long combinations = factorial(n) /
                (factorial(r) * factorial(n - r));

        // 3. Lottery probability
        System.out.println("Permutations = " + permutations);
        System.out.println("Combinations = " + combinations);

        if (n >= 6) {
            long lottery = factorial(n) /
                    (factorial(6) * factorial(n - 6));

            double probability = 1.0 / lottery;

            System.out.println("Lottery probability = "
                    + probability);
        } else {
            System.out.println("n must be at least 6 for lottery");
        }

        input.close();
    }
}
