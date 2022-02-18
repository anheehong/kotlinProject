package collections
fun main(){

    val list = listOf( 0 ,10, 20 )
    println( list.getOrElse( 1 ){ 42 } )
    println( list.getOrElse( 10 ){ 42 } )

    val map = mutableMapOf<String, Int?>()
    println( map.getOrElse("x"){1})

    map["x"] = 3
    println( map.getOrElse("x"){1})

    map["x"] = null
    println( map.getOrElse("x"){1})


}