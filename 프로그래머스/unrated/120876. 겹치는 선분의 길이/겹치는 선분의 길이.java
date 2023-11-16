import java.util.Arrays;

class Solution {
              public int solution(int[][] lines) {
        int answer;

        //-100~100 > 0~200으로 변경
        final int shift = 100;
        int[] counter = new int[200];

        for(int[] line : lines) {
            // 범위 처리
            int s = Math.max(0, Math.min(line[0] + shift, 199));
            int e = Math.max(0, Math.min(line[1] + shift, 200));
            
            // 좌표에 표시
            for(int i = s; i < e; i++) {
                ++counter[i];
            }
        }

       answer = (int) Arrays.stream(counter)
                .filter((e) -> e > 1)
                .count();

//        다른 추출 방법)
//        answer = Arrays.stream(counter)
//                // 1보다 큰 경우만 1로 추출
//                .map((e) -> e > 1 ? 1:0)
//                // 덧셈 처리
//                .reduce((acc, e) -> acc + e)
//                .getAsInt();

        return answer;
    }
}