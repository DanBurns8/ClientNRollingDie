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
        int x=0;
        int y=0;
        int curreentRun=0;
        int bestRun=0;
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
