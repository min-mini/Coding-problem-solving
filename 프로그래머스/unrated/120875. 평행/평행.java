class Solution {
   public int solution(int[][] dots) {

        // 기울기 계산 (경우의 수 3가지)
        double slope1 = calcSlope(dots[0], dots[1]);
        double slope2 = calcSlope(dots[2], dots[3]);

        double slope3 = calcSlope(dots[0], dots[2]);
        double slope4 = calcSlope(dots[1], dots[3]);

        double slope5 = calcSlope(dots[0], dots[3]);
        double slope6 = calcSlope(dots[1], dots[2]);
        
        // 기울기 같은지 판단
        return slope1 == slope2 || slope3 == slope4 || slope5 == slope6 ? 1 : 0;
    }

    private static double calcSlope(int[] point1, int[] point2) {
        
        // 제로 값 제외
        if (point2[0] - point1[0] == 0){
            return Double.MAX_VALUE; // 수직선 의미
        }

        // 기울기 = y 변화량 / x 변화량
        return (double) (point2[1] - point1[1]) / (point2[0] - point1[0]);
    }
}