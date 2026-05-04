import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int [prices.length];
        
        for(int i=0;i<prices.length;i++ ){
            int nowPrice =prices[i];
            int time =0;
            
            for(int j=i+1;j<prices.length;j++){
                
                
                 if(nowPrice<=prices[j]){
                    time++;
                     if(j==prices.length-1){
                         answer[i]=time;
                          break;
                     }
                     
                 }
                 else {
                     answer[i]=time+1; 
                     break;
                 }
       // answer[i]=j;
       //          System.out.println(answer[i]);
                
            }
            //System.out.print();
            
        }
        return answer;
    }
}