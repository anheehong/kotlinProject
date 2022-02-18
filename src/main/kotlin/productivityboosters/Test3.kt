package productivityboosters

fun findMinMax( list : List<Int> ) : Pair<Int, Int>{

    return Pair( 50, 100)
}

fun main(){

    val (x, y, z) =  arrayOf( 5, 10, 15 )
    val map = mapOf( "Alice" to 21, "Bob" to 25)

    for((name, age) in map ){
        println( "$name is $age years old")
    }

    var ( min, max ) = findMinMax( listOf(100, 90, 50 , 97, 76, 83))

    println( min )
    println( max )
}