fun main(){

    aVeryBigSum(arrayOf(1000000001,1000000002,1000000003,
        1000000004,1000000005))
}

fun aVeryBigSum(ar: Array<Long>): Long {



    return ar.sum().toLong()

}