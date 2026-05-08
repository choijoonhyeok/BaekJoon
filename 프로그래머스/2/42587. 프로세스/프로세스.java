import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue <Integer> queue = new ArrayDeque<>();
        
        for(int pri :priorities){
            queue.offer(pri);
        }
        
       
        int answerArr[] = new int[priorities.length];
        
        for(int i=0; i<priorities.length;i++){
            // 1. 실행 대기 큐(Queue)에서 대기중인 프로세스 하나를 꺼냅니다.
            int current = queue.poll();
             int count = 1;
           
            // 2. 큐에 대기중인 프로세스 중 우선순위가 더 높은 프로세스가 있다면 방금 꺼낸 프로세스를 다시 큐에 넣습니다.
             for(int j=i+1; j<priorities.length;j++){
                 if(current<priorities[j]) {
                     queue.offer(current);
                     else count++;
                     break;
                 }
                 
             }
// 3. 만약 그런 프로세스가 없다면 방금 꺼낸 프로세스를 실행합니다.
//   3.1 한 번 실행한 프로세스는 다시 큐에 넣지 않고 그대로 종료됩니다.
           
            answerArr[i]= count;
              System.out.println(queue);
             System.out.println(answerArr[i]);
        }
        
        

        
        
        
        
        return answerArr[location];
    }
}