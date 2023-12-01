import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // 투 포인터 사용
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // n 혼자도 합 자연수의 값과 같기 때문에 경우의 수를 1로 시작.
        int count = 1;
        int start_idx = 1;
        int end_idx = 1;
        int sum = 1;

        while (end_idx != n) {
            // 합계가 n과 같다면?
            if(sum == n){
                count++;
                end_idx++;
                sum = sum + end_idx;
            }
            // 합계가 n보다 크다면?
            else if (sum > n) {
                sum = sum - start_idx;
                start_idx++;
            }
            // 합계가 n보다 작다면?
            else {
                end_idx++;
                sum = sum + end_idx;
            }
        }
        System.out.println(count);
    }
}