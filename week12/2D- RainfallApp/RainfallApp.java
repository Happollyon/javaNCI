import javax.swing.*;
public class RainfallApp {

	public static void main(String args[]){
				int rainfallNums[][] = new int[4][7];
				double weeklyAverages[] = new double[4];
				int weeklyMins[] = new int[4];
				int weeklyMaxs[] = new int[4];

				RainfallMinMax myAvg = new RainfallMinMax();

				// Get the numbers, we need two loops, one for the weeks then one for the days...
				for(int weekCounter = 0; weekCounter < rainfallNums.length; weekCounter++){
					// We can pick any of the 4 top level array elements to get the length for the second level...
					for(int dayCounter = 0; dayCounter < rainfallNums[0].length; dayCounter++){
						// Note the "+ 1" is just so it shows a normal looking week/day number to the user i.e., doesn't show week 0, day 0...
						rainfallNums[weekCounter][dayCounter] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the rainfall for week " + (weekCounter + 1) + ", day " + (dayCounter + 1) + " : "));
					}
				}

				myAvg.setRainfallNums(rainfallNums);
				myAvg.compute();
				weeklyAverages = myAvg.getWeeklyAverages();
				weeklyMins = myAvg.getWeeklyMins();
				weeklyMaxs = myAvg.getWeeklyMaxs();
				// output the results, we could do this a few ways. Lets do a loop for each week..
				for(int weekCounter = 0; weekCounter < rainfallNums.length; weekCounter++){
					JOptionPane.showMessageDialog(null, "The average rainfall in week " + (weekCounter + 1) + " was " +  weeklyAverages[weekCounter] + ", the max that week was " +  weeklyMaxs[weekCounter] + " and the min was " +  weeklyMins[weekCounter]);
			}
	}
}
