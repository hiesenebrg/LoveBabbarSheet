class INT {
    int v;

    INT(int a) {
        v = a;
    }
}

public class argestSubTreeSum {
    static int findLargestSubtreeSumUtil(Node root,
            INT ans) {
        // If current node is null then
        // return 0 to parent node.
        if (root == null)
            return 0;

        // Subtree sum rooted
        // at current node.
        int currSum = root.key +
                findLargestSubtreeSumUtil(root.left, ans) +
                findLargestSubtreeSumUtil(root.right, ans);

        // Update answer if current subtree
        // sum is greater than answer so far.
        ans.v = Math.max(ans.v, currSum);

        // Return current subtree
        // sum to its parent node.
        return currSum;
    }

    // Function to find
    // largest subtree sum.
    static int findLargestSubtreeSum(Node root) {
        // If tree does not exist,
        // then answer is 0.
        if (root == null)
            return 0;

        // Variable to store
        // maximum subtree sum.
        INT ans = new INT(-9999999);

        // Call to recursive function
        // to find maximum subtree sum.
        findLargestSubtreeSumUtil(root, ans);

        return ans.v;
    }
}
