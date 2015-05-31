package companies.forgotten;

import java.util.ArrayList;

public class FindLargestSubsequentSum {
    public int count(ArrayList<Integer> numbers) {
        int tempMax = 0;
        int finnalMax = 0;
        for (int x : numbers) {
            // is actualMax + x bigger than 0?
            tempMax = Math.max(0, tempMax + x);
            System.out.print(tempMax + " ");
            // is actualMax our new MAX?
            finnalMax = Math.max(finnalMax, tempMax);
        }
        return finnalMax;
    }
}
