fun main(){


    miniMaxSum(arrayOf(256741038, 623958417 ,467905213 ,714532089 ,938071625))

}



fun miniMaxSum(arr: Array<Int>): Unit {

    var min = Int.MAX_VALUE
    var max = 0
    var sum = 0L

    for(numbers in arr){
        sum += numbers

        if(numbers > max) max = numbers
        if(numbers < min) min = numbers
    }


    println("${sum - max}  ${sum - min}")

}