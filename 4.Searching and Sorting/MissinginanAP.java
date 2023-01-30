public class MissinginanAP {
public static boolean missinginanAP(int a , int b , int c) {
    if(c==0){
        if(a==b) return true;
        else return false;
    }
    if(b-a<0 || b-a==0)return false;
    if((b-a)%c==0) return true;
    else return false;
}}
