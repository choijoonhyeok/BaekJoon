import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // 결과 저장 배열

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1; // 1-based index -> 0-based index
            int end = commands[i][1]; // 종료 인덱스 그대로 사용
            int k = commands[i][2] - 1; // 1-based index -> 0-based index

            int[] subArray = Arrays.copyOfRange(array, start, end); // 부분 배열 추출
            Arrays.sort(subArray); // 정렬

            answer[i] = subArray[k]; // k번째 값 저장
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 첫 번째 입력: 숫자 배열
        String str = s.nextLine();
        str = str.replace("[", "").replace("]", ""); // 대괄호 제거
        String words[] = str.split(","); // 숫자 분리
        int array[] = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            array[i] = Integer.parseInt(words[i].trim()); // 공백 제거 후 정수 변환
        }

        // 두 번째 입력: commands 배열
        String str2 = s.nextLine();
        str2 = str2.replace("[[", "").replace("]]", ""); // 대괄호 제거
        String[] pairs = str2.split("\\],\\["); // 2차원 배열 분리

        ArrayList<int[]> list = new ArrayList<>();
        for (String pair : pairs) {
            String numbers[] = pair.split(","); // 쉼표로 분리 (공백 제거)
            int[] row = {Integer.parseInt(numbers[0].trim()), Integer.parseInt(numbers[1].trim()), Integer.parseInt(numbers[2].trim())};
            list.add(row);
        }

        int[][] commands = new int[list.size()][3];
        for (int i = 0; i < list.size(); i++) {
            commands[i] = list.get(i);
        }

        // Solution 실행
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(array, commands))); // 결과 출력
    }
}
