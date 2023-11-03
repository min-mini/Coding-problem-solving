function solution(participant, completion) {
    const person = {}
      for(part of participant){
          if (part in person){
              person[part] += 1;
          }else{
              person[part] = 1
          }
      }
      for (part of completion){
          person[part] -= 1
      }
      for (part in person){
          if(person[part] === 1){
              return part;
          }
      }
  }