package collections
fun main(){

    val words = listOf( "foo", "bar", "baz", "faz" )
    val empty = emptyList<String>()

    var first = empty.firstOrNull()
    var last = empty.lastOrNull()

    var firstF = words.firstOrNull{ it.startsWith( 'f' ) }
    val firstZ = words.firstOrNull{ it.startsWith( 'z' ) }
    val lastF = words.lastOrNull{ it.endsWith( 'f' ) }
    val lastZ = words.lastOrNull{ it.endsWith( 'z' ) }

    println( first )
    println( last )
    println( firstF )
    println( firstZ )
    println( lastF )
    println( lastZ )
}