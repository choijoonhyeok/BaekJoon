import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 첫 번째 리스트 입력
        int fn = s.nextInt();
        HashSet<Integer> fset = new HashSet<>();
        for (int i = 0; i < fn; i++) {
            fset.add(s.nextInt());
        }

        // 두 번째 리스트 입력 및 비교
        int sn = s.nextInt();
        for (int i = 0; i < sn; i++) {
            int sint = s.nextInt();
            if (fset.contains(sint)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        s.close(); // Scanner 닫기
    }
}
