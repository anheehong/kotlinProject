package algorithm

import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main(){

    var s = Scanner( System.`in`)
    var problemCount = s.nextInt()

    var result : MutableList<Int> = arrayListOf()

    for( index in 0 until problemCount ){

        var x1 = s.nextInt()
        var y1 = s.nextInt()
        var r1 = s.nextInt()
        var x2 = s.nextInt()
        var y2 = s.nextInt()
        var r2 = s.nextInt()

        result.add( crossCircleCount( x1, y1, r1, y1, y2, r2 ) )
    }

    for( element in result ) print ( element )

}

fun crossCircleCount ( x1 : Int, y1 : Int, r1 : Int, x2 : Int, y2 : Int, r2 : Int ) : Int {

    var d =  sqrt((x2 - x1).toDouble().pow(2 ) + (y2 - y1).toDouble().pow(2.0) ).toInt();

    //중점이 같으면서 반지름도 같을 경우
    if(x1 == x2 && y1 == y2 && r1 == r2) return -1;

    //두 원의 반지름 합보다 중점간 거리가 더 길 때
    if( d > (r1 + r2) ) return 0

    //원 안에 원이 있으나 내접하지 않을 때
    if( d < (r2 - r1) ) return 0

    //내접할 때
    if( d == (r2 - r1) ) return 1

    return 2
}