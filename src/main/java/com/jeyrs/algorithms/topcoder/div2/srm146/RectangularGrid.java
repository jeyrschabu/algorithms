package com.jeyrs.algorithms.topcoder.div2.srm146;

import java.util.*;

//SRM 146 500
public class RectangularGrid {

	public long countRectangles(int m, int n) {
		long count = 0;
		for(int i = 1; i <= m; i++){
			for(int j =1; j <=n; j++ )
				if(i != j)
					count += (m + 1 - i) * (n + 1 - j);
		}
		return count;
	}
}
