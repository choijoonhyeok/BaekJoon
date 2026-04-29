import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        //String answer = "";
        String sheet[] = new String[8];
        Map<String,Integer> totalSheet = new HashMap<>();
        totalSheet.put("R",0); totalSheet.put("T",0); totalSheet.put("C",0); totalSheet.put("F",0);
         totalSheet.put("J",0); totalSheet.put("M",0); totalSheet.put("A",0); totalSheet.put("N",0);
        
        
        // 가상의 설문지를 survey에 맞게 만들고 거기서 점수 채크
        for(int i=0;i<survey.length;i++){
            String surSplit[]=survey[i].split("");
            String nagative = surSplit[0];
            String positive = surSplit[1];
            
            sheet[1]=nagative; sheet[2]=nagative; sheet[3]=nagative;
            sheet[5]=positive; sheet[6]=positive; sheet[7]=positive;
            
            
            switch(choices[i]){
                    case 1 :  totalSheet.put(sheet[1],totalSheet.getOrDefault(sheet[1],0)+3); break;
                        case 2 : totalSheet.put(sheet[2],totalSheet.getOrDefault(sheet[2],0)+2);break;
                        case 3 : totalSheet.put(sheet[3],totalSheet.getOrDefault(sheet[3],0)+1);break;
                        case 5 : totalSheet.put(sheet[5],totalSheet.getOrDefault(sheet[5],0)+1);break;
                        case 6 : totalSheet.put(sheet[6],totalSheet.getOrDefault(sheet[6],0)+2);break;
                        case 7 : totalSheet.put(sheet[7],totalSheet.getOrDefault(sheet[7],0)+3);break;
                }
            
            }
   //System.out.println(totalSheet); 
        //채크된 점수는 성격유형표에 기입한다.( 상위 4개를 골라야하는데 같은 점수는 그거 알지?)
        
        // 결과 생성
        StringBuilder answer = new StringBuilder();
        String[][] types = {
            {"R","T"},
            {"C","F"},
            {"J","M"},
            {"A","N"}
        };

        for(String[] type : types){
            if(totalSheet.get(type[0]) >= totalSheet.get(type[1])){
                answer.append(type[0]);
            } else {
                answer.append(type[1]);
            }
        }

        return answer.toString();
        
        //return answer;
    }
}