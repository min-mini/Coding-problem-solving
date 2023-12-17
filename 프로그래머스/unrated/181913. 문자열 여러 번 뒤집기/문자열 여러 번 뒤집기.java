class Solution {
    public String solution(String my_string, int[][] queries) {
        int strat, end;

        for (int s = 0; s < queries.length; s++) {
            strat = queries[s][0]; // 시작
            end = queries[s][1]; // 끝

            // 추출한 인덱스 범위의 문자열로 버퍼 객체 생성
            StringBuffer buffer = new StringBuffer(my_string.substring(strat, end+1));
            // 거꾸로 뒤집기
            buffer.reverse();

            //  my_string의 각 쿼리에 해당하는 부분이 뒤집힌 문자열로 대체
            my_string = my_string.substring(0, strat) + buffer.toString() + my_string.substring(end+1);
        }
        return my_string;
    }

}