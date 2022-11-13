import java.util.HashSet;

public class DuplicateSubTree {
    static char MARKER = '$';
 
    // This function returns empty string if tree
    // contains a duplicate subtree of size 2 or more.
    public static String dupSubUtil(Node root, HashSet<String> subtrees)
    {
        String s = "";
     
        // If current node is NULL, return marker
        if (root == null)
            return s + MARKER;
     
        // If left subtree has a duplicate subtree.
        String lStr = dupSubUtil(root.left,subtrees);
        if (lStr.equals(s))
            return s;
     
        // Do same for right subtree
        String rStr = dupSubUtil(root.right,subtrees);
        if (rStr.equals(s))
            return s;
     
        // Serialize current subtree
        s = s + root.data + lStr + rStr;
     
        // If current subtree already exists in hash
        // table. [Note that size of a serialized tree
        // with single node is 3 as it has two marker
        // nodes.
        if (s.length() > 3 && subtrees.contains(s))
            return "";
     
        subtrees.add(s);
        return s;
    }
 

    int dupSub(Node root) {
      HashSet<String> subtrees=new HashSet<>();
        String ans =  dupSubUtil(root,subtrees);
        
        if(ans.equals(""))
            return 1;
        else   
           return 0;
    }
}
