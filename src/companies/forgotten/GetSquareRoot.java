package companies.forgotten;

import java.text.DecimalFormat;

public class GetSquareRoot {
    public String calculate(int number) {
        double sqr = 1;

        for (int i = 0; i < number; i++) {
            sqr = (number/sqr + sqr)/2;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(sqr);
    }
}
