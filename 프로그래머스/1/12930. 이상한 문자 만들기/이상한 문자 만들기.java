import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String array[] = s.split(" ", -1); // 공백 유지

        for (int i = 0; i < array.length; i++) {
            String arr[] = array[i].split("");

            for (int j = 0; j < arr.length; j++) {
                if (j % 2 == 0) {
                    arr[j] = arr[j].toUpperCase();
                } else {
                    arr[j] = arr[j].toLowerCase();
                }
                answer.append(arr[j]);
            }

            // 단어 사이 공백 추가 (마지막 제외)
            if (i != array.length - 1) {
                answer.append(" ");
            }
        }

        return answer.toString();
    }
}
