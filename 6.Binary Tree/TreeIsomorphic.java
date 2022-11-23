public class TreeIsomorphic {
    boolean isIsomorphic(Node root1, Node root2) {

        // code here
        // if both trees are empty
        if (root1 == null && root2 == null)
            return true;
        // if anyone of trees are empty
        if (root1 == null || root2 == null)
            return false;
        // if their root data are not equal
        if ((root1 != null && root2 != null) && root1.data != root2.data)
            return false;
        // isomorphic directly
        boolean opt1 = isIsomorphic(root1.left, root2.left) && isIsomorphic(root1.right, root2.right);
        // isomorphic by flipping
        boolean opt2 = isIsomorphic(root1.left, root2.right) && isIsomorphic(root1.right, root2.left);
        // it is neither isomorphic directly nor isomorphic by flipping
        if (opt1 == false && opt2 == false)
            return false;
        return true;

    }
}
