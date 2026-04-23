import java.util.*;
//왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락
//오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용
//가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다.
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";  
        
        int Left [] = {3,0};
        int Right[] = {3,2};
        
        for(int num : numbers){
            
        int target[] = getTarget(num);

        if(num==1||num==4||num==7){
            Left = target;
            answer +="L";
        }
        else if(num==3||num==6||num==9){
            Right = target;
            answer +="R";
        }
        else{
            int leftDistance = getDistance(Left,target);
            int rightDistance = getDistance(Right,target);
            
            if(leftDistance > rightDistance){
                Right = target;
                answer +="R";
            } 
            else if(leftDistance < rightDistance){
                Left = target;
                answer +="L";
            }
            else{
                if(hand.equals("right")){
                    Right = target;
                answer +="R";
                }
                else{
                      Left = target;
                answer +="L";
                }
                
            }
            
            
        }
        
        }
        
        return answer;
    }
    
    private int [] getTarget(int num){
        if(num==0) return new int[]{3,1};
        return new int[]{(num-1)/3,(num-1)%3};
    }
    
    private int getDistance(int []number,int []target){
        return Math.abs(number[0]-target[0])+Math.abs(number[1]-target[1]);
    }
}