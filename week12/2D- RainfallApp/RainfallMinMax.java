public class RainfallMinMax{
	int rainfallNums[][] = new int[4][7];
	double total = 0;
	int max = 0;
	int min = 0;
	// Three arrays to store the results for each of the 4 weeks...
	double weeklyAverages[] = new double[4];
	int weeklyMins[] = new int[4];
	int weeklyMaxs[] = new int[4];



	public void setRainfallNums(int[][] rainfallNums){
		this.rainfallNums = rainfallNums;
	}

	public void compute(){

		// Two loops, one for the weeks then, within that, another for the days...
		for(int weekCounter = 0; weekCounter < rainfallNums.length; weekCounter++){
			//reset the total and max for each week...
			total = 0;
			max = 0;
			// min needs to have a reasonable starting value to check for lower values, usually just pick the first one..
			min = rainfallNums[weekCounter][0];
			// We can pick any of the 4 top level array elements to get the length for the second level...
			for(int dayCounter = 0; dayCounter < rainfallNums[0].length; dayCounter++){
				total = total + rainfallNums[weekCounter][dayCounter];
				if(min > rainfallNums[weekCounter][dayCounter]) {
					min = rainfallNums[weekCounter][dayCounter];
				}
				if(max < rainfallNums[weekCounter][dayCounter]) {
					max = rainfallNums[weekCounter][dayCounter];
				}
			}
			// finished a week so lets store off the average, min and max to the three results arrays
			// Note that in a situation like this where there are only ever 7 days in a week, it
			// would be fine to just do "total / 7"
			weeklyAverages[weekCounter] = total / rainfallNums[0].length;
			weeklyMins[weekCounter] = min;
			weeklyMaxs[weekCounter] = max;
		}

	}

	public double[] getWeeklyAverages(){
		return weeklyAverages;
	}

	public int[] getWeeklyMins(){
		return weeklyMins;
	}

	public int[] getWeeklyMaxs(){
		return weeklyMaxs;
	}
}

/* A final note. Be careful using something like rainfallNums[0].length to get the length for a second level array. Java actuallly
	doesn't require each second level array to be the same size, so it is possible to have, for example, testArray[0][0].length != testArray[0][1].length
	This requires a special way of creating the array but it is possible.
	*/
