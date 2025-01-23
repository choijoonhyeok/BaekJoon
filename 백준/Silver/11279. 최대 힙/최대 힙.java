import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int n = s.nextInt(); // 테스트 케이스 수
        
        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            
            if (x == 0) {
                if (maxHeap.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(maxHeap.poll()); // 최댓값 출력 후 제거
                }
            } else {
                maxHeap.add(x); // 값을 힙에 추가
            }
        }
    }
}
