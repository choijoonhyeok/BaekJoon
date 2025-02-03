import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 입력 받기
        int H = s.nextInt();
        int W = s.nextInt();
        int N = s.nextInt();
        int M = s.nextInt();
        s.close();  // Scanner 닫기

        // 올림(ceil) 연산을 위해 (X + Y - 1) / Y 사용
        int rowCount = (H + N) / (N + 1);
        int colCount = (W + M) / (M + 1);

        // 결과 출력
        System.out.println(rowCount * colCount);
    }
}
