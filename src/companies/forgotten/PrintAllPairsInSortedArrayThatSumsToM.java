package companies.forgotten;

import java.util.ArrayList;

public class PrintAllPairsInSortedArrayThatSumsToM {

    public void count(ArrayList<Integer> sortedArray, int number) {
        int left = 0;
        int right = sortedArray.size() - 1;
        while (left < right) {
            int sum = sortedArray.get(left) + sortedArray.get(right);
            if (sum < number) {
                left++;
            }
            if (sum > number) {
                right--;
            }
            if (sum == number) {
                System.out.println(left + "-" + right);
                left++;
                right++;
            }
        }
    }


}
