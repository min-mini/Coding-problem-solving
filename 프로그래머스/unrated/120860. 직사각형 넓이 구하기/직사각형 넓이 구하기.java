class Solution {
public int solution(int[][] dots) {
        // 좌상우하 x = 좌우, y = 상하
        int left = dots[0][0];
        int top = dots[0][1];
        int right = dots[0][0];
        int bottom = dots[0][1];

        for(int[] dot : dots) {
            // 가로에서 최좌측
            left = Math.min(left, dot[0]);
            // 가로에서 최우측
            right = Math.max(right, dot[0]);
            // 세로에서 최상단
            top = Math.min(top, dot[1]);
            // 세로에서 최하단
            bottom = Math.max(bottom, dot[1]);
        }

        // 가로 크기
        int width = right - left;
        // 세로 크기
        int height = bottom - top;
        // 넓이
        return width * height;
    }
}