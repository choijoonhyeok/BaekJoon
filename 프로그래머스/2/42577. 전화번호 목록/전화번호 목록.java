// import java.util.*;
// class Solution {
//     public boolean solution(String[] phone_book) {
//         boolean answer = true;
//          Arrays.sort(phone_book);
//         Set <String> set = new HashSet<>();
        
//         for(String phone : phone_book){
//             set.add(phone);
//              for(int i=0;i< phone_book.length;i++){ 
//                  for(int j=0;j<phone.length();j++){
//                      if(phone_book[i].equals(phone.substring(0,j))) {
//                         System.out.println(answer);
//                          return false;
                         
                       
                         
//                      };
                     
//                  }
//              }
//         }
        
//         return answer;
//     }
// }


import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
		    //✅ 해시셋에 phone_book의 전화번호를 모두 저장한다.
	    	Set<String> prefixSet = new HashSet<>();
        for (String number : phone_book) {
            prefixSet.add(number);
        }
        
        	    	
	    	//✅ phone_book의 모든 전화번호를 순회한다.
        for (String number : phone_book) {
        		//✅ i를 1 ~ n까지 순회하며 0 ~ i 까지 부분문자열을 구한다.
        	  for (int i = 1; i < number.length(); i++) {
    	  				//✅ 부분문자열이 해시셋에 있다면 false를 반환한다.
                String sub = number.substring(0, i);
                if (prefixSet.contains(sub)) return false;
            }
        }
        
        //✅ 접두어를 찾지 못했다면 true를 반환한다.
        return true;
    }
}