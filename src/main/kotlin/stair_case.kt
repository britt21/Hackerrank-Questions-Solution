fun main(){


    staircase(4)

}

fun staircase(n: Int): Unit {
    /*
    the breakdown:
    **/
    for (i in 0 until  n){
        for (b in 0 until   n - i -1 ){
            print(" ")

        }
        for (d in 0 .. i){
            // step 1
            //this second for loop runs after the first for loop that means it continues the action of
            // whatever it is given best ran with step 2

            print("#")
        }
        // step 2
        // for each time it runs a for loop it does this action at the end , run this code and highlight to see result
        // all it does is create a new line observe by running with step one

        println()

    }


}