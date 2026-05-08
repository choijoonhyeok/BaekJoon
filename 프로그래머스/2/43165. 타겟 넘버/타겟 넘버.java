import java.util.*;
class Solution {
    public int solution(int[] numbers, int target) {
      return backTracking(numbers,target,0,0);
    }
    int backTracking(int[] numbers,int target,int idx,int sum){
        if(idx==numbers.length){
            return (target==sum) ? 1 : 0;
        }
        
        int count =0;
        count += backTracking(numbers,target,idx+1,sum+numbers[idx]);
        count += backTracking(numbers,target,idx+1,sum-numbers[idx]);
        
        return count;
    }
    
}

















// class Solution {
//     public int solution(int[] numbers, int target) {
//         return backTracking(numbers,target,0,0);
//     }
//     int backTracking(int[] numbers, int target,int sum,int idx){
//         if(idx==numbers.length){
//             return (sum==target)?1:0;
//         }
//         int count =0;
//        count += backTracking(numbers,target,sum+numbers[idx],idx+1);
//         count += backTracking(numbers,target,sum-numbers[idx],idx+1);
//         return count;
        
//     }
// }


