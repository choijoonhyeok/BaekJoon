import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 이용해 입력 받기
        Scanner sc = new Scanner(System.in);
        
        // 숫자의 개수 N 입력 받기
        int N = sc.nextInt();
        
        // 두 번째 줄에 숫자 N개를 입력받고, 이를 문자열로 처리
        String numbers = sc.next();
        
        // 합을 계산할 변수
        int sum = 0;
        
        // 문자열의 각 문자에 대해 처리
        for (int i = 0; i < N; i++) {
            sum += numbers.charAt(i) - '0';  // 각 문자를 숫자로 변환하여 더함
        }
        
        // 합 출력
        System.out.println(sum);
        
        // Scanner 객체 닫기
        sc.close();
    }
}
