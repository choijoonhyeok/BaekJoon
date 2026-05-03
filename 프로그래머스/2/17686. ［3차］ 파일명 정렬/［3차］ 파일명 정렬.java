import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        
        List<String[]> fileList = new ArrayList<>();
            
        // 1. Head, Number, Tail 나누기
        for(String file : files){
            String head = "";
            String number = "";
            String tail = "";
            
            int i = 0;
            
            // HEAD: 숫자 나오기 전까지
            while(i < file.length() && !Character.isDigit(file.charAt(i))){
                head += file.charAt(i);
                i++;
            }
                
            // NUMBER: 숫자 최대 5자리
            while(i < file.length() && Character.isDigit(file.charAt(i)) && number.length() < 5){
                number += file.charAt(i);
                i++;
            }
            
            // TAIL: 나머지
            if(i < file.length()){
                tail = file.substring(i);
            }
            
            fileList.add(new String[]{head, number, tail});
        }
        
        // 2. 정렬
        Collections.sort(fileList,(a,b)->{
            int headCompare = a[0].toLowerCase().compareTo(b[0].toLowerCase());
            if(headCompare!=0) return headCompare;
            
            return Integer.parseInt(a[1])-Integer.parseInt(b[1]);
        });
        
        // 3. 결과 만들기
        String[] answer = new String[fileList.size()];
        
        for(int i = 0; i < fileList.size(); i++){
            String[] arr = fileList.get(i);
            answer[i] = arr[0] + arr[1] + arr[2];
        }
        
        return answer;
    }
}