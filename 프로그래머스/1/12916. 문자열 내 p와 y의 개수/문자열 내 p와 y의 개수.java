class Solution {
    boolean solution(String s) {
        boolean answer = false;
        String array[] = new String[s.length()];
        array = s.split("");

        int pCount =0;
        int yCount =0;
        
        for(int i=0;i<s.length();i++){

        if(array[i].equals("p")||array[i].equals("P")){      
            pCount+=1;
        }
         else if (array[i].equals("y")||array[i].equals("Y")){
            yCount+=1;
        }
        
        }
        
        if(pCount==yCount) return true;

        return answer;
    }
}