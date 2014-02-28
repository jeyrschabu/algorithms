package com.jeyrs.algorithms.topcoder.div2;
//SRM 144 div2 1100
public class PowerOutage {
	int TOTAL = 4;
	public int estimateTimeOut(int[] fromJunction, int[] toJunction, int[] ductLength) {
		int matrix[][] = new int[TOTAL][TOTAL];
		int ans = 0;
		for(int i=0; i < fromJunction.length; i++){
			matrix[fromJunction[i]][toJunction[i]] = ductLength[i];
			ans +=ductLength[i];
		}
		ans +=ans;
		int[] memo = new int[TOTAL];
		
		for(int i=TOTAL -1 ; i >=0; i--){
			memo[i]=0;
			for(int j=i + 1; j < TOTAL; j++){
				if(matrix[i][j] > 0 && matrix[i][j] + memo[j] > memo[i])
					memo[i] = memo[j] + matrix[i][j];
			}
		}
		return ans - memo[0];
	}
   public int estimateTimeOut0(int[] fromJunction, int[] toJunction, int[] ductLength){
      int totalLength = 0;
      for(int i=0; i < ductLength.length; i++){
        totalLength += ductLength[i] * 2;
      }
      // ...except for the ones on the path that is farthest from the entrance
      totalLength -= calcMaxDepth(0, fromJunction, toJunction, ductLength);

      return totalLength;
    }
   private int calcMaxDepth(int id, int[] fromJunction, int[] toJunction, int[] ductLength){
	   int maxDepth = 0;
	   for (int i = 0; i < fromJunction.length; i += 1){
		   if (fromJunction[i] == id){
			   maxDepth = Math.max(maxDepth, ductLength[i] + calcMaxDepth(toJunction[i], fromJunction, toJunction, ductLength));
		   }
		   System.out.println("is => " + maxDepth);
	   }
	   return maxDepth;
   }
	public static void main(String args[]){
		
		PowerOutage tmp = new PowerOutage();
		
		int[] fromJunction = {0,1,0};
		int[] toJunction = {1,2,3};
		int[] ductLength = {10,10,10};
		
		int max = tmp.calcMaxDepth(0, fromJunction, toJunction, ductLength);
		
		System.out.println("Max time is " + max);
		
		int min = tmp.estimateTimeOut(fromJunction, toJunction, ductLength);
		System.out.println(min);
	}
}
