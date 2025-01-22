import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(); // 입력받을 테스트 케이스 개수

        for (int i = 0; i < a; i++) {
            int b = s.nextInt(); // 첫 번째 정수 입력
            int c = s.nextInt(); // 두 번째 정수 입력
            System.out.println(b + c); // 두 정수의 합 출력
        }
        
        s.close(); // Scanner 닫기
    }
}
