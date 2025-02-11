import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class MortgageCalculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("कृपया मूल रकम प्रविष्ट गर्नुहोस्:> ");
        double principalAmount=sc.nextDouble();
        System.out.println("कृपया मासिक ब्याज दर% प्रविष्ट गर्नुहोस्:> ");
        float IntrestRate=sc.nextFloat();
        System.out.println("कृपया कुल समय अवधि (महीनामा) प्रविष्ट गर्नुहोस्:> ");
        int months=sc.nextInt();
        double Mortgage=principalAmount*((IntrestRate*Math.pow(1+IntrestRate,months))/Math.pow(1+IntrestRate,months)-1);
        Locale nepalLocale = new Locale("ne", "NP");
        NumberFormat nepaliCurrency=NumberFormat.getCurrencyInstance(nepalLocale);
        System.out.println("मूल रकम: "+nepaliCurrency.format(principalAmount));
        System.out.println("ब्याज दर% "+NumberFormat.getPercentInstance().format(IntrestRate/100));
        String MortgageStr= nepaliCurrency.format(Mortgage);
        System.out.println("Mortgage (बंधकी): "+MortgageStr);
    }
}