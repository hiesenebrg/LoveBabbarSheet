import java.util.*;
public class GamewithString {
    static int minValue(String s, int k){
        HashMap<Character , Integer> maps = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            maps.put(s.charAt(i) , maps.getOrDefault(s.charAt(i) ,0)+1);
        }
        
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
          
        maps.forEach((keys,values) -> pq.add(values));
    while(k!=0){
        pq.add(pq.poll()-1);
        k-=1;
    }
    int sum = 0;
    while(!pq.isEmpty()){
        int ans = pq.poll();
        sum+=ans*ans;
        // System.out.println(sum  + " " + ans);
    }
    return sum;
    }
}
