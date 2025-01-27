import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 입력: 상근이가 가지고 있는 숫자 카드의 개수 N
        int N = sc.nextInt();

        // 숫자 카드 개수를 저장할 HashMap
        HashMap<Integer, Integer> cardMap = new HashMap<>();

        // 두 번째 입력: 숫자 카드에 적힌 정수
        for (int i = 0; i < N; i++) {
            int card = sc.nextInt();
            cardMap.put(card, cardMap.getOrDefault(card, 0) + 1);
        }

        // 세 번째 입력: 확인할 숫자 카드의 개수 M
        int M = sc.nextInt();

        // 네 번째 입력: M개의 정수
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int query = sc.nextInt();
            result.append(cardMap.getOrDefault(query, 0)).append(" ");
        }

        // 결과 출력
        System.out.println(result.toString().trim());

        sc.close();
    }
}