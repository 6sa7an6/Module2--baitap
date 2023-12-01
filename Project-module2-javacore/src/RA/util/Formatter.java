package RA.util;

import java.text.NumberFormat;
import java.util.Locale;

public class Formatter {
    public static NumberFormat getNumberFormatterVND(){
        Locale locale = new Locale("vi","VN");
        NumberFormat numberFormat =NumberFormat.getCurrencyInstance(locale);
        return numberFormat;
    }
}
