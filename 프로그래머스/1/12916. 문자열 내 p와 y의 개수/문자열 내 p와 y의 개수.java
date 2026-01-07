class Solution {
    boolean solution(String s) {
        int yTotal=0;
        int pTotal=0;
        for(int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            if(cur=='p'||cur=='P'){
                pTotal+=1;
            }
            else if(cur=='y'||cur=='Y'){
                 yTotal+=1;
            }
        }
        if(pTotal==yTotal) return true;

        return false;
    }
}