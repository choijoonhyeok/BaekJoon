import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();
        
        //int ans = Integer.parseInt(t); // 3개로 나누고 치환
        for(int i=0; i<t.length(); i++){
        if(i+pLen<=t.length()&&t.substring(i,i+pLen).compareTo(p) <=0)
        //System.out.println(t.substring(i,i+pLen).compareTo(p));  
            answer++;
        }
        
        
        
        
        return answer;
    }
}