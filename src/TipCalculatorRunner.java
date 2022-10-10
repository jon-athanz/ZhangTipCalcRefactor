import java.util.Scanner;
import java.text.DecimalFormat;
public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        int people;
        int percent;
        double cost = 0;

        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group?");
        people = scan.nextInt();
        System.out.println("What's the tip percentage? (0 - 100): ");
        percent = scan.nextInt();

        TipCalculator calc = new TipCalculator(people, percent);

        do {
            calc.addMeal(cost);
            System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
        } while (cost != -1);

        System.out.println("--------------------");
        System.out.println("Total Bill Before Tip: " + df.format(calc.getTotalBillBeforeTip()));
        System.out.println("Tip Percentage: " + calc.getTipPercentage());
        System.out.println("Total Tip: " + df.format(calc.tipAmount()));
        System.out.println("Total Bill With Tip: " + df.format(calc.totalBill()));
        System.out.println("Per Person Cost Before Tip: " + df.format(calc.perPersonCostBeforeTip()));
        System.out.println("Tip Per Person: " + df.format(calc.perPersonTipAmount()));
        System.out.println("Total Cost Per Person: " + df.format(calc.perPersonTotalCost()));
    }
}
