import java.util.Stack;

public class BuildTreeusingtringParanthesis {
    public static Node treeFromString(String S) {
        return solve(S, 0,S.length()-1);
     }
     static Node solve(String S , int s , int e){
         if(s>e) return null;
        
         String num = "";
          while(s<S.length() && S.charAt(s)>='0' &&S.charAt(s)<='9'){
              num+=S.charAt(s);
              s+=1;
          }
         
         Node root = new Node(Integer.parseInt(num));
         int index = -1;
         if(s<=e && S.charAt(s)=='(')
              index =balancespar(S,s,e);
         
         if(index!=-1){
             root.left = solve(S,s+1, index-1 ); 
             root.right = solve(S,index+2,e-1);
         }
         
         return root;
     }
     static int balancespar(String S, int s , int e){
         if(s>e) return -1;
         Stack<Character> stack = new Stack<>();
         for ( int i =s ;i<=e;i++){
             if(S.charAt(i)=='(') stack.push(S.charAt(i));
             if(S.charAt(i)==')'){
                 if(!stack.isEmpty() && stack.peek()=='('){
                     stack.pop();
                 
                 }
                 if(stack.isEmpty()) return i;
             }
         }
         return -1;
     }
}
