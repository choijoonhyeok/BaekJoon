import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;

        //ArrayList<String> list = new ArrayList<>();
        
        String list[] = s.split("");
        
        if(list[0].equals(")")) return false;
        
        for(int i=0;i<list.length;i++){
        if(list[i].equals("(")) count +=1;
        else count -=1;
            
        if (count < 0) return false ;    
        }
        
        if (count !=0) return false ;

        return answer;
    }
}