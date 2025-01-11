import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 정수 입력
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // 결과 출력
        System.out.println(A + B);

        scanner.close();
    }
}