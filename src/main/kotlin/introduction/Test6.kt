
class Customer

class Contact(val id : Int, var email :String)

fun main(){

    val customer = Customer()

    var contact = Contact( 1, "mary@gmail.com" )

    println( contact.id )
    contact.email = "jane@gamil.com"
    println( contact.email )


}