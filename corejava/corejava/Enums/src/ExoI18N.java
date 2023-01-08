import java.text.NumberFormat;
import java.util.Locale;

public class ExoI18N {
    public static void main(String[] args) {
        Long myNumber = 125330300l;
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        System.out.println("US display: "+nf.format(myNumber));
        nf = NumberFormat.getInstance(Locale.UK);
        System.out.println("UK display: "+nf.format(myNumber));
        nf = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println("FR display: "+nf.format(myNumber));
        Locale locale = Locale.getDefault();
        System.out.println(locale.getDisplayCountry());
    }
}
