


package Chapter_2;

/**
 * Ch2Part3
 */
public class Ch2Part3 {

    public static int maxSubSum1( int [ ] a )
{
    int maxSum = 0;
    //worst case its N
    for( int i = 0; i < a.length; i++ ) 
        for( int j = i; j < a.length; j++ ) { //worst case is N
            
            int thisSum = 0;
            for( int k = i; k <= j; k++ ) //Worst N
                thisSum += a[ k ];
            
            if( thisSum > maxSum ) 
                maxSum = thisSum;
    }

        return maxSum;
}



    public static int maxSubSum2( int [ ] a ){
        int maxSum = 0;
        for( int i = 0; i < a.length; i++ ){
            int thisSum = 0;
            for( int j = i; j < a.length; j++ ){
                thisSum += a[ j ];

                if( thisSum > maxSum )
                    maxSum = thisSum;
            }
        }

        return maxSum;

    }

//linear time max contiguous subsequence sun algo

public static int maxSubSum4( int [ ] a ){
    int maxSum = 0, thisSum = 0;

    for( int j = 0; j < a.length; j++ ){

        thisSum += a[ j ];

        if( thisSum > maxSum )
            maxSum = thisSum;
        else if( thisSum < 0 )
            thisSum = 0;
    }

    return maxSum;
}


}



