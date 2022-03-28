package algorithm.baekjoon

import java.util.*

fun main(){

    var s = Scanner( System.`in` )
    var count = s.nextInt()

    var array = IntArray( count * 2 )

    for( num in 0 until  count ){
        array[ num ] = s.nextInt()
        array[ num+1 ] = s.nextInt()
    }

    solution( array )
}

fun solution( array : IntArray ) {

    for( i in 0 until array.size / 2 ){
        var result = array[i]
        for( j in 2..array[i+1] ){
            result = ( result * array[i] ) % 10
        }
        println( result )
    }

}