import java.util.*;

class Pair<T,K>{
    public T a;
    public K  b;
    public    Pair(T a , K b){
        this.a = a;
        this.b = b;
    }
}
// remeber in top view hashmap will not update while in bottom update , hashmap will update
public class BottomView {
    public static void bottomView(BinaryTreeNode<Integer> root){
        HashMap<Integer, Integer> hm = new HashMap<>();
        Queue<Pair<BinaryTreeNode<Integer>, Integer>> pendingNodess = new LinkedList<Pair<BinaryTreeNode<Integer>, Integer>>();
        if(root==null){
            return ;
        }
        Pair<BinaryTreeNode<Integer>, Integer> pair = new Pair(root, 0);
        pendingNodess.add(pair);
        while(!pendingNodess.isEmpty()){
            BinaryTreeNode<Integer> first = pendingNodess.peek().a;
            int h = pendingNodess.peek().b;
            pendingNodess.poll();
            if(!hm.containsKey(h)){
                hm.put(h,first.data );
            }else{
                hm.put(h,first.data);
            }
            if(first.left!=null){
                pendingNodess.add(new Pair(first.left , h-1));
            }
            if(first.right!=null){
                pendingNodess.add(new Pair(first.right , h+1));
            }

        }
        // this is how to iterate on the Hashmap
       Iterator iter = hm.entrySet().iterator();
       while(iter.hasNext()){
        Map.Entry mapElement = (Map.Entry)iter.next();
        System.out.println(mapElement.getValue() + " ");
       }
    }
    public static void PrintTree(BinaryTreeNode<Integer> root) {  
            if(root==null){
                return;
            }
            Queue<BinaryTreeNode<Integer>> pendingnodess = new LinkedList<BinaryTreeNode<Integer>>();
            pendingnodess.add(root);
            while(!pendingnodess.isEmpty()){
                BinaryTreeNode<Integer> node = pendingnodess.peek();
                pendingnodess.poll();
                System.out.print(node.data + ": ");
                if(node.left!=null){
                    System.out.print("L:" + node.left.data + " ");
                    pendingnodess.add(node.left);
                }else{
                    System.out.print("L:" + "-1" + " ");
                }
                if(node.right!=null){
                    System.out.print("R:" + node.right.data + " ");
                    pendingnodess.add(node.right);
                }else{
                    System.out.print("R:" +"-1" + " ");
                }
                System.out.println();
            }
    }
    public static BinaryTreeNode<Integer> takeinputLevelWise(){
        Scanner s= new Scanner(System.in);
        int rootData= s.nextInt();

        if(rootData==-1) return null;

        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren= new LinkedList<BinaryTreeNode<Integer>>();
        pendingChildren.add(root);

        while(!pendingChildren.isEmpty()){
            BinaryTreeNode<Integer> front= pendingChildren.poll();
            System.out.println("Enter left child of "+ front.data);
            int left= s.nextInt();
            if(left!=-1){
                    BinaryTreeNode<Integer> leftChild= new BinaryTreeNode<Integer>(left);
                    front.left= leftChild;
                    pendingChildren.add(leftChild);
            }

            System.out.println("Enter right child of "+ front.data);
            int right= s.nextInt();
            if(right!=-1){
                    BinaryTreeNode<Integer> rightChild= new BinaryTreeNode<Integer>(right);
                    front.right= rightChild;
                    pendingChildren.add(rightChild);
            }
        }
        return root;
    
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeinputLevelWise();
        bottomView(root);
        // PrintTree(root);

    }
}
