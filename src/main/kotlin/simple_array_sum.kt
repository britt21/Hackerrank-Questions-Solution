fun main() {

    simpleArraySum(arrayOf(1,2,3,4,10,11))

}


fun simpleArraySum(ar: Array<Int>): Int {

    //correct
    var addup = ar.sum()

    print(addup)

    return addup

}