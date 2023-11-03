  let sArr = [];
    let nX, nY;
    function solution(strings, n) {
        strings.forEach( s => {
            sArr.push([...s]);
        });
        strings = [];

        //정렬
        sArr.sort((x, y) => {
            nX = x[n];
            nY = y[n];

            if(nX > nY) {
                return 1;
            } else if(nX < nY) {
                return -1;
            } else {
                return  x < y ? -1 : x > y ? 1 : 0;
            }
        });

        sArr.map( value => {
            strings.push(value.join(''));
        })
           return strings;
    }