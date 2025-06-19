import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        System.out.print("Current value: ");
        double currentValue = io.nextDouble();
        System.out.print("Growth Value: ");
        double growthRate = io.nextDouble();
        System.out.print("Years: ");
        int years = io.nextInt();

        double futureValue = futureValue(currentValue, growthRate, years);
        System.out.printf("Future value after %d years = ₹%.2f", years, futureValue);
    }

    private static double futureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        } else {
            return futureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
        }
    }
}