import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int max = Integer.MIN_VALUE; // 최대값
    static int min = Integer.MAX_VALUE ; // 최소값
    static int N; // 수의 개수
    static int[] numArr; // 정수
    static int[] operators = new int[4]; // 연산자

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        // 수 N개 받기
        N = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        numArr = new int[N];

        // N개 만큼 정수 받기
        for (int i = 0; i < N; i++) {
            numArr[i] = (Integer.parseInt(stringTokenizer.nextToken()));
        }

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //  4개의 연산자 + - x %  개수 받기
        for (int i = 0; i < operators.length ; i++) {
            operators[i] = (Integer.parseInt(stringTokenizer.nextToken()));
        }
        recursive(numArr[0], 1);
        System.out.println(max);
        System.out.println(min);
    }
    static void recursive(int num, int index) {
        // 조건
        if(index == N) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }
        for (int i = 0; i < operators.length; i++) {
             if (operators[i] > 0){
                --operators[i];
                switch (i) {
                    case 0: recursive(num + numArr[index], index + 1); break;
                    case 1: recursive(num - numArr[index], index + 1); break;
                    case 2: recursive(num * numArr[index], index + 1); break;
                    case 3: recursive(num / numArr[index], index + 1); break;
                }
                ++operators[i];
            }
        }
    }
}