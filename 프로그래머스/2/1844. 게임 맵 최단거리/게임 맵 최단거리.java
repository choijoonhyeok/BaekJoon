import java.util.*;
class Solution {
    int dr[] = {1,-1,0,0};
    int dc[] = {0,0,1,-1};
    public int solution(int[][] maps) {
        
        int rlen = maps.length;
        int clen = maps[0].length;
        boolean visited[][] = new boolean[rlen][clen];
        Queue <int[]> queue= new ArrayDeque<>();
        queue.add(new int[]{0,0,1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()){
        int cur[] = queue.remove();
        int cr = cur[0]; int cc = cur[1]; int distance = cur[2];
        
        if(cr==rlen-1&&cc==clen-1) return distance;
        
        for(int i=0;i<4;i++){
            int nr = cr + dr[i];
            int nc = cc + dc[i];
            
            if(nr>=0&&nr<rlen&&nc>=0&&nc<clen&&maps[nr][nc]==1){
                if(!visited[nr][nc]){
                    visited[nr][nc] = true;
                    queue.add(new int[]{nr,nc,distance+1});
                    
                }
                
            }
            
            
            
        }
            
            
        }
        
    
        
        return -1;
    }
    

        
        
        
        
    
    
    
    
}