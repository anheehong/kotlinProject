package productivityboosters

import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

fun main(){

    val date: ChronoLocalDate? = LocalDate.now()

    if( date != null ){
        println( date.isLeapYear )
    }

    if( date != null && date.isLeapYear ){
        println( "It's a leap year!" )
    }

    if( date == null || !date.isLeapYear ){
        println( "There's no Feb 2 this year...")
    }

    if( date is LocalDate ){
        val month = date.monthValue
        println( month )
    }


    println( "hello world" )
}