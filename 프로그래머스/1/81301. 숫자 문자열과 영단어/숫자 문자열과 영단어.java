class Solution {
    public int solution(String s) {
        String StrAns ="";
        String dic[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String Numdic[] = {"0","1","2","3","4","5","6","7","8","9"};
        
        for(int i=0;i<s.length();i++){
            String gather="";
            for(int j=i;j<s.length();j++){
                gather+=s.charAt(j);
                
                for(int z=0;z<10;z++){
                    
                     if(gather.equals(Numdic[z])){
                    
                    StrAns+=gather;
                    break;   
                    }
                    
                    
                    if(gather.equals(dic[z])){
                        StrAns+=z;
                       
                        j+=i-1;
                        break;
                    } 
                    
                }              
            }
        }
        
        //System.out.println(StrAns);
        
        
        
        
        return Integer.parseInt(StrAns);
    }
}