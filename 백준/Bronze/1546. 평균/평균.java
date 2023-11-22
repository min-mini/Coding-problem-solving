import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()); // 입력 과목 수
        int sum = 0; // 총합
        int max = 0; // 최대 값
        for (int i=0; i < n; i++){
            int a = sc.nextInt(); // 입력 점수
            // 점수 중 최대값 찾기
            if ( a > max) max = a;
            sum += a;
        }
        System.out.println(sum * 100.0 / max / n);
    }
}