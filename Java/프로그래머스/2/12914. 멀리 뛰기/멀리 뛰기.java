class Solution {
    public long solution(int n) {
        // n=1이면 바로 반환
        if (n == 1) return 1;

        long[] arr = new long[n + 1];

        // 초기값 세팅
        arr[1] = 1; // 1칸: (1) → 1가지
        arr[2] = 2; // 2칸: (1,1), (2) → 2가지

        // 점화식 (매번 나머지 처리를 해줌. -> 오버플로우 방지)
        for (int i = 3; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
        }

        return arr[n];
    }
}