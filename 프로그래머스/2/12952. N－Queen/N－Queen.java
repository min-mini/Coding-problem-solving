class Solution {
    private int[] queenPos; // 각 행에 퀸이 위치한 열의 값을 저장
    private int count; // 유효한 경우의 수

    public int solution(int n) {
        queenPos = new int[n];
        count = 0;
        placeQueen(0);
        return count;
    }

    private void placeQueen(int row) {
        int n = queenPos.length;
        // 현재 행이 체스판 크기와 같다면 모든 퀸이 배치 됨
        if (row == n) {
            count++;
        }

        // 열을 n-1 까지 반복
        for (int col = 0; col < n; col++) {
            // 현재 위치에 배치할 수 있는지 확인
            if (isValid(row, col)) {
                queenPos[row] = col;
                placeQueen(row + 1);
            }
        }
    }

    private boolean isValid(int row, int col) {
        for (int i = 0; i < row; i++) {
            // 같은 열, 대각선에 퀸이 있는지 검사
            if(queenPos[i] == col || Math.abs(queenPos[i] - col) == Math.abs(i - row)) {
                return false; // 배치할 수 없음
            }
        }
        return true; // 배치 가능
    }
}