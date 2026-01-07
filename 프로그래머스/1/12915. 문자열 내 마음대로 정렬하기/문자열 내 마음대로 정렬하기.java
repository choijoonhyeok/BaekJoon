import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String [strings.length];
        char[] chr =new char [strings.length];
         Arrays.sort(strings);
        
        for(int i=0;i<strings.length;i++){
            chr[i] = strings[i].charAt(n);
        }
        Arrays.sort(chr);
       boolean visited[] = new boolean[strings.length];
        for(int j=0;j<strings.length;j++){
            for(int z=0;z<strings.length;z++){
            if(chr[j]==strings[z].charAt(n)&&!visited[z]){
                answer[j]=strings[z];
                visited[z]=true;
                break;
            }
            

                }
            System.out.println(answer[j]);
        }
        
        

        //같은문자가 여럿=>사전순으로 앞선문자열이 앞쪽
            
 
        return answer;
    }
}