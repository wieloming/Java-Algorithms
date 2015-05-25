package companies.forgotten;

public class FindFirstIndexOfNumberInSortedArrayWithDuplicates {

    public int count(int[] array, int target) {
        return count(array, 0, array.length - 1, target);
    }

    private int count(int[] array, int start, int end, int target) {
        int middle = (start + end) / 2;

        if (array[middle] == target) {
            while (array[middle] == target) {
                middle--;
            }
            return middle + 1;
        } else if(array[middle] > target) {
            return count(array, start, middle - 1, target);
        } else {
            return count(array, middle + 1, end, target);
        }
    }
}
