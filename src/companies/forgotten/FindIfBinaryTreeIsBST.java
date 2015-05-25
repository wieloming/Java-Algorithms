package companies.forgotten;

import stuff.Tree;

public class FindIfBinaryTreeIsBST {

    public boolean count(Tree tree){
        if(tree == null){
            return true;
        }
        if(tree.left != null){
            if(tree.left.value >= tree.value){
                return false;
            }else{
                return count(tree.left);
            }
        }
        if(tree.right != null){
            if(tree.right.value <= tree.value){
                return false;
            }else{
                return count(tree.right);
            }
        }
        return true;

    }
}
