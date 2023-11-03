 function solution(players, callings) {
      let playerList = {}; // 객체생성
      // playerList['test'] = 10;
      for(let i=0; i < players.length; i++){
          playerList[players[i]] = i; // 플레이어들 이름:인덱스번호 나열해서 객체에 삽입
      }
      for(let callPlayer of callings){
          // 호출한 사람과 일치하는 인덱스 번호 가져온다
          let callPlayerIndex = playerList[callPlayer];
          // 호출한 사람의 앞번호 인덱스를 가져온다
          let frontPlayerIndex= players[callPlayerIndex-1];
          // 교환 임시 박스
          let box = ''

         // 교환 작업
          box = players[callPlayerIndex]
          players[callPlayerIndex] = players[callPlayerIndex-1]
          players[callPlayerIndex-1] = box

          playerList[callPlayer]-- // 해당하는 인덱스값을 줄여준다(why? 호출되면 순번이 앞으로 가야해서)
          playerList[frontPlayerIndex]++; // 늘여준다 (why? 호출된자의 뒤로 가야하기 때문)
      }
      return players;
  };