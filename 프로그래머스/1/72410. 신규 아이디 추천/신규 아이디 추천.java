import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String new_id) {
        //✅ 주어진 문자열의 모든 대문자를 대응되는 소문자로 치환한다.
        String step1 = new_id.toLowerCase();
        //✅ 주어진 문자열에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거한다.
        StringBuilder sb = new StringBuilder();
        for (char c : step1.toCharArray()) {
            if (Character.isAlphabetic((int)c) ||
                Character.isDigit(c) ||
                List.of('-', '_', '.').contains(c)) {
                sb.append(c);
            }
        }
        String step2 = sb.toString();
        //✅ 주어진 문자열에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환한다.
        String step3 = step2;
        while (step3.contains("..")) {
            step3 = step3.replace("..", ".");
        }
        //✅ 주어진 문자열에서 처음과 끝에 위치한 마침표(.)를 제거한다.
        String step4 = step3;
        if (step4.startsWith(".")) 
            step4 = step4.substring(1, step4.length());
        if (step4.endsWith("."))
            step4 = step4.substring(0, step4.length()-1);
        //✅ 주어진 문자열이 빈 문자열이라면, "a"를 대입한다.
        String step5 = (step4.isEmpty()) ? "a" : step4;
        //✅ 주어진 문자열의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거한다.
        String step6 = (step5.length() >= 16) ? step5.substring(0, 15) : step5;
				//✅ 제거 후 마침표(.)가 문자열의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거한다.
        if (step6.endsWith(".")) 
            step6 = step6.substring(0, step6.length()-1);
        //✅ 주어진 문자열의 길이가 2자 이하라면, 마지막 문자를 문자열의 길이가 3이 될 때까지 반복해서 끝에 붙인다.
        String step7 = step6;
        while (step7.length() < 3)
            step7 += step6.charAt(step6.length()-1);
       
        return step7;
    }
}