
    class Capsule{
        int hieght;
        int diameter;
        public Capsule(int a, int b){
            hieght =a;
            diameter = b;
        }
    }
    public class DiameterofaBInaryTree {
        public static Capsule helper(BinaryTreeNode<Integer> root){
            if(root == null)
               {
                  Capsule cap = new Capsule(0,0);
                return cap;
               }
            Capsule left = helper(root.left);
            Capsule right = helper(root.right);
            int h = Math.max(left.hieght,right.hieght)+1;
            return  new Capsule(h, left.hieght + right.hieght + 1);
               
    }
        public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
            return helper(root).diameter;
        }
}
