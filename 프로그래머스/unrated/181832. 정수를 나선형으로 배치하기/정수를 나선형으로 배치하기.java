class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int val = 1;
        // 총 길이 = 배열의 끝 위치 + 1 이므로 - 1
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        // 배열의 길이 만큼 우+
        // 도달 시, 하 +1, 도달 시, 좌 -1, 도달 시 , 상 -1
        // 상 -1 작은 위치에서 멈추고 다시 반복

        // 상단이 하단 이하 / 좌측이 우측 이하일 때 까지
        while (top <= bottom && left <= right) {

//            좌 > 우 상단, 행 채우기
            for (int i = left; i <= right; i++) {
                answer[top][i] = val++;
            }

            // 아래로 한칸 이동
            top++;

            // 상 > 하, 우측 열 채우기
            for (int i = top; i <= bottom; i++) {
                answer[i][right] = val++;
            }

            // 우측을 안쪽(좌측)으로 한칸 이동
            right--;

            // 우 > 좌 , 하단 행 채우기
            for (int i= right; i >= left; i--) {
                answer[bottom][i] = val++;
            }

            // 하단 안쪽(상단)으로 한칸 이동
            bottom--;

            // 하 > 상, 좌측 열 채우기
            for (int i = bottom; i >= top; i--) {
                answer[i][left] = val++;
            }

            // 좌측을 안쪽(우측)으로 한칸 이동
            left++;
        }

        return answer;
    }
}