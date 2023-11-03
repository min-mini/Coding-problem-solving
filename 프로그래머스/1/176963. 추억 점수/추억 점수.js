 function solution(name, yearning, photo) {
        //name 에 해당하는 yearning 값을 각자에게 대입 시켜 객체 만들기
        let nameList = {};
        let photoScores = [];
        let sum = 0, count = 0, score = 0;

        for(let i in name){
            nameList[name[i]] = yearning[i]
        }
        // 이중 포문을 돌려 해당하는 이름이 있다면 점수 부여
        for(let i in photo){
            for(let j in photo[i]){
                score = nameList[photo[i][j]];// 점수로 변경

                if (!(score === undefined)) { // 만약 점수가 undefined 라면?
                    sum += score;
                }
            }
            photoScores[count++] = sum
            sum = 0;
        }
        return photoScores;
    }