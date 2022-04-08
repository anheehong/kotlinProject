package algorithm.baekjoon

import java.util.Scanner

fun main(){

    var s = Scanner( System.`in` )

    var min = s.nextInt()
    var max = s.nextInt()

    solution( min, max )
}

fun solution( min : Int, max : Int ){

    var acceptList : MutableList<Int> = mutableListOf()
    for( num in min .. max ){
        var sqrt = num * num
        if( num == 1 ) continue
        if( sqrt > max ) break
        acceptList.add( sqrt )
    }

    var resultList : MutableSet<Int> = mutableSetOf()

    for( num in min .. max ){
        for( acceptNum in acceptList ){
            if(acceptNum.toInt() == num || num % acceptNum.toInt() == 0){
                resultList.add( num )
            }
        }
    }

    println( max-min+1 - resultList.size )
}