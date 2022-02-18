package introduction
class MutableStack<E>( vararg  items : E ){

    private val elements = items.toMutableList()

    fun push( element :E) = elements.add( element )

    fun peek() : E = elements.last()

    fun pop() : E =  elements.removeAt( elements.size - 1 )

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack"
}

fun <E> mutableStackOf(vararg elements : E ) = MutableStack( *elements )

fun main(){

    println( "hello world" )
}