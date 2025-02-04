import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long N = s.nextLong();
        s.close(); // Scanner 닫기

        if (N == 1) { // 1번 방이면 바로 출력
            System.out.println(1);
            return;
        }

        long last = 1;
        long middle = 1;
        long count = 1;

        while (true) {
            middle += 6 * count;
            if (N <= middle) { // 조건 간소화
                System.out.println(count + 1);
                break;
            }
            last = middle;
            count++;
        }
    }
}
