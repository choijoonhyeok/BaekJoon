import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        //int[] answer = new int [3];
        List<Integer> answer = new ArrayList<>();
        
        //1번 
        int[][] treeAnswer ={{1, 2, 3, 4, 5},
                             {2, 1, 2, 3, 2, 4, 2, 5},
                             {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}} ;  
        int[] totalCorrect = new int [3];
        
        for(int j=0;j<3;j++){
            
        for(int i=0;i<answers.length;i++){
            
               if(treeAnswer[j][i % treeAnswer[j].length] == answers[i]){
                    totalCorrect[j]+=1;
                }
                
            }
         }
        
        // 제일 큰게 있으면 그거 하나 들어가면 되고
        // 똑같은거 있으면 같이 들어가면 되고
 
        int totalMax=Math.max(totalCorrect[0],Math.max(totalCorrect[1],totalCorrect[2]));

        for(int i=0;i<3;i++){
            if(totalMax==totalCorrect[i]){
            answer.add(i+1);    
            }
        }
       
        return answer.stream().mapToInt(i -> i).toArray();
    }
}