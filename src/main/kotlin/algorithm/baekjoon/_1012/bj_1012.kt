package algorithm.baekjoon._1012

import java.util.*

var count : Int = 0
var m : Int = 0
var n : Int = 0
var x : Int = 0

var dx : Array<Int> = arrayOf( 0, 0, -1, 1)
var dy : Array<Int> = arrayOf( 1, -1, 0, 0)
var mn : Array<Array<Int>> = arrayOf()
var visitmn : Array<Array<Int>> = arrayOf()

fun main(){

    var s = Scanner( System.`in` )
    count = s.nextInt()

    for( i in 0 .. count ){
        m = s.nextInt()
        n = s.nextInt()
        x = s.nextInt()
        mn = Array(n){ Array<Int>( m ){ 0 } }
        visitmn = Array(n){ Array<Int>( m ){ 0 } }
        println(mn.contentDeepToString())
        for( j in 0 until x ){
            var inputX = s.nextInt()
            var inputY = s.nextInt()
            mn[inputY][inputX] = 1
        }
        solution()
    }

}

fun solution(){

    var count = 0
    for( a in 0 .. m ){
        for( b in 0 .. n ){
            if( mn[b][a] == 1 && visitmn[b][a] != 1 ){
                dfs( a, b )
                count++
            }
        }
    }
    println( count )
}

fun dfs( a : Int, b : Int ){

    visitmn[b][a] = 1

    for( num in 0 until 4){
        var moveX = a + dx[num]
        var moveY = b + dy[num]

        if(moveX >= 0 && moveY >= 0 && moveX <= m && moveY <= n ){
            if( visitmn[moveY][moveX] != 1 && mn[moveY][moveX] == 1){
                dfs( moveX, moveY )
            }
        }
    }

}

