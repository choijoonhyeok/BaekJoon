import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        // 1. 소문자로 변환
        String lower = my_string.toLowerCase();

        // 2. 문자 배열로 변환 후 정렬
        char[] chars = lower.toCharArray();
        Arrays.sort(chars);

        // 3. 다시 문자열로 변환
        return new String(chars);
    }
}
