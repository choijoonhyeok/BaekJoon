//bfs 사용
//visited 사용
//queue 사용
import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        
        boolean visited[] = new boolean[words.length] ;
        Queue<wordState> queue = new ArrayDeque <>();
        queue.add(new wordState(begin,0));
        
       // wordState cur = queue.remove();
        
        
       
       // System.out.println(result);
       
        
        while(!queue.isEmpty()){
        wordState now = queue.remove();
        
        String curWord = now.word;
        int curCount = now.num;
        
        if(curWord.equals(target)) return curCount;
        
        for(int i=0;i<words.length;i++){
            if(getDiffCount(curWord,words[i])==1&&!visited[i]){
                visited[i]=true;
                queue.add(new wordState(words[i],curCount+1));
            }
        }
        
            
            
        }
        
        
        
        return 0;
    }
    
    int getDiffCount(String word,String target){
       int diffCount=0;
        
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)!=target.charAt(i)) diffCount+=1;
        }
        return diffCount;
    }
    
    class wordState{
        String word;
        int num;
        wordState(String word,int num){
            this.word= word ;
            this.num=num  ;
        }
        
    }
}