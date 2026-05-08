import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(int scov :scoville){
            pq.offer(scov);
        }
        
        int answer = 0;
              for(int i = 0; i < scoville.length; i++){

            // 가장 작은 값이 K 이상이면 종료
            if(pq.peek() >= K){
                return answer;
            }

            // 섞을 음식이 부족하면 실패
            if(pq.size() == 1){
                return -1;
            }

            int first = pq.poll();
            int second = pq.poll();

            int result = first + (second * 2);

            pq.offer(result);

            answer++;
        }
            
        
        
          //System.out.print(pq.poll());
        
        
        return answer;
    }
}