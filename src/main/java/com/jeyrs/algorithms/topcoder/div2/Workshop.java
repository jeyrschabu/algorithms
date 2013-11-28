package com.jeyrs.algorithms.topcoder.div2;

//SRM 166
public class Workshop{
	public int pictureFrames(int[] pieces){
		int count = 0;
		for(int i=0; i < pieces.length; i++){
			for(int j=i + 1; j < pieces.length; j++)
				for(int k = j + 1; k< pieces.length; k++)
					if(pieces[i] == pieces[j] && pieces[i] == pieces[k]){// if square
						count++;
					}else{
						if(pieces[i] + pieces[j] > pieces[k]
							&& pieces[j] + pieces[k] > pieces[i]
								&& pieces[k] + pieces[i] > pieces[j]){ //can we form a triangle
							count++;
						}
					}
		}
		return count;
	}
}