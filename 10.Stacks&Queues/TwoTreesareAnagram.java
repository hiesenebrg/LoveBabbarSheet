public class TwoTreesareAnagram {
    static boolean areAnagrams(Node root1, Node root2)
    {
        // Base Cases
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
      
        // start level order traversal of two trees
        // using two queues.
        Queue<Node> q1 = new LinkedList<Node>();
        Queue<Node> q2 = new LinkedList<Node>();
        q1.add(root1);
        q2.add(root2);
      
        while (true)
        {
            // n1 (queue size) indicates number of
            // Nodes at current level in first tree
            // and n2 indicates number of nodes in
            // current level of second tree.
            int n1 = q1.size(), n2 = q2.size();
      
            // If n1 and n2 are different
            if (n1 != n2)
                return false;
      
            // If level order traversal is over 
            if (n1 == 0)
                break;
      
            // Dequeue all Nodes of current level and
            // Enqueue all Nodes of next level
            ArrayList<Integer> curr_level1 = new
                                          ArrayList<>();
            ArrayList<Integer> curr_level2 = new
                                          ArrayList<>();
            while (n1 > 0)
            {
                Node node1 = q1.peek();
                q1.remove();
                if (node1.left != null)
                    q1.add(node1.left);
                if (node1.right != null)
                    q1.add(node1.right);
                n1--;
      
                Node node2 = q2.peek();
                q2.remove();
                if (node2.left != null)
                    q2.add(node2.left);
                if (node2.right != null)
                    q2.add(node2.right);
      
                curr_level1.add(node1.data);
                curr_level2.add(node2.data);
            }
      
            // Check if nodes of current levels are
            // anagrams or not.
            Collections.sort(curr_level1);
            Collections.sort(curr_level2);
             
            if (!curr_level1.equals(curr_level2))
                return false;
        }
      
        return true;
    }
}
