 let newScoreArr = [];
  let result = 0;
  function solution(k, m, score) {
      // 스코어 내림차순 정렬
      score.sort( (x, y) => y - x);
      console.log(score);

      // 배열 자르기
      for(let index=0; index < score.length; index += m){
          // 자른 배열 변수에 담기
          let cutScore = score.slice(index, index + m)
          // 만약에 길이가 m과 같으면?
          cutScore.length === m && newScoreArr.push(cutScore);
      }

      // 배열의 길이 -> 안에 담은 사과 개수
      // 새롭게 만든 배열 순회해서 계산하기
      newScoreArr.map( num => {
          let len = newScoreArr[0].length
          // 최저 점수 * 상자 길이
          result += num.at(-1) * len;
      })
     return result ? result : 0;
  }