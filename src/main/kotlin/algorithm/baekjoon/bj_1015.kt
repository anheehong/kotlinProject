package algorithm.baekjoon

import java.util.*

fun main(){

    var s = Scanner( System.`in` )
    var n : Int = s.nextInt()

    var rule : IntArray = IntArray( n, {0} )

    for( i in 0 until n){
        rule[i] = s.nextInt()
    }
    sortArray( rule )
}

fun sortArray( rule : IntArray ){

    var tempRule = rule.copyOf()
    Arrays.sort( tempRule )

    var output : IntArray = IntArray( rule.size, {9999} )
    var index = 0

    for( ruleEl in rule ){
        for( i in tempRule.indices ){
            if( ruleEl == tempRule[i] && !output.contains( i )){
                print( "$i " )
                output[index] = i
                index++
                break
            }
        }
    }

}