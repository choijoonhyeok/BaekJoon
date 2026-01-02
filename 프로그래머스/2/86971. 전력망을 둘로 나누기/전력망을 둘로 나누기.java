import java.util.*;
class Solution {
    int answer;
    public int solution(int n, int[][] wires) {
        answer = n;
        boolean visited[] = new boolean[n+1];        
        //사용하기 편하게 wires => graph로 변환
        Map<Integer,List<Integer>> graph = new HashMap<>();
        
        for(int i=1;i<=n;i++){
            graph.put(i,new ArrayList<>());
        }
        for(int wire[]:wires){
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }
        //dfs사용 초깃값 1로 설정
        dfs(graph,visited,1,n);
    
        return answer;
    }
    
    int dfs(Map<Integer,List<Integer>> graph,boolean visited[],int cur,int n){
        int count = 1;
        visited[cur]=true;
        
        for(int next:graph.get(cur)){
            if(!visited[next]){
                     
                visited[next]= true;
                count += dfs(graph,visited,next,n);
            }
            
        }
  
        //answer 최적의 값으로 없데이트 n-count*2
            answer = Math.min(answer,Math.abs(n-count*2));
            
            return count;
            //count return

        
    }
}