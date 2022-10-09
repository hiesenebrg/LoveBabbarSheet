import java.util.Scanner;

public class FactorialofaLargeNumber {
    public static void  Foaln(Node tail , int i ){
            Node prev = tail;
            Node temp  = tail;

            int carry  = 0;
            while (temp!=null) {
                int data = temp.data*i  + carry;
                temp.data = data%10;
                carry = data/10;
                prev = temp;
                temp = temp.prev;
            }
            while(carry!=0){
                Node neu = new Node(carry%10);
                prev.prev = neu;
                
                carry = carry/10;
                prev = prev.prev;
            }
            
    }
    public static Node foaln(int n) {
        Node tail = null;
        for (int i = 2; i <=n; i++) {
             Foaln(tail, i);
        }
        
        return tail;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node ans = foaln(n);
        while(ans!=null){
            System.out.print(ans.data);
            ans = ans.prev;
        }
    }
}
