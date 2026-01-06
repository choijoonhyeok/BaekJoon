import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        for (int j = 0; j < s.length(); j++) {

            int same = 0;
            int diff = 0;
            char x = s.charAt(j);

            for (int i = j; i < s.length(); i++) {

                if (x == s.charAt(i)) same++;
                else diff++;

                if (same == diff) {
                    answer++;
                    j += same + diff - 1;
                    break;
                }

                // ⭐ 끝까지 갔는데 아직 같아지지 않음
                if (i == s.length() - 1) {
                    answer++;
                    j = s.length(); // 외부 for 종료
                }
            }
        }

        return answer;
    }
}
