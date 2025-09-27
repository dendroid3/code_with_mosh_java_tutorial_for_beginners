import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Principle, InterestRate, Period, Interest;

        System.out.print("Enter Principle:");
        Principle = scanner.nextDouble();

        System.out.print("Enter Interest Rate (%): ");
        InterestRate = scanner.nextDouble();

        System.out.print("Enter Period (Years): ");
        Period = scanner.nextDouble();

        Interest = Principle * (InterestRate / 100) * Period;
        System.out.print(Interest);
    }
}
