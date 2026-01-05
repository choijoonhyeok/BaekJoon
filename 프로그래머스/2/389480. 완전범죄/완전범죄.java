import java.util.Arrays;

class Solution {
    public int solution(int[][] info, int n, int m) {
        final int INF = 1_000_000;
        
        // dp[b] = B의 흔적이 b일 때 가능한 A의 최소 흔적
        int[] dp = new int[m];
        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int[] item : info) {
            int a = item[0];
            int b = item[1];

            int[] next = new int[m];
            Arrays.fill(next, INF);

            for (int curB = 0; curB < m; curB++) {
                if (dp[curB] == INF) continue;

                // 1. A가 훔치는 경우
                if (dp[curB] + a < n) {
                    next[curB] = Math.min(next[curB], dp[curB] + a);
                }

                // 2. B가 훔치는 경우
                if (curB + b < m) {
                    next[curB + b] = Math.min(next[curB + b], dp[curB]);
                }
            }
            dp = next;
        }

        int answer = INF;
        for (int b = 0; b < m; b++) {
            answer = Math.min(answer, dp[b]);
        }

        return answer == INF ? -1 : answer;
    }
}
