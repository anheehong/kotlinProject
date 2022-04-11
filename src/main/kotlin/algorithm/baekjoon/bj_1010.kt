package algorithm.baekjoon

import java.util.*

fun main(){

    var s = Scanner( System.`in` )
    var count : Int = s.nextInt()

    for( i in 0 until count ){

        var num1 = s.nextInt()
        var num2 = s.nextInt()

        print( combination( num1, num2 ) )
    }
}

//1) n+1Cr+1 = nCr + nCr+1
fun combination( num1 : Int, num2 : Int ) : Int {

    if( num2 == 0 ) return 1

    if( num1 == num2 ) return 1

    return combination(  num1 - 1, num2 - 1 ) + combination( num1 - 1, num2 )
}
