
fun main(){

    birthdayCakeCandles(arrayOf(3, 2 ,1 ,9))

}
fun birthdayCakeCandles(candles: Array<Int>): Int {
    var max = 0
    for (number in candles){
        if (number > max ) max = number
    }

    println(max)

    return  max
}