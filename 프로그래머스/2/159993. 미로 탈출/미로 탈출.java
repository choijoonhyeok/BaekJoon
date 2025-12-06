//maps => graph로 전환
import java.util.*;
class Solution {
    static  int dr[] ={1,-1,0,0}; 
    static    int dc[] ={0,0,1,-1};   
    
    public int solution(String[] maps) {
        
        int start[] = new int[2];
        int levor[] = new int[2];
        int exit[] = new int[2];
        int rLen = maps.length;
        int cLen = maps[0].length();
        
                        
        char graph[][] = new char[rLen][cLen];
        
        
     
            for(int i=0;i<rLen;i++){
                graph[i]=maps[i].toCharArray();
                for(int j=0;j<cLen;j++){
                    if(graph[i][j]=='S') { start[0] =i; start[1] =j; }
    
                    else if(graph[i][j]=='L') {levor[0] =i; levor[1] =j;}

                    else if(graph[i][j]=='E') {exit[0] =i;exit[1] =j;}
                    
                }
                
                 
            }
        //bfs(nc,nr,visited)
        int toLever=bfs(start,levor,graph,rLen,cLen);
         if(toLever==-1 ) return -1;
        int toExit=bfs(levor,exit,graph,rLen,cLen);   
        if(toExit==-1 ) return -1;
                
                
        return toLever + toExit;
     
        
    }
       int bfs(int start[],int exit[],char graph[][],int rLen,int cLen){
           Queue <int[]> queue = new ArrayDeque<>();
            boolean visited[][] = new boolean[rLen][cLen];
            visited[start[0]][start[1]] = true;
            queue.add(new int[]{start[0],start[1],1});
            
             while(!queue.isEmpty()){
            int cur[] = queue.remove();
            int cr = cur[0]; int cc = cur[1]; int distance = cur[2];
            
            
            for(int z=0;z<4;z++){
                int nr = cr + dr[z];
                int nc = cc + dc[z];
            
            if(nr==exit[0]&&nc==exit[1]&&!visited[nr][nc]) return distance;
                
             
            else if(nr>=0&&nr<rLen&&nc>=0&&nc<cLen&&graph[nr][nc]!='X'){
                    if(!visited[nr][nc]){
                         visited[nr][nc]=true;
                        queue.add(new int[]{nr,nc,distance+1});
       
                        
                    }
                }
            }
        }
            
            return -1;
        }
}