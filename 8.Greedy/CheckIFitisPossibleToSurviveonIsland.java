import java.util.Scanner;

class answer{
    boolean survive;
    int days;
    public answer(boolean suvive , int days){
        this.survive = survive;
        this.days = days;

    }
}

public class CheckIFitisPossibleToSurviveonIsland {
    public static answer checkIFitisPossibleToSurviveonIsland(int s , int n , int m) {
        int total_food = m*s;
        int total_surviving_days  = s - s/7;
        boolean survive = false;
        int days = 0;
        if(total_food%n == 0){
            days = total_food/n;
        }else{
            days = (total_food/n)+1;
        }
        if(days<total_surviving_days){
            survive = true;
        }
        return new answer(survive , days);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s =sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        answer ans = checkIFitisPossibleToSurviveonIsland(s,n,m);
        System.out.println(ans.survive + " " + ans.days);
    }
}
