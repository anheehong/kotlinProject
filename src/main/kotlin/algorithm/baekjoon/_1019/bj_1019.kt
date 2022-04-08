package algorithm.baekjoon

import java.util.Scanner

fun main(){

    var s = Scanner( System.`in` )
    var page = s.nextInt()

    solution( page )
}

fun solution( page : Int ){

    var resultList : MutableMap<String, Int> = mutableMapOf( "0" to 0,
        "1" to 0, "2" to 0, "3" to 0, "4" to 0, "5" to 0, "6" to 0, "7" to 0, "8" to 0, "9" to 0 )

    for( num in 1 .. page ){
        var strNum = num.toString()

        for( ele in strNum.toCharArray() ){
            resultList[ele.toString()] = resultList[ele.toString()]!!.plus( 1)
        }
    }

    println(resultList.values)
}