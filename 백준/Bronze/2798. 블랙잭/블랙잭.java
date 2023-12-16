import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken()); // 카드 개수
        int M = Integer.parseInt(stringTokenizer.nextToken()); // 숫자 합 기준

        List<Integer> list = new ArrayList<>();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        // 카드에 적힌 숫자 받기
        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(stringTokenizer.nextToken()));
        }

        int result = 0;

        // 3개의 카드를 선택하는 모든 경우의 수를 확인
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for(int k = j + 1; k < N; k++) {
                    int sum = list.get(i) + list.get(j) + list.get(k); // 3개 카드의 합
                    if(sum <= M) {
                        result = Math.max(result, sum); // 합이 M을 넘지 않으면서, 가장 큰 값 갱신
                    }
                }
            }
        }
        System.out.println(result); // 결과 출력
    }
}