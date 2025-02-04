import java.util.Scanner;
import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int getNumber=nums.length/2;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
   
        if(hs.size()>=getNumber) return getNumber;
        else return hs.size();
    
    }
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
       
        String str = s.nextLine();
        str=str.replace("[","").replace("]","");
        String str2[] = str.split(",");
        int[] nums=new int[str2.length];
        for(int i=0;i<str2.length;i++ )
        {
            nums[i]=Integer.parseInt(str2[i].trim());
        }
        
        Solution sol = new Solution();
        System.out.print(sol.solution(nums));
    }
}