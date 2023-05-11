public class Wewe {
    static boolean divisor(int a , int b){
        int gcd= 1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0&&b%i==0){
                gcd=  i;
            }
        }
        return gcd<=1;
    }
    static int check(int[]array){
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]>array[i+1] && divisor(array[i] ,array[i+1])){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {4,1,3,2};
    System.out.println(check(arr));
    }
}

