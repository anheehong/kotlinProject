package specialclass

class BigBen {

    companion object Bonger{

        fun getBongs( nTimes : Int ){
            for( i in 1 .. nTimes ){
                print( "BONG ")
            }
        }
    }
}

fun main(){

    //BigBen.Bonger.getBongs( 13 );
    BigBen.getBongs( 12 )
}