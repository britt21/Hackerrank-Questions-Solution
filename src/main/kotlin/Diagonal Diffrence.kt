import kotlin.math.abs

fun main(){


    diagonalDifference(arrayOf(arrayOf(11, 2, 4), arrayOf(4, 5 ,6), arrayOf(10, 8, -12)))
}


fun diagonalDifference(arr: Array<Array<Int>>): Int {

    var ltr = 0
    var rtl = 0

    for (items in 0 until  arr.size){
        arr[items][items]
        ltr += arr[items][items]
        rtl += arr.reversed()[items][items]
    }

    println(ltr)
    println(rtl)


    return  abs(ltr - rtl)
}
