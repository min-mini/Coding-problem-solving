import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // 첫번째 줄 받기
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int numNo = Integer.parseInt(stringTokenizer.nextToken()); // 숫자 개수
        int sumNO = Integer.parseInt(stringTokenizer.nextToken()); // 합을 구해야 하는 개수
        // 합 배열 선언
        long[] S = new long[numNo + 1];
        // 두번째 줄 받기
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        // 0번째가 아닌 1번째부터 사용하기 위해 i=1
        for (int i=1; i <= numNo; i++) {
            // 합배열 = 합배열[i - 1] + 입력 받은 수
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int s=0; s < sumNO; s++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken()); // 구간 시작
            int j = Integer.parseInt(stringTokenizer.nextToken()); // 구간 끝
            // 구간 배열 = 합배열[끝] - 합배열[시작-1]
            System.out.println(S[j] - S[i-1]);
        }
    }
}