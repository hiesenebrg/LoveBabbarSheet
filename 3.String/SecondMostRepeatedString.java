public class SecondMostRepeatedString {
    String secFrequent(String arr[], int N)
    {
        HashMap< String , Integer> occ = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            occ.put(arr[i]   , occ.getOrDefault(arr[i] , 0)+1);
        }
        int first_max = Integer.MIN_VALUE, sec_max = Integer.MIN_VALUE;
         
       Iterator<Map.Entry<String, Integer>> itr = occ.entrySet().iterator();
       while (itr.hasNext())
       {
           Map.Entry<String, Integer> entry = itr.next();
           int v = entry.getValue();
           if( v > first_max) {
                sec_max = first_max;
                first_max = v;
            }
      
            else if (v > sec_max &&
                     v != first_max)
                sec_max = v;
       }
        itr = occ.entrySet().iterator();
       while (itr.hasNext())
       {
           Map.Entry<String, Integer> entry = itr.next();
           int v = entry.getValue();
           if (v == sec_max)
                return entry.getKey();
       }
        
       return "";
    
    }
}
