package productivityboosters

class Pair<K,V>( val first :  K, val second : V ){

    operator fun component1() : K {
        return first
    }

    operator fun component2() : V {
        return second
    }
}
fun main(){

    val ( num, name ) = Pair( 1, "One" )
    println( "num = $num, name = $name")
}