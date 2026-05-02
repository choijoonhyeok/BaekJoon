import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        
        // 소문자 변환
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        List<String> str1List = getList(str1);
        List<String> str2List = getList(str2);
        
        // 👉 List → Map (개수 세기)
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        
        for(String s : str1List){
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }
        
        for(String s : str2List){
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }
        
        int cross = 0;
        int total = 0;
        
        // 👉 모든 key 합치기
        Set<String> keys = new HashSet<>();
        keys.addAll(map1.keySet());
        keys.addAll(map2.keySet());
        
        // 👉 교집합 / 합집합 계산
        for(String key : keys){
            int a = map1.getOrDefault(key, 0);
            int b = map2.getOrDefault(key, 0);
            
            cross += Math.min(a, b);
            total += Math.max(a, b);
        }
        
        // 👉 예외 처리 (둘 다 공집합)
        if(total == 0) return 65536;
        
        return (int)((double)cross / total * 65536);
    }
    
    public List<String> getList(String s){
        List<String> result = new ArrayList<>();
        
        for(int i = 0; i < s.length() - 1; i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            
            if(Character.isLetter(c1) && Character.isLetter(c2)){
                result.add("" + c1 + c2);
            }
        }
        
        return result;
    }
}