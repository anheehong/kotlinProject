package algorithm.baekjoon._1011

import java.util.*

fun main(){

    var s = Scanner( System.`in`)
    var count = s.nextInt()

    for( i in 0 until count ){

        x = 0
        y = 0
        sum = 2
        count = 2
        currentNum = 1

        x = s.nextInt()
        y = s.nextInt()

        println( count )
    }

}

var x = 0
var y = 0
var sum = 2
var count = 2
var currentNum = 1

fun solution(){

    var dis = y-x+1

    if( dis == sum ) return
    count++

    if( sum+currentNum+1 <= sum ){
        currentNum += 1
        sum += currentNum
    }
    else if( sum+currentNum <= sum ){
        sum += currentNum
    }
    else{
        currentNum -= 1
        sum += currentNum
    }
    solution()
}