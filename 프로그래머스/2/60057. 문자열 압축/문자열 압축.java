class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        //s.length()/2 나중에보고 수정
        
        for(int i=1; i<=s.length()/2;i++){
            String str ="";
            int count=1;
            
            int j=0;
            for(j=i; j+i<=s.length();j+=i){
                 
                if(s.substring(j,j+i).equals(s.substring(j-i,j))){
                    count +=1;
                    
                }
                else{
                    if(count>1) str += count;
                    
                    str += s.substring(j-i,j);
                    
                    count=1;
                    
                }
                
            }
             if(count > 1) str += count;
            str += s.substring(j - i, j);

            // 🔴 남은 자투리 처리
            if(j < s.length()) {
                str += s.substring(j);
            }
            
           answer = Math.min(answer,str.length());
        }
        
        
        
        
        
        
        
        return answer;
    }
}