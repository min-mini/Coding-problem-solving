import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = Integer.parseInt(sc.next()); // 문자 개수
        char[] cN = sc.next().toCharArray(); // 나열된 숫자들을 char 배열에 삽입
        int sum = 0; // 총합계

        for (int i=0; i < s; i++) {
            sum += cN[i] - '0'; // 문자 0을 빼서 char -> int 형변환
        }
        System.out.println(sum);
    }
}