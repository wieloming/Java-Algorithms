package companies.forgotten;


public class FindOccurenceOfNumberInGivenArray {

    public int calculate(int[] array, int number) {
        return calculate(number, array, 0, array.length - 1);
    }

    public int calculate(int number, int[] array, int startIndex, int endIndex) {
        {
            if (endIndex < startIndex) {
                return 0;
            }
            if (array[startIndex] > number) {
                return 0;
            }
            if (array[endIndex] < number) {
                return 0;
            }
            if (array[startIndex] == number && array[endIndex] == number) {
                return endIndex - startIndex + 1;
            }

            int midInd = (startIndex + endIndex) / 2;

            if (array[midInd] == number) {
                int occurencesInLeftSide = calculate(number, array, startIndex, midInd - 1);
                int occurencesInRightSide = calculate(number, array, midInd + 1, endIndex);
                return 1 + occurencesInLeftSide + occurencesInRightSide;
            } else if (array[midInd] > number) {
                return calculate(number, array, startIndex, midInd - 1);
            } else {
                return calculate(number, array, midInd + 1, endIndex);
            }
        }
    }
}
