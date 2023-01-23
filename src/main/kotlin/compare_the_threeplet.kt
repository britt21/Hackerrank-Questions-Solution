fun main(){

    compareTriplets(arrayOf(1,2,3), arrayOf(5,6,1))
}

fun compareTriplets(a: Array<Int>, b: Array<Int>) : Array<Int>{

    var ade = 0
    var bob = 0

    for(i in 0..2){
            if (a[i] > b[i]) {
                ade++
            }else{
            if (b[i] > a[i]) {
                bob++
            }
        }

    }

    println(a.zip(b).count { it.first > it.second })
    println(a.zip(b).count { it.second > it.first })


    return arrayOf(ade,bob)
}
