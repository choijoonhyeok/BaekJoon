import java.util.*;
// 선입후출 stack 쓸것
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0; i<moves.length;i++){
            
            for(int j=0;j<board.length;j++){
                if(board[j][moves[i]-1]!=0){
                    
                    // 만약 queue 마지막이랑 queue에 넣는게 같으면 pop 그리고 answer +1
                    int lastIndex = stack.size();
                    
                    if(!stack.isEmpty()&&stack.peek()==board[j][moves[i]-1]){
                        stack.pop();
                        answer+=2;
                        //System.out.println(stack);
                         board[j][moves[i]-1]=0; 
                        break;
                    }
                        
                    // queue에 넣기
                    stack.push(board[j][moves[i]-1]);
                    
                    
                    // 빼고난 자리 0으로 세팅
                    board[j][moves[i]-1]=0; 
                    //System.out.println(stack);
                    break;
                }
                
            }

        }

        
        
        return answer;
    }
}