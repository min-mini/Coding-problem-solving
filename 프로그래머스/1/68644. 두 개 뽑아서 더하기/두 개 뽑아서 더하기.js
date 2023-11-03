 function solution(numbers){
        let sum = [];
        let count = 0;
        let index = 0;
        let numLen = numbers.length
        let len = 1;

        for (let i=0; i < numLen; i++){
            while(count < numLen-len){
                count++
                index++
                    sum.push(numbers[i] + numbers[index])
            }
            index = i+1;
            count = 0;
            len++
        }
        //중복요소 제거
        // 각 원소들이 callback 함수에 정의된 기준에 부합하는지 검사하고,
        // 검사 결과가 true 를 리턴하는 원소을 모아서 배열 형태로 리턴(uniqueArr)
        //filter() 함수로 전달 된 callback 함수는
        // 검사하고 있는 값(value)이 배열(sum)에서 가장 처음으로 나타는 index 와
        // 검사하고 있는 원소의 index 와 비교하여 같을 경우에만 true 를 리턴
        sum = sum.filter((value, index) => {
            return sum.indexOf(value) === index;}
        );

        sum.sort( (x,y) => x - y)

        return sum;
    }