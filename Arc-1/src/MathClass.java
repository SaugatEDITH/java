//Math class nuber,currency,percent format
import java.text.NumberFormat;
import java.util.Locale;

class MathClass{
    public static void main(String[] args) {
        System.out.println(Math.round(5.52));// 6
        System.out.println(Math.round(5.49));// 5
        System.out.println(Math.ceil(55.51F));//56
        System.out.println(Math.floor(55.51));//55
        System.out.println(Math.max(5,55));
        System.out.println((int)(Math.random()*100));

//        formatting number , currency
    Locale nepalLocale = new Locale("ne", "NP");
    NumberFormat CurrencyNrp= NumberFormat.getCurrencyInstance(nepalLocale);// for nepali currency
    NumberFormat Currency$= NumberFormat.getCurrencyInstance();// for $
    NumberFormat CurrencyBri= NumberFormat.getCurrencyInstance(Locale.UK);// for pound

    String resultnrp=CurrencyNrp.format(123456789);
    String result$=Currency$.format(123456789);
    String resultBri=CurrencyBri.format(123456789);
        System.out.println(resultnrp);
        System.out.println(result$);
        System.out.println(resultBri);
//        Percentages format
String resultPer=NumberFormat.getPercentInstance().format(0.1);
        System.out.println(resultPer);
    }
}