import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        //int answer[] ={};
        int n = progresses.length;
        int fArray[] = new int[n];
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<n;i++){
            int lest = 100-progresses[i];
            
            if(lest%speeds[i]>0) fArray[i] = (lest/speeds[i])+1;
            else fArray[i] = lest/speeds[i];
        }
        
        int maxDay = fArray[0];
        int count =1;
        for(int j=1; j<n;j++){
            if(fArray[j]<= maxDay){
                count++;
            }
            else{
                list.add(count);
                count=1;
                maxDay=fArray[j];
            }
        }
        list.add(count);
        
        //System.out.print(list);
        // List → 배열 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        
        return answer;
    }
}