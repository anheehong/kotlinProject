package algorithm

import java.util.Scanner

fun main(){

    var s = Scanner( System.`in`)

    var num1 = s.nextInt()
    var num2 = s.nextInt()

    print( sum(num1, num2 ) )
}

fun sum( num1 : Int, num2 : Int ) = num1 + num2