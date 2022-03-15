package algorithm.programers

import java.util.*

fun main(){

    var solution : Solution = Solution();

    var array : Array<IntArray> = arrayOf(
        intArrayOf( 0, 3 ),
        intArrayOf( 1, 9 ),
        intArrayOf( 2, 6 )
    )

   print( solution.solution( array ) )
}

class Job( var request : Int, var run : Int )

class Solution {
    fun solution(jobs: Array<IntArray>): Int {
        return JobScheduling( jobs )
    }

    fun JobScheduling( jobs: Array<IntArray> ) : Int {

     //   val compareBy: Comparator<Job> = compareBy { it.request.minus( )}
     //   var jpq : PriorityQueue<Job> = PriorityQueue<Job>( compareBy )


        return 0
    }
}