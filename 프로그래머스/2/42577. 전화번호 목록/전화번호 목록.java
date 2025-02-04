import java.util.Scanner;
import java.util.HashSet;
class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> hm = new HashSet<>();
        for(String number:phone_book){
            hm.add(number);
        }
        
        for(String number:phone_book){
            for(int i=1; i<number.length();i++){
                if(hm.contains(number.substring(0,i))) return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        String str = s.nextLine();
        str=str.replace("[\"","").replace("\"]","");
        String phone_book[] = str.split("\", \"");
        
        Solution sol = new Solution();
        System.out.print(sol.solution(phone_book));
    }
}