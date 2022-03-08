package stackqueue

import java.util.*

fun main(){

    var stack = Stack<Int>()

    stack.push( 1 )
    stack.push( 2 )
    stack.push( 3 )

    println( stack )
    println( stack.peek() )
    println( stack.size )
    println( stack.pop() )
    println( stack.size )

}