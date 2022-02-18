package productivityboosters

fun format( userName : String, domain : String ) = "$userName@$domain"

fun main(){

    println( format( "mario", "example.com" ) )
    println( format( "domain.com", "username" ) )
    println( format( userName = "foo", domain = "bar.com" ) )
    println( format( domain="frog.com", userName = "pepe"))

}