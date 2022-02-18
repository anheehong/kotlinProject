package delegation

class LazySample{
    init{
        println("created!")
    }

    val lazyStr: String by lazy{
        println( "computed" )
        "my lazy"
    }
}

fun main(){

    println( "hello world" )
}