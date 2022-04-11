package algorithm

import java.util.*

fun main(){

    var s = Scanner( System.`in`)

    var num1 = s.nextInt()
    var num2 = s.nextInt()

    print( minus( num1, num2 ) )

}

fun minus( num1 : Int, num2 : Int ) = num1 - num2