import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int solution(String numbers) {
        int count = 0; // 만들 수 있는 소수의 개수
        Set<Integer> resultNums = new HashSet<>(); // numbers로 만들어진 순열 집합
        boolean[] used = new boolean[numbers.length()]; // 사용한 숫자 체크 배열
        StringBuilder currentNum = new StringBuilder(); // 현재 만들고 있는 숫자를 저장할 StringBuilder

        numBacktrack(numbers, currentNum, used, resultNums);

        // 소수인 숫자 개수 세기
        for (int num : resultNums) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    // 백트래킹 알고리즘으로 숫자의 순열 생성
    private void numBacktrack(String numbers, StringBuilder currentNum, boolean[] used, Set<Integer> resultNums) {
        // 주어진 numbers의 숫자들로 만들 수 있는 순열 생성
        if (currentNum.length() > 0) {
            resultNums.add(Integer.parseInt(currentNum.toString()));
        }

        // 순열 찾기
        for (int i = 0; i < numbers.length(); i++) {
            // 이미 사용한 숫자인 경우 건너뛰기
            if (used[i]) {
                continue;
            }

            // 사용하지 않은 숫자를 현재 숫자에 추가
            currentNum.append(numbers.charAt(i));
            used[i] = true;
            numBacktrack(numbers, currentNum, used, resultNums);
            used[i] = false;
            currentNum.deleteCharAt(currentNum.length() - 1);
        }
    }

    // 소수 판별
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        // 2부터 해당 숫자의 제곱근까지의 수로 나누어 떨어지는지 확인하여 소수 여부 판별
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        // 제곱근이 정수인 경우에는 완전 제곱수로 판별
        if (Math.sqrt(num) == (int) Math.sqrt(num)) {
            return false;
        }

        return true;
    }
}
