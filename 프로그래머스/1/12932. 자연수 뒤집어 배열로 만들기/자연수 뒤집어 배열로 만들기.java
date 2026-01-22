import java.util.*;
class Solution {
    public int[] solution(long n) {
        
        String nStr = new StringBuilder(Long.toString(n)).reverse().toString();
            
        //     System.out.print(nStr);
        
        int[] answer = new int[nStr.length()];
        
        String[] nArray = nStr.split("");
        for(int i=0;i<nStr.length();i++){
            answer[i] = Integer.parseInt(nArray[i]);

        }
                

        
        
        return answer;
    }
}