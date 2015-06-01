package companies.forgotten;

public class ImplementDivisionWithoutOperator {
    public double count(int num1, int num2) {
        int times = 0;
        boolean firstIsNeg = false;
        boolean secondIsNeg = false;
        if(Math.abs(num1) != num1){
            firstIsNeg = true;
        }
        if(Math.abs(num2) != num2){
            secondIsNeg = true;
        }

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        while (num1 >= num2) {
            num1 -= num2;
            times++;
        }

        if(firstIsNeg ^ secondIsNeg){
            times = -times;
        }
        return times;
    }
}
