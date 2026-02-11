class Solution {
    public long[] solution(int x, int n) {
        long answer[] =new long[n]; 
        long sumX = x;
        
        for(int i =0; i<n;i++){
       answer[i] = sumX;
        sumX = sumX+x;
        }
        
        return answer;
    }
}