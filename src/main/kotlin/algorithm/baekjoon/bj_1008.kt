package algorithm.baekjoon

import java.util.*

fun main(){

    var s = Scanner( System.`in`)

    var num1 = s.nextInt()
    var num2 = s.nextInt()

    print( divide( num1, num2 ))
}

fun divide( num1 : Int, num2 : Int ) : Int = num1/num2