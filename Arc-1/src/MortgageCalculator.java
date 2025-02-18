import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class MortgageCalculator{
    public static void main(String[] args) {
        double principalAmount=0;
        float IntrestRate=0;
        int months=0;
        Scanner sc=new Scanner(System.in);
        while (principalAmount<1000 || principalAmount>10000000){
        System.out.println("कृपया मूल रकम प्रविष्ट गर्नुहोस्(<1000-10000000):> ");
        principalAmount=sc.nextDouble();
        }
        while (IntrestRate<=0 || IntrestRate >30){
            System.out.println("कृपया मासिक ब्याज दर% प्रविष्ट गर्नुहोस्(0<-30):> ");
            IntrestRate=sc.nextFloat();
        }
        while(months<=0 || months>30) {
            System.out.println("कृपया कुल समय अवधि (महीनामा) प्रविष्ट गर्नुहोस्(1-30):> ");
            months = sc.nextInt();
        }
        double Mortgage=principalAmount*((IntrestRate*Math.pow(1+IntrestRate,months))/Math.pow(1+IntrestRate,months)-1);
        Locale nepalLocale = new Locale("ne", "NP");
        NumberFormat nepaliCurrency=NumberFormat.getCurrencyInstance(nepalLocale);
        System.out.println("मूल रकम: "+nepaliCurrency.format(principalAmount));
        System.out.println("ब्याज दर% "+NumberFormat.getPercentInstance().format(IntrestRate/100));
        String MortgageStr= nepaliCurrency.format(Mortgage);
        System.out.println("Mortgage (बंधकी): "+MortgageStr);
    }
}