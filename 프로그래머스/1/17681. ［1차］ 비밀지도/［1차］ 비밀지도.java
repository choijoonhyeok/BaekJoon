class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        char[][] map1 = new char [n][n];
        char[][] map2 = new char [n][n];
        
        //String map="";
        toEjin(n,arr1,map1);
        toEjin(n,arr2,map2);
        
       
        //System.out.println(result+="#");
        
        
         for(int i=0; i<n; i++){
              String result="";
             for(int j=0; j<n; j++){
              if(map1[i][j]=='1'||map2[i][j]=='1') {result+='#';}
              else {result+=" ";}
                 
             }
             answer[i] = result;
         }
       
        
        return answer;
    }
    
    void toEjin(int n, int[] arr, char[][] map){
        for(int i=0; i<n; i++){
            String line = Integer.toBinaryString(arr[i]);
            if(line.length()<n){
                while (line.length() < n) {
                    line = "0" + line;
                    }
            }
            for(int j=0; j<n; j++){
                map[i][j] = line.charAt(j);
            }
            
        }
        
    }

}

