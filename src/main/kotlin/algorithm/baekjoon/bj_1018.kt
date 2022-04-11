package algorithm.baekjoon._1018

import java.util.Scanner

fun main(){

    var s = Scanner(System.`in`)
    var x = s.nextInt()
    var y = s.nextInt()

    var dimension = Array<Array<Int>>(x){ Array<Int>(y){0} }

    for( i in 0 until x){
        for( j in 0 until y){
            dimension[i][j] = s.nextInt()
        }
    }
}

var x = 0
var y = 0

fun solution( dimension : Array<Array<Int>>){

    for( i in 0 until x){
        for( j in 0 until y){

        }
    }

}