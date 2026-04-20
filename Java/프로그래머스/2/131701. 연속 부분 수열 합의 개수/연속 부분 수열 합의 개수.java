import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int n = elements.length;

        // i: 시작 인덱스, len: 부분 수열 길이
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int len = 1; len <= n; len++) {
                sum += elements[(i + len - 1) % n]; // % n으로 원형 처리
                set.add(sum);
            }
        }

        return set.size();
    }
}