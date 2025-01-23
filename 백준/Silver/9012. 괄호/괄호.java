import java.util.Scanner;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스 수
        scanner.nextLine(); // 개행 처리
        
        for (int t = 0; t < T; t++) {
            String ps = scanner.nextLine(); // 괄호 문자열 입력
            if (isValidParenthesisString(ps)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
    
    // VPS 여부를 확인하는 함수
    private static boolean isValidParenthesisString(String ps) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        
        for (char ch : ps.toCharArray()) {
            if (ch == '(') {
                stack.push(ch); // 여는 괄호를 스택에 추가
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false; // 스택이 비어 있으면 VPS가 아님
                }
                stack.pop(); // 짝이 맞는 괄호 제거
            }
        }
        
        // 스택이 비어 있으면 VPS, 아니면 비정상
        return stack.isEmpty();
    }
}