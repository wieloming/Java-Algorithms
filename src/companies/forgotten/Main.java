package companies.forgotten;

import companies.forgotten.Scala.PrintAllPermutationsOfAString;
import stuff.Tree;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10, 10, 11, 11, 11, 11, 11, 12, 13, 15};
//            8
//          3   10
//         1 16
        Tree tree1 = new Tree(8);
        tree1.left = new Tree(3);
        tree1.right = new Tree(10);
        tree1.left.left = new Tree(1);
        tree1.left.right = new Tree(16);

        int[][] array2 = {{1, 4, 5},
                {2, 6, 7},
                {3, 8, 9}};

        companies.forgotten.Scala.PrintAllPermutationsOfAString printAllPermutationsOfAString = new PrintAllPermutationsOfAString();
        printAllPermutationsOfAString.count("abc");

    }
}

