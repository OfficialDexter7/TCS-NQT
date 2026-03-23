import java.util.Scanner;

public class Car_Parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("error");
            return;
        }

        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("error");
            return;
        }

        int cost = 0;

        if (n <= 2) {
            cost = n * 100;
        } else if (n <= 5) {
            cost = (2 * 100) + (n - 2) * 50;
        } else {
            cost = (2 * 100) + (3 * 50) + (n - 5) * 20;
        }

        System.out.println(cost);
    }
}