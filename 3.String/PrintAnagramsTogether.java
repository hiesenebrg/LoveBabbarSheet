public class PrintAnagramsTogether {
    public List<List<String>> Anagrams(String[] string_list) {
        String[] sorted_string_list = new String[string_list.length];
       for( int i = 0 ; i<string_list.length;i++){
           char[] temp = string_list[i].toCharArray();
           Arrays.sort(temp);
           sorted_string_list[i] =new  String(temp);
       }
       HashMap<String , ArrayList<String>> maps = new HashMap<String , ArrayList<String>>();
       for( int i = 0 ; i<sorted_string_list.length;i++){
           if(maps.containsKey(sorted_string_list[i])){
                ArrayList<String> temp = maps.get(sorted_string_list[i]);
                temp.add(string_list[i]);
                maps.put(sorted_string_list[i] ,temp);
           }else{
                maps.put(sorted_string_list[i] ,new ArrayList<String>());
                ArrayList<String> temps = maps.get(sorted_string_list[i]);
                temps.add(string_list[i]);
                

               maps.put(sorted_string_list[i] ,temps);
           }
       }
       List<List<String>> ans = new ArrayList<>();
       
       maps.forEach((k,v) -> ans.add(v));
       return ans;
    }
}
