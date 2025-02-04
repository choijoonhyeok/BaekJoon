import java.util.Scanner;
import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> hm =new HashMap<>();
       
        for(String player :participant){
            hm.put(player,hm.getOrDefault(player,0)+1);
        }
        
        for(String player :completion){
            hm.put(player,hm.get(player)-1);
        }
         for(String key :hm.keySet()){
            if(hm.get(key)>0) return key;
        }
        return "";
    }
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        
        String str = s.nextLine();
        str=str.replace("[\"","").replace("\"]","");
        String participant[] = str.split("\", \"");
        
        String str2 = s.nextLine();
        str2=str2.replace("[\"","").replace("\"]","");
        String completion[] = str2.split("\", \"");
        
        Solution sol = new Solution();
        System.out.print(sol.solution(participant,completion));
        
    }
}