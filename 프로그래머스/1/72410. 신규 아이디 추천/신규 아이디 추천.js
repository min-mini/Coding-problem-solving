function solution(new_id) {
      new_id = new_id.toLowerCase(); //1단계
      new_id = new_id.replaceAll(/[^\w-_.]/g,''); //2단계
      new_id = new_id.replaceAll(/\.{2,}/g,'.'); //3단계
      new_id = new_id.replaceAll(/^\.|\.$/g,''); //4단계
      new_id = new_id.length === 0 ? 'a' : new_id; //5단계
      new_id = new_id.length >= 16 ? new_id.substring(0,15) : new_id; //6단계
      new_id = new_id.replaceAll(/\.$/g,'');
      while(new_id.length <= 2){ //7단계
          new_id += new_id.charAt(new_id.length-1);
      }
      return new_id;
  }