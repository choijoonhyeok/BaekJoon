class Solution {
    public int solution(String A, String B) {
        // 길이가 다르면 애초에 불가능
        if (A.length() != B.length()) {
            return -1;
        }

        // 이미 같은 경우
        if (A.equals(B)) {
            return 0;
        }

        String current = A;

        for (int i = 1; i <= A.length(); i++) {
            // 오른쪽으로 한 칸 밀기
            current = current.charAt(current.length() - 1)
                    + current.substring(0, current.length() - 1);

            if (current.equals(B)) {
                return i;
            }
        }

        return -1;
    }
}
