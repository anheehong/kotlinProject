package algorithm

import java.util.*

fun main(){

    var s = Scanner( System.`in`)

    var H = s.nextInt()
    var M = s.nextInt()
    var d = s.nextInt()

    M += d

    if( M > 59 ) {
        H += M / 60
        M %= 60
    }

    if( H > 23 ) {
        H %= 24
    }

    print( "$H $M")
}