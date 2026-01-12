import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int n = s.length();
        for(int i=0;i<n;i++){
            //
            if(n%2==0){
               answer = s.substring(n/2-1,n/2+1);
                break;
            }
            else{
                answer = s.substring(n/2,n/2+1);
                break;
            }
        }
        
        
        
        return answer;
    }
}