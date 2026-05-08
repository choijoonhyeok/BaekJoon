import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer ="";
        Map <String,Integer> map = new HashMap<>();
        
        for(String part :participant){
            map.put(part,map.getOrDefault(part,0)+1);
        }
        
        for(String comple:completion){
            map.put(comple,map.getOrDefault(comple,0)-1);
        }
        
        for(String key : map.keySet()){
            if(map.get(key)>0){
                return key;
            }
         
        }
  
        return answer;
    }
}