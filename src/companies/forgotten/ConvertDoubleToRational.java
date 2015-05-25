package companies.forgotten;

public class ConvertDoubleToRational {
    public void calculate(double number) {
        int multiplicator = 1;
        while (number * multiplicator != (int) (number * multiplicator)) {
            multiplicator *= 10;
        }

        // number/multiplicator
        int multiplicatedNumber = (int) (number * multiplicator);
        int largestCommonDivisor = 1;
        for (int i = 2; i <= multiplicatedNumber; i++) {
            if (multiplicatedNumber % i == 0 && multiplicator % i == 0) {
                largestCommonDivisor = i;
            }
        }

        int firstPart = multiplicatedNumber / largestCommonDivisor;
        int secondPart = multiplicator / largestCommonDivisor;

        System.out.println(firstPart + "/" + secondPart);

    }
}
