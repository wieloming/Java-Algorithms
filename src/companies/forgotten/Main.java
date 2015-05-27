package companies.forgotten;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        GetSquareRoot getSquareRoot = new GetSquareRoot();
//        System.out.println("sqr(4) = " + getSquareRoot.calculate(4));
//        System.out.println("sqr(16) = " + getSquareRoot.calculate(16));
//        System.out.println("sqr(2) = " + getSquareRoot.calculate(2));

//        FindOccurenceOfNumberInGivenArray findOccurenceOfNumberInGivenArray = new FindOccurenceOfNumberInGivenArray();
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10, 10, 11, 11, 11, 11, 11, 12, 13, 15};
//        System.out.println(findOccurenceOfNumberInGivenArray.calculate(array, 11));

//        PrintAllValidCombinationsOfParenthesis printAllValidCombinationsOfParenthesis = new PrintAllValidCombinationsOfParenthesis();
//        printAllValidCombinationsOfParenthesis.calculate("(((())))");

//        ConvertDoubleToRational convertDoubleToRational = new ConvertDoubleToRational();
//        convertDoubleToRational.calculate(0.5);
//        convertDoubleToRational.calculate(0.125);
//        convertDoubleToRational.calculate(3.5);

//        PrintAllPermutationsOfAString printAllPermutationsOfAString = new PrintAllPermutationsOfAString();
//        printAllPermutationsOfAString.count("abc");

//        FindFirstIndexOfNumberInSortedArrayWithDuplicates findFirstIndexOfNumberInSortedArrayWithDuplicates = new FindFirstIndexOfNumberInSortedArrayWithDuplicates();
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10, 10, 11, 11, 11, 11, 11, 12, 13, 15};
//        System.out.println(findFirstIndexOfNumberInSortedArrayWithDuplicates.count(array, 11));


//        FindIfBinaryTreeIsBST findIfBinaryTreeIsBST = new FindIfBinaryTreeIsBST();
////            8
////          3   10
////         1 16
//        Tree tree1 = new Tree(8);
//        tree1.left = new Tree(3);
//        tree1.right = new Tree(10);
//        tree1.left.left = new Tree(1);
//        tree1.left.right = new Tree(16);
//        System.out.println(findIfBinaryTreeIsBST.count(tree1));
//        Tree tree2 = new Tree(8);
//        tree2.left = new Tree(3);
//        tree2.right = new Tree(10);
//        tree2.left.left = new Tree(4);
//        tree2.left.right = new Tree(16);
//        System.out.println(findIfBinaryTreeIsBST.count(tree2));

//        FindAllElementsOfLevelInBinaryTree findAllElementsOfLevelInBinaryTree = new FindAllElementsOfLevelInBinaryTree();
////            8
////          3   10
////         1 16  11
//        Tree tree1 = new Tree(8);
//        tree1.left = new Tree(3);
//        tree1.right = new Tree(10);
//        tree1.right.right = new Tree(11);
//        tree1.left.left = new Tree(1);
//        tree1.left.right = new Tree(16);
//        ArrayList<Integer> result = findAllElementsOfLevelInBinaryTree.count(tree1, 2);
//        System.out.println(result);

//        CheckIfStringIsRotatedPalindrome checkIfStringIsRotatedPalindrome = new CheckIfStringIsRotatedPalindrome();
//        System.out.println(checkIfStringIsRotatedPalindrome.calculate("3211234"));

//        GetAllSubsetsOfArray getAllSubsetsOfArray = new GetAllSubsetsOfArray();
//        Set<Integer>  array = new HashSet<>();
//        array.add(1);
//        array.add(2);
//        array.add(3);
//        System.out.println(getAllSubsetsOfArray.calculate(array));

        PrintAllPairsInSortedArrayThatSumsToM printAllPairsInSortedArrayThatSumsToM = new PrintAllPairsInSortedArrayThatSumsToM();
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10, 10, 11, 11, 11, 11, 11, 12, 13, 15};
        printAllPairsInSortedArrayThatSumsToM.count(new ArrayList<>(Arrays.asList(array)), 9);
    }
}

