package companies.forgotten;

public class Print2DArrayInCircularOrder {
    public void count(int[][] array) {
        int length = array[0].length - 1;
        int height = array.length - 1;

        int elementsInArray = (length + 1) * (height + 1);
        int tempLength = length;
        int tempLengthTop = 0;
        int tempHeightTop = 0;
        int tempHeight = height;
        String direction = "right";
        int col = 0;
        int row = 0;
        while (elementsInArray > 0) {
            System.out.println(array[row][col]);

            if (direction.equals("right")) {
                col++;
                if (col == tempLength) {
                    direction = "down";
                    tempHeightTop++;
                }
            } else if (direction.equals("down")) {
                row++;
                if (row == tempHeight) {
                    direction = "left";
                    tempLength--;
                }
            } else if (direction.equals("left")) {
                col--;
                if (col == tempLengthTop) {
                    direction = "up";
                    tempHeight--;
                }
            } else if (direction.equals("up")) {
                row--;
                if (row == tempHeightTop) {
                    direction = "right";
                    tempLengthTop++;
                }
            }
            elementsInArray--;

        }
    }
}
