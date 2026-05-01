import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        
        for(int i=1;i<=s.length();i++){
            int count =1;
            StringBuilder sb = new StringBuilder();
            
            
             for(int j=0;j<s.length();j+=i){
                 
                 String cur;
                 
                 if(j+i<=s.length()){
                    cur=s.substring(j,j+i);
                 }
                 else{
                     cur=s.substring(j);
                 }
                 
                 String next="";
                    if(j+2*i<=s.length()){
                      next=  s.substring(j+i,j+2*i);
                    }
                 
                 if(cur.equals(next)){
                     count++;
                 }
                 else{
                     if(count>1){
                        sb.append(count);
                     }
                     sb.append(cur);
                 count=1;
                 }
                 
                
                
             }
            answer =Math.min(answer,sb.length());
        }
        
        return answer;
    }
}