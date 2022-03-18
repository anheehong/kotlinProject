package algorithm.baekjoon

import java.util.*

fun main(){
    var s = Scanner( System.`in`)

    var count = s.nextInt()
    var numList : IntArray = IntArray( count, {0})

    for( index in 0 until count ){
        numList[index] = s.nextInt()
    }

    for( num in numList ){
        zero = 0
        one = 0
        fibonacci( num )
        println( "$zero $one")
    }

}

var zero = 0
var one = 0

fun fibonacci( n : Int ) : Int {

     if( n == 0 ){
            zero ++
            return 0
     }
     else if( n == 1 ){
            one ++
            return 1
     }
    else
        return fibonacci( n - 1 ) +  fibonacci( n - 2 )

}