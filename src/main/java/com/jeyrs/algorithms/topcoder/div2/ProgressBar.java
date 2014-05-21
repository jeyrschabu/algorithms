package com.jeyrs.algorithms.topcoder.div2;
//SRM 173
public class ProgressBar {
	public String showProgress(int[] taskTimes, int tasksCompleted) {
		double c = 0, expected = 0;
		double percent = 0;
		
		for(int i=0; i < tasksCompleted; i++){
			c +=taskTimes[i];
		}
		for(int i=0; i < taskTimes.length; i++){
			expected +=taskTimes[i];
		}
		
		percent = c/expected;
		double count = Math.floor(percent * 20);
		String pbar = "";
		
		for(int i=0; i < count; i++)
			pbar +="#";
		
		int len = pbar.length();
		int remaining = 20 -len;

		for(int i=0; i < remaining; i++)
			pbar += ".";

		return pbar;
	}
}