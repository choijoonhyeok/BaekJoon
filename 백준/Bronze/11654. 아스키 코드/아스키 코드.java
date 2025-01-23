import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 이용해 입력 받기
        Scanner sc = new Scanner(System.in);
        
        // 문자 입력 받기
        char c = sc.next().charAt(0);
        
        // 아스키 코드 값 출력
        System.out.println((int) c);
        
        // Scanner 객체 닫기
        sc.close();
    }
}
