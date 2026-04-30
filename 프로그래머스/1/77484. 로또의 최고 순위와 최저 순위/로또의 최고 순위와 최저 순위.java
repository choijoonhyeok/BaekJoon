import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] correct=new int [2];
        
        for(int i=0;i<lottos.length;i++){
            if(lottos[i]==0){
                correct[0]+=1;
                continue;
            }
        for(int j=0;j<lottos.length;j++){
                 if(lottos[i]==win_nums[j])  correct[1] +=1;
            }
        }
        System.out.println(correct[0]);
         System.out.println(correct[1]);
        
        answer[0]=getNum(correct[0]+correct[1]);
        answer[1]=getNum(correct[1]);
            
            
            return answer;
        }
        

    
    public int getNum(int num){
        switch(num){
                case 0 : return 6;
                case 1 : return 6;
                case 2 : return 5;
                case 3 : return 4; 
                case 4 : return 3; 
                case 5 : return 2; 
                case 6 : return 1; 
        }
        return 0;
        
    }
}