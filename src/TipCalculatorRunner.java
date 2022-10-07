import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        int people;
        int percent;

        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group?");
        people = scan.nextInt();
        System.out.println("What's the tip percentage? (0 - 100) :");
        percent = scan.nextInt();

        TipCalculator calc = new TipCalculator(people, percent);

        for (double cost = 0; scan.nextDouble() != -1; cost += scan.nextDouble()) {
            System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end) : ");
            calc.addMeal(cost);
        }

    }
}
