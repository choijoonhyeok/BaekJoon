import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int s : scoville){
            pq.add(s);
        }

        int answer = 0;

        while(pq.size() > 1 && pq.peek() < K){
            int first = pq.poll();
            int second = pq.poll();

            int scovResult = first + second * 2;
            pq.add(scovResult);

            answer++;
        }

        if(pq.peek() >= K) return answer;
        return -1;
    }
}