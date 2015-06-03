package companies.forgotten;

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

//        PrintAllPairsInSortedArrayThatSumsToM printAllPairsInSortedArrayThatSumsToM = new PrintAllPairsInSortedArrayThatSumsToM();
//        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10, 10, 11, 11, 11, 11, 11, 12, 13, 15};
//        printAllPairsInSortedArrayThatSumsToM.count(new ArrayList<>(Arrays.asList(array)), 9);

//        PrintAllCombinationsOfCoinsPerAmount printAllCombinationsOfCoinsPerAmount = new PrintAllCombinationsOfCoinsPerAmount();
//        Integer[] array = {25, 10, 5, 1};
//        printAllCombinationsOfCoinsPerAmount.count(new ArrayList<>(Arrays.asList(array)), 25);

//        FindClosestNumberInBST findClosestNumberInBST = new FindClosestNumberInBST();
//        Tree tree1 = new Tree(8);
//        tree1.left = new Tree(3);
//        tree1.right = new Tree(10);
//        tree1.right.right = new Tree(14);
//        tree1.left.left = new Tree(1);
//        tree1.left.right = new Tree(6);
//        findClosestNumberInBST.count(tree1, 11);

//        FindLargestSubsequentSum findLargestSubsequentSum = new FindLargestSubsequentSum();
//        Integer[] array = {6, -6, -2, -3, -9, 8, 8, 7, -10, -4};
//        System.out.println(findLargestSubsequentSum.count(new ArrayList<>(Arrays.asList(array))));

//        ImplementDivisionWithoutOperator implementDivisionWithoutOperator = new ImplementDivisionWithoutOperator();
//        System.out.println(implementDivisionWithoutOperator.count(10, 2));
//        System.out.println(implementDivisionWithoutOperator.count(-10, 2));

        Print2DArrayInCircularOrder print2DArrayInCircularOrder = new Print2DArrayInCircularOrder();
        int[][] array = {{1, 2, 3, 4}, {10, 11, 12, 5}, {9, 8, 7, 6}};
        print2DArrayInCircularOrder.count(array);
    }
}

