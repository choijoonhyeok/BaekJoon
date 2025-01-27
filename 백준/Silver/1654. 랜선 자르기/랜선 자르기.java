import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); // 랜선의 개수
        long m = s.nextLong(); // 필요한 랜선 개수
        int[] lan = new int[n];
        
        long max = 0; // 가장 긴 랜선 길이
        for (int i = 0; i < n; i++) {
            lan[i] = s.nextInt();
            if (lan[i] > max) {
                max = lan[i];
            }
        }

        long left = 1; // 최소 길이
        long right = max; // 최대 길이
        long result = 0;

        // 이분 탐색
        while (left <= right) {
            long mid = (left + right) / 2; // 중간 길이
            long count = 0;

            // 자른 랜선 개수 계산
            for (int i = 0; i < n; i++) {
                count += lan[i] / mid;
            }

            if (count >= m) { // 충분히 많은 랜선을 만들 수 있다면
                result = mid; // 가능한 길이를 저장
                left = mid + 1; // 더 긴 길이 시도
            } else { // 부족하다면
                right = mid - 1; // 더 짧은 길이 시도
            }
        }

        System.out.println(result); // 최대 랜선 길이 출력
    }
}
