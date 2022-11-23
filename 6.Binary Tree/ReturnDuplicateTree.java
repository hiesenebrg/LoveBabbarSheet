import java.util.*;

public class ReturnDuplicateTree {
    HashMap<String, Integer> m;
    ArrayList<Node> ans;
    public  String inorder(Node node)
   {
       if (node == null)
           return "";
     
       String str = "(";
       str += inorder(node.left);
       str += Integer.toString(node.data);
       str += inorder(node.right);
       str += ")";
     
       // Subtree already present (Note that we use
       // HashMap instead of HashSet
       // because we want to print multiple duplicates
       // only once, consider example of 4 in above
       // subtree, it should be printed only once.      
       if (m.get(str) != null && m.get(str)==1 )
         ans.add(node);
     
       if (m.containsKey(str))
           m.put(str, m.get(str) + 1);
       else
           m.put(str, 1);
        
       
       return str;
   }
     
 
   public List<Node> printAllDups(Node root)
   {
      m = new HashMap<>();
       ans = new ArrayList<>();
       inorder(root);
        Collections.reverse(ans);
       return ans;
   }
}
