package collections
fun main(){

    val numbers = listOf( 1, -2, 3, -4, 5, -6 )
    val first = numbers.first()
    val last = numbers.last()

    var firstEven = numbers.first{ it % 2 == 0 }
    var lastOdd = numbers.last{ it % 2 != 0 }

    println( first )
    println( last )
    println( firstEven )
    println( lastOdd )
}