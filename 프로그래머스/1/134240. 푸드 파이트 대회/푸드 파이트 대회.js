  function solution(food) {
        let foodValArr = [];
        let foodAllVal = []; //모든음식번호 반복문자 배열
        let foodNumList = {};
        let num = '';
        let count = 0;

        food.forEach((foodNum, index) => {
            let foodNumCal = Math.floor( foodNum / 2)
                 if(foodNum >= 2){ //음식 개수가 2개 이상이라면?
                     foodValArr.push(foodNumCal); //배열에 정수로 넣기
                     foodNumList[index] = foodNumCal // 리스트로 넣기
                }
        });

        for(let foodVal of foodValArr){
            num = Object.keys(foodNumList).slice(count,1+count)// 키를 하나씩 빼서 넣기
           foodAllVal.push(num.toString().repeat(foodVal));//음식번호에 맞게 반복해서 배열 삽입
            count++
        }

       return foodAllVal.join("") + '0' + foodAllVal.reverse().join("") //  최종값 reverse 배열 역순
    }
