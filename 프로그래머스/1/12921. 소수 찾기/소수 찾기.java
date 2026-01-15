class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int j=1;j<=n;j++){
            if(isPrime(j)==true){
                answer+=1;
            }
        }
        
        return answer-1;
    }
    
     boolean isPrime(int num){
            if(num <= 1) return true;
            for(int i=2;i*i<=num;i++){
                if(num%i==0) return false;
            }            
            
            return true;
        }
        
}