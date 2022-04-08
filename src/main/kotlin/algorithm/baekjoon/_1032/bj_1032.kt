package algorithm.baekjoon

import java.util.*

fun main(){

    var s = Scanner( System.`in`)

    var count = s.nextInt()

    var stringArray : MutableList<String> = mutableListOf()

    for( i in 0 until count ){
        stringArray.add( s.nextLine() )
    }

    solution( stringArray )
}

fun solution( stringArray : MutableList<String> ) {

    var result : String = ""

        for( element in 0 until stringArray[0].length ){
            var char : Char = stringArray[0][element]
            var notEqual : Boolean = false
            for( str in stringArray ) {
                if( char != str[element] ){
                    notEqual = true
                    break
                }
            }
            if( notEqual ) result += "?"
            else result += char
        }

    println( result )
}