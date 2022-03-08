package stackqueue

import java.util.*

fun main(){

    var q : Queue<Int> = LinkedList<Int>()

    q.add( 1 )
    q.add( 2 )
    q.add( 3 )

    println( q )
    println( q.peek() )
    println( q.poll() )
    println( q.remove() )

}