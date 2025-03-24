import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class MortgageCalculator {
    public static void main(String[] args) {
        double principalAmount = 0;
        float interestRate = 0;
        int months = 0;
        Scanner sc = new Scanner(System.in);

        while (principalAmount < 1000 || principalAmount > 10000000) {
            System.out.println("कृपया मूल रकम प्रविष्ट गर्नुहोस् (<1000-10000000):> ");
            principalAmount = sc.nextDouble();
        }

        while (interestRate <= 0 || interestRate > 30) {
            System.out.println("कृपया वार्षिक ब्याज दर% प्रविष्ट गर्नुहोस् (0-30):> ");
            interestRate = sc.nextFloat();
        }

        while (months <= 0 || months > 360) { // Max limit changed to 30 years
            System.out.println("कृपया कुल समय अवधि (महीनामा) प्रविष्ट गर्नुहोस् (1-360):> ");
            months = sc.nextInt();
        }

        sc.close(); // Close Scanner

        double mortgage = MortgageCalc(principalAmount, interestRate, months);
        Locale nepalLocale = new Locale("ne", "NP");
        NumberFormat nepaliCurrency = NumberFormat.getCurrencyInstance(nepalLocale);

        System.out.println("मूल रकम: " + nepaliCurrency.format(principalAmount));
        System.out.println("ब्याज दर% " + interestRate + "%");
        System.out.println("Mortgage (बंधकी): " + nepaliCurrency.format(mortgage));
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("--------------");

        Schedule(principalAmount, mortgage, months, interestRate);
    }

    public static void Schedule(double principalAmount, double mortgage, int months, float interestRate) {
        double remaining = principalAmount;
        double monthlyRate = interestRate / 100 / 12;

        for (int i = 1; i <= months; i++) {
            double interest = remaining * monthlyRate;
            double principalPaid = mortgage - interest;
            remaining -= principalPaid;
            System.out.printf("Month %d: Remaining Balance = %.2f%n", i, remaining);
            if (remaining <= 0) break; // Stop early if fully paid
        }
    }

    public static double MortgageCalc(double principalAmount, float interestRate, int months) {
        double monthlyRate = interestRate / 100 / 12;
        return principalAmount * (monthlyRate * Math.pow(1 + monthlyRate, months)) /
               (Math.pow(1 + monthlyRate, months) - 1);
    }
}
