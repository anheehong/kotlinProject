package scopefunctions

fun writeCreationLong( p: Person ){
    println( "A new person ${p.name} was created." )
}

fun main(){

    val jake = Person( "Jake", 30, "Android developer")
        .also{
            writeCreationLong(it)
        }

    println( jake )
}