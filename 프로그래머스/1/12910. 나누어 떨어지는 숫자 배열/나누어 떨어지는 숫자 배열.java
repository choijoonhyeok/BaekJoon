import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
      
        List <Integer> result = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0)
                result.add(arr[i]);

        }
    
        Collections.sort(result);
        
        if(result.size()==0) return new int[]{-1};
        int answer[] = new int[result.size()];
        for(int i=0;i<result.size();i++){
                answer[i] = result.get(i);
        }
        
        
        System.out.print(result);
        
        return answer;
    }
}