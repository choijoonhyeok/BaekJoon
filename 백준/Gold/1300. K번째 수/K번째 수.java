import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int k = s.nextInt();
        
        long left = 1;
        long right = k;
        
        while (left < right) {
            long mid = (left + right) / 2;
            long count = 0;
            
            // mid 이하의 숫자 개수 계산
            for (int i = 1; i <= n; i++) {
                count += Math.min(mid / i, n);
            }
            
            if (count >= k) {
                right = mid; // 더 작은 값 탐색
            } else {
                left = mid + 1; // 더 큰 값 탐색
            }
        }
        
        System.out.print(left); // left == right일 때 정답
    }
}
