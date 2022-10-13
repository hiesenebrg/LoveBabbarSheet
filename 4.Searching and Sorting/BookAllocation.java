import java.util.Scanner;

public class BookAllocation {
    public static int bookAllocation(int n , int[] books ) {
        int i  =books[0]  , sum = 0;
        for (int k = 0; k < books.length; k++) {
            sum+=books[k];
        }
        
        int j = sum; 
        int mid = 0;
         int ans = 0;
        while(i<=j){
            int student = 1;
                mid = (i+j)/2;
                
                int summ = 0;
                for (int k = 0; k < books.length; k++) {
                   summ += books[k]; 
                   if(summ>mid){
                    student+=1;
                    summ = books[k];
                    
                   }
                      
                }
                
                if(student>n){
                    i = mid+1;
                    
                   }
                if(student<n){
                    j = mid-1;
                }
                if(student==n){
                   
                    ans = mid;
                    j=mid-1;

                }
        }
        return ans;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int number_of_students = sc.nextInt();
       int n = sc.nextInt();
       int[] books = new int[n];
       for (int i = 0; i < n; i++) {
        books[i] = sc.nextInt();
       }
       System.out.println(bookAllocation(number_of_students, books));
    }
}
