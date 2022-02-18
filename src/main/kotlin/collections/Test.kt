package collections

val systemUsers : MutableList<Int> = mutableListOf( 1, 2, 3 )
val sudoers : List<Int> = systemUsers

fun addSystemUser( newUser : Int ){
    systemUsers.add( newUser )
}

fun getSysSudoers() : List<Int> {
    return sudoers
}

fun main() {

    addSystemUser(4)
    println("Tot sudoers : ${getSysSudoers().size}")

    getSysSudoers().forEach {
        i -> println("Some useful into on user $i")
    }

    println( "hello world" )
}