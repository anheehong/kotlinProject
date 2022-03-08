package stackqueue

import java.util.*

fun main(){

    var q = PriorityQueue<Int>()

    q.add( 1 )
    q.add( 3 )
    q.add( 2 )

    println( q )

    println( q.poll() )
    println( q.poll() )
    println( q.poll() )

}