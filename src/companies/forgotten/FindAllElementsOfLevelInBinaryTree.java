package companies.forgotten;


import stuff.Tree;

import java.util.ArrayList;

public class FindAllElementsOfLevelInBinaryTree {

    public ArrayList<Integer> count(Tree tree, int levelToSearch) {
        return count(tree, new ArrayList<>(), -1, levelToSearch);
    }

    private ArrayList<Integer> count(Tree tree, ArrayList<Integer> result, int currentLvl, int levelToSearch) {
        currentLvl += 1;
        if (tree == null || currentLvl > levelToSearch) {
            return new ArrayList<>();
        } else {
            if (currentLvl == levelToSearch) {
                result.add(tree.value);
            }
            result.addAll(count(tree.left, new ArrayList<>(), currentLvl, levelToSearch));
            result.addAll(count(tree.right, new ArrayList<>(), currentLvl, levelToSearch));
            return result;
        }

    }
}
