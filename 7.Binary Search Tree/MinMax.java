class Minmax{
    int min; 
    int  max;
    public Minmax(int min  , int max){
        this.min = min;
        this.max = max;
    }
}
class MinMax {
    
    Minmax solve(Node root){
        if(root==null) return new Minmax(Integer.MAX_VALUE,Integer.MIN_VALUE);
        Minmax left = solve(root.left);
        Minmax right = solve(root.right);
        int current_min , current_max;
        if(Math.min(left.min, right.min)>root.data) current_min = root.data;
        else current_min = Math.min(left.min, right.min);
        if(Math.max(left.max, right.max)<root.data) current_max = root.data;
        else current_max = Math.max(left.max, right.max);
        return new Minmax(current_min , current_max);
            
        
    }
    // Function to find the minimum element in the given BST.
    void minValue(Node node) {
        if(node==null) return ;
    Minmax ans = solve(node);
    System.out.println("The min in " + ans.min + " and the max is" + " " +ans.max);

        
    }
}
