package collections

data class Person( val name : String, val city : String, val phone : String )

fun main(){

    val people = listOf(
        Person( "John", "Boston", "+1-888-123456" ),
        Person( "Sarah", "Munich", "+49-777-789123" ),
        Person( "Svyatoslav", "Saint-Petersburg", "+7-999-456789" ),
        Person( "Vasilisa", "Saint-Petersburg", "+7-999-123456")
    )

    val phoneBook = people.associateBy{ it.phone }
    val cityBook = people.associateBy( Person::phone,Person::city )

    val peopleCities = people.groupBy( Person::city, Person::name )
    val lastPersonCity = people.associateBy( Person::city, Person::name )

    println( phoneBook )
    println( cityBook )
    println( peopleCities )
    println( lastPersonCity )
}