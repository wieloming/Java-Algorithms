package companies.forgotten;

import stuff.Tree;

public class FindClosestNumberInBST {
    public void count(Tree bst, int number) {
        if (bst == null) {
            return;
        }
        if (bst.value == number || (bst.left == null && bst.right == null)) {
            System.out.println(bst.value);
        }
        if (bst.left != null && bst.right == null) {
            int difference = Math.abs(bst.value - number);
            int deeperDifference = Math.abs(bst.left.value - number);
            if(difference <= deeperDifference){
                System.out.println(bst.value);
            }else{
                count(bst.left, number);
            }
        }
        if (bst.right != null && bst.left == null) {
            int difference = Math.abs(bst.value - number);
            int deeperDifference = Math.abs(bst.right.value - number);
            if(difference <= deeperDifference){
                System.out.println(bst.value);
            }else{
                count(bst.right, number);
            }
        }
        if (bst.left != null && bst.right != null) {
            int difference = Math.abs(bst.value - number);
            int deeperRightDifference = Math.abs(bst.right.value - number);
            int deeperLeftDifference = Math.abs(bst.left.value - number);
            int smallerDifference = deeperRightDifference;
            Tree closer = bst.right;
            if(deeperRightDifference > deeperLeftDifference){
                smallerDifference = deeperLeftDifference;
                closer = bst.left;
            }
            if(difference <= smallerDifference){
                System.out.println(bst.value);
            }else{
                count(closer, number);
            }
        }
    }
}

