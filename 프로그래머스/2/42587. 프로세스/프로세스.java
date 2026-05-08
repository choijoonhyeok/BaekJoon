import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        
        Queue <int[]> queue = new ArrayDeque<>();
        
        for(int i=0; i<priorities.length;i++){
            queue.offer(new int[]{i,priorities[i]});
        }
        
       
        int answer = 0;
        
        while(!queue.isEmpty()){
             // 1. 실행 대기 큐(Queue)에서 대기중인 프로세스 하나를 꺼냅니다.
            int [] current = queue.poll();
            
            boolean hasHigher = false;
            // 2. 큐에 대기중인 프로세스 중 우선순위가 더 높은 프로세스가 있다면 방금 꺼낸 프로세스를 다시 큐에 넣습니다.
            for(int[]next:queue){
                if(next[1]>current[1]){
                    hasHigher = true;
                    break;
                }
            }
            if(hasHigher){
                queue.offer(current);
            }
            else{
                answer++;
                
                if(current[0]==location){
                    return answer;
                }
                
            }
            
            
        }
        

        return answer;
    }
}