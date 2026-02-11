class Solution {
    public int[] solution(long n) {
        
     int count = 0;
        long temp = n;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // 2️⃣ 배열 생성
        int[] answer = new int[count];

       for (int i = 0; i < count; i++) {
            answer[i] = (int)(n % 10);
            n /= 10;
        }

        
        return answer;
    }
}