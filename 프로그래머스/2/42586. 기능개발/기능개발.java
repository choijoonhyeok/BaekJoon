import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        //완료 일 구하기
        Queue <Integer> queue = new ArrayDeque<>();
        for(int i=0;i<progresses.length;i++){
            int endDay = (100-progresses[i]+speeds[i]-1)/speeds[i];
            queue.offer(endDay);
           
        }
        
        
       List <Integer>answerList = new ArrayList<>(); 
    while(!queue.isEmpty()){
        int now = queue.poll();
        int count =1;
        while(!queue.isEmpty()&&queue.peek()<=now){
            queue.poll();
            count++;
        }
    
        answerList.add(count);
    }
         System.out.println(answerList);
        
        return answerList.stream().mapToInt(i->i).toArray();
    }
}