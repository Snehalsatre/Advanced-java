package StreamAPI;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleExample {
    public static void main(String[] args) {
        double number = 123456.78;

        // 1. Format using Italian Locale (Standard Number Format)
        // Italy uses dots for thousands and commas for decimals
        NumberFormat italyFormat = NumberFormat.getInstance(Locale.ITALY);
        String formattedItaly = italyFormat.format(number);
        
        System.out.println("Italian Number Format: " + formattedItaly);

        // 2. Format using Korean Locale (Currency Format)
        // Korea uses the Won symbol (₩)
        NumberFormat koreaCurrency = NumberFormat.getCurrencyInstance(Locale.KOREA);
        String formattedKorea = koreaCurrency.format(number);
        
        System.out.println("Korean Currency Format: " + formattedKorea);
    }
}
