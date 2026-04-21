// 신고 횟수 제한없음

//K번 이상 신고된 유는 게시판 정지되면서 사실을 메일로 발송
//마지막에 한꺼번에 계시판 이용 정지를 시키면서 정지 메일을 발송
// k번에 도달한 신고id가 있으면 매일발송이 신고한 사람한테 간다.

       //System.out.println(reportSplit[1]);
            // for(int j=0; j<id_list.length; j++){
            //      if(reportSplit[1].equals(id_list[j])){
            //          reportHash.put(reportSplit[1],+1);
            //      }
                
            //}

import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        String reportSplit[]= new String[2];
        
       Set<String> reportSet = new HashSet<>(Arrays.asList(report)); 
       Map<String,Integer> reportHash = new HashMap<>();
        
        //해쉬 초기화
        Map<String,Integer> userIndex = new HashMap<>();
        for(int i=0;i<id_list.length;i++){
            reportHash.put(id_list[i],0);
            userIndex.put(id_list[i],i);
        }
        
        
        //1. 각자 신고 당한 횟수를 구한다.
         for (String r : reportSet) {
             reportSplit = r.split(" ");
             reportHash.put(reportSplit[1],reportHash.get(reportSplit[1])+1);
            
        }
        
                for(String r :reportSet){
                     reportSplit = r.split(" ");
                    
                    if(reportHash.get(reportSplit[1])>=k){
                    answer[userIndex.get(reportSplit[0])]++;
                    }
                   
        }
         
       
        
        
        // 2. 그리고 그거를 보고 매일을 발송한다.
       
        return answer;
    }
}