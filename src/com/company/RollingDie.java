package com.company;

public class RollingDie {
    /** @return an integer value between 1 and 6
     */
    public int toss(){
        return (int)(6 * Math.random()) + 1;
    }

	/* Write the method getRolls that takes a number of tosses as a parameter.  The method
	should return an array of values produced by rolling the die the given number of times.
	*/

    /** Returns an array of the values obtained by tossing the die numTosses times.
     *  @param numTosses the number of die tosses
     *			Precondition: numTosses >0
     *	@return an array of numTosses values
     */
    public int[] getRolls(int numTosses){
        int[] tossA= new int[numTosses];
        for(int i=0; i<numTosses; i++){
            tossA[i] =toss();
        }
        return tossA;
    }

	/*Write the method getBestRun that takes as its parameter a array of integer values
	representing a series of die tosses.  The method returns the starting index in the array
	of a run of maximum size.  A run is defined as the repeated occurrence of the same value
	in 2 or more consecutive positions in the array.  If there are 2 runs of the same size
	it may return either index.  If there are no runs, the method returns -1.
	Precondition:  values.length > 0
	*/

    public int getBestRun(int[] values){
        int count=0;
        int run=0;
        int bestCount=0;
        int bestRun=-1;
        for(int i=1; i<values.length; i++){
            if(values[i] == values[i-1]){
                count++;
            }else{
                if(count>bestCount){
                    bestCount=count;
                    bestRun=run;
                }
                count=0;
                run=i;
            }
        }
        if(count>bestRun){bestRun=count;}
        if(bestCount==0){return -1;}
        return bestRun;
    }

    public static void main(String[] args) {
        RollingDie nc = new RollingDie();

        for (int p = 0; p < 10; p++){
            int[] tossArr = nc.getRolls(20);
            for (int i = 0; i < 20; i++)
                System.out.print(tossArr[i] + ",");
            System.out.println();

            int x = nc.getBestRun(tossArr);
            System.out.println(x);
        }
    }
}
//        3,2,2,2,5,1,6,6,6,2,1,6,2,2,2,2,5,2,6,1,
//        12
//        2,2,4,3,3,2,4,5,4,5,4,5,3,4,4,3,3,3,1,1,
//        15
//        2,3,1,2,5,6,4,4,3,5,6,1,1,5,6,4,4,2,2,3,
//        6
//        1,4,3,4,2,6,2,5,5,1,1,2,4,1,6,4,1,3,1,3,
//        7
//        3,6,5,6,1,4,3,6,4,2,5,2,5,6,6,2,3,6,5,1,
//        13
//        6,5,4,5,6,6,3,5,6,1,1,6,2,4,3,3,1,6,4,6,
//        4
//        4,1,5,1,5,3,2,4,1,5,3,1,2,3,5,3,3,1,3,4,
//        15
//        6,1,3,5,2,5,5,2,2,5,2,4,4,6,6,4,2,1,3,3,
//        5
//        4,5,6,6,6,6,5,4,1,6,1,6,4,4,4,1,6,4,2,1,
//        2
//        2,2,2,1,1,2,1,6,1,4,1,1,1,4,5,5,3,5,2,3,
//        0
