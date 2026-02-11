import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>() ;
        
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0) answer.add(arr[i]);
        }
        
        if(answer.size()==0) return new int[]{-1};
        
        int answer2[] = new int[answer.size()];
        for(int i=0;i<answer.size();i++){
            answer2[i]= answer.get(i);
        }
        
        
        
        Arrays.sort(answer2);
    
        
        return answer2;
    }
}