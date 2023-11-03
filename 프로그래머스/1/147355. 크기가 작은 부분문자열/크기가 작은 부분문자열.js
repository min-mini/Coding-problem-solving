function solution(t, p) {
        let pLan = p.length, PLan2 = p.length, tLan = t.length
        let count = 0
        let tVal = 0
        let tMinVal = 0
        let result = 0

        while (count < tLan) {
            tVal = t.slice(count, pLan + count);
            if (tVal.length === PLan2) {
                tMinVal = tVal
                if (+tMinVal <= +p) {
                    result++
                }
            }
            count++
        }
        return result;
    }