/*
Given an array of integers,
calculate the ratios of its elements that
are positive, negative, and zero. Print the decimal value
of each fraction on a new line with  places after the decimal.
**/

fun main(){

    plusMinus(arrayOf(-4, 3, -9, 0, 4, 1))
}

fun plusMinus(arr: Array<Int>){
    var positive = 0
    var negtive = 0
    var zero = 0
    for(items in arr){

        when{
            items > 0 -> {
                positive ++
            }
            items < 0 ->{
                negtive ++
            }
            else ->{
                zero ++
            }
        }
    }



    println(positive/arr.size.toDouble())
    println(negtive/arr.size.toDouble())
    println(zero/arr.size.toDouble())
}
