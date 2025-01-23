import java.io.*;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Long> stack = new ArrayDeque<>();

        long n = Long.parseLong(br.readLine()); // 첫 번째 입력 값
        StringBuilder sb = new StringBuilder(); // 출력 최적화

        for (long i = 0; i < n; i++) {
            String[] input = br.readLine().split(" "); // 명령어와 값을 분리
            long m = Long.parseLong(input[0]);

            if (m == 1) {
                long x = Long.parseLong(input[1]);
                stack.push(x);
            } else if (m == 2) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }
            } else if (m == 3) {
                sb.append(stack.size()).append("\n");
            } else if (m == 4) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (m == 5) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.peek()).append("\n");
                }
            }
        }

        System.out.print(sb.toString()); // 한 번에 출력
    }
}
