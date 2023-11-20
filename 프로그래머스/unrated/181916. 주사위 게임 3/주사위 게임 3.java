import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[] {a, b, c, d};

        // map 초기화
        for (int i = 0; i < arr.length; i++){
            int v = arr[i];
            map.put(v, (map.containsKey(v) ? map.get(v) : 0) + 1);
        }

        final List<Integer> keys;
        switch (map.size()){
            case 1: // 모두 다 같은 경우
                return 1111 * a;
            case 2: // 2개 2개 같은 경우
                keys = map.keySet().stream().collect(Collectors.toList());
                int p = keys.get(0);
                int q = keys.get(1);
                if (map.get(p) >= 3){ // p가 3개 이상
                    return (int)Math.pow(10 * p + q, 2);
                } else if (map.get(q) >= 3){ // q가 3개 이상
                    return (int)Math.pow(10 * q + p, 2);
                } else { // 두 개, 두 개
                    return (p + q) * Math.abs(p - q);
                }
            case 3: // 2개, 나머지 하니씩 다른 경우
                keys = map.entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() < 2)
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                        .keySet().stream()
                        .collect(Collectors.toList());
                return keys.get(0) * keys.get(1);
            case 4: // 모두 다를 경우
                return map.entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() < 2)
                        .findFirst().get().getKey();
        }
        return answer;
    }
}