package com.jeyrs.algorithms;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class NumberStuff {
	public static void main(String [] args){
		double d = 48;
		double s = 65;
		double r = d/s;
		System.out.println("=>>>" + r * 100);
		//System.out.println(getSumOfEvenFibonacci());
		//long n = 600851475143L;
		//getPrimeFactors(n);
		//System.out.println(getLargestPalendromeFromProduct());
		//System.out.println(getLowestDivisible(20));
		//System.out.println(diffOfSumOfSquaresAndSquareOfSum(100));
		
		//System.out.println(getNthPrime(10001));
		BigInteger myBigInteger = new BigInteger("7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450");
		//BigInteger myBigInteger = new BigInteger("123456");
		System.out.println(getLargestProductOfFiveDigit(myBigInteger));
		
		//System.out.println(pythagorianTriplet());
		//System.out.println(pythagorianTriplet0());

//		long startTime = System.currentTimeMillis();
//		long result = sumOfPrimesBelow2mil();
//	    long endTime = System.currentTimeMillis();
//	    System.out.println("Total execution time: " + (endTime-startTime) + "ms");
//	    System.out.println(result);
//	    
//	    System.out.println(02);
	    
//	    int [][] matrix = {
//	    		{8,02,22,97,38,15,00,40,00,75,04,05,07,78,52,12,50,77,91,8},
//	    		{49,49,99,40,17,81,18,57,60,87,17,40,98,43,69,48,04,56,62,00},
//	    		{81,49,31,73,55,79,14,29,93,71,40,67,53,88,30,03,49,13,36,65},
//	    		{52,70,95,23,04,60,11,42,69,24,68,56,01,32,56,71,37,02,36,91},
//	    		{22,31,16,71,51,67,63,89,41,92,36,54,22,40,40,28,66,33,13,80},
//	    		{24,47,32,60,99,03,45,02,44,75,33,53,78,36,84,20,35,17,12,50},
//	    		{32,98,81,28,64,23,67,10,26,38,40,67,59,54,70,66,18,38,64,70},
//	    		{67,26,20,68,02,62,12,20,95,63,94,39,63,8,40,91,66,49,94,21},
//	    		{24,55,58,05,66,73,99,26,97,17,78,78,96,83,14,88,34,89,63,72},
//	    		{21,36,23,9,75,00,76,44,20,45,35,14,00,61,33,97,34,31,33,95},
//	    		{78,17,53,28,22,75,31,67,15,94,03,80,04,62,16,14,9,53,56,92},
//	    		{16,39,05,42,96,35,31,47,55,58,88,24,00,17,54,24,36,29,85,57},
//	    		{86,56,00,48,35,71,89,07,05,44,44,37,44,60,21,58,51,54,17,58},
//	    		{19,80,81,68,05,94,47,69,28,73,92,13,86,52,17,77,04,89,55,40},
//	    		{04,52,8,83,97,35,99,16,07,97,57,32,16,26,26,79,33,27,98,66},
//	    		{88,36,68,87,57,62,20,72,03,46,33,67,46,55,12,32,63,93,53,69},
//	    		{04,42,16,73,38,25,39,11,24,94,72,18,8,46,29,32,40,62,76,36},
//	    		{20,69,36,41,72,30,23,88,34,62,99,69,82,67,59,85,74,04,36,16},
//	    		{20,73,35,29,78,31,90,01,74,31,49,71,48,86,81,16,23,57,05,54},
//	    		{01,70,54,71,83,51,54,69,16,92,33,48,61,43,52,01,89,19,67,48},
//	    	};
//	    getProductOf4InAllDirections(matrix);
		//System.out.println("nth triangle number " + getTriangleNumber(4));
		
		
		
		long l = triangleNumberWithOver500Factors();
		System.out.println("==> " +l);
		//grayCodeBeckett(3, true);
		//ex233(6);
		/**
		 * {"INDIGO: 93 8 T F",
 "ORANGE: 29 8 F T",
 "VIOLET: 76 6 F F",
 "BLUE: 100 8 T T",
 "RED: 99 8 T T",
 "GREEN: 78 6 F T",
 "YELLOW: 75 6 F F"}
		 */
		
		//int n = 5;
		//System.out.println("is "+n+" odd =>" + ((n & 1) == 1));
		//System.out.println(truncate(12));
		//5595716255209128
		//5595716255209128
		//System.out.println(fermatFactor(5959));
		//fermatFactor(5959);
		
	}
	public static void fermatFactor(long n){
		double b2=0l;  
		double a=Math.ceil(Math.sqrt(n))-1;
		do{
			a++;
			b2=a*a-n;
		}while(Math.sqrt(b2)%1!=0);//while x is not a perfect square
		System.out.println(Math.sqrt(b2));
		
		System.out.println("x="+(a-Math.sqrt(b2))+",y="+(a+Math.sqrt(b2)));
	}
	public static double truncate(double value){
		int min = (int)value;
		return value - (value - min);
	}
	public static long possibilities(int n, int k, boolean sorted, boolean uniq){
		long total = (long) Math.pow(n, k);
		
		long f = factorial(n).longValue();
		long ret = 0;
		if(!sorted && !uniq)
			ret = total;
		if(!sorted && uniq)
			ret = nCk(n, k).longValue() * f;
		if(sorted && uniq)
			ret = nCk(n, k).longValue();
		if(sorted && !uniq)
	
		if(uniq){
			total = 1;
			for(int i=0; i < k; i++)
				total *= n - i;
		}
		return ret;
	}
	public static BigInteger nCk(int n, int k){
		return factorial(n).divide(factorial(n - k).multiply(factorial(k)));
	}
	public static BigInteger factorial(int n){
        BigInteger ret = BigInteger.ONE;
        for (int i = 1; i <= n; ++i) ret = ret.multiply(BigInteger.valueOf(i));
        return ret;
	}
	public static int fib(int n){
		if(n == 0 || n == 1)return n;
		return fib(n-2) + fib(n-1);
	}
	public static int fibDP(int n){
		if(n == 0) return 0;
		boolean memo [] = new boolean[2*n];
		memo[0]=true;
		memo[1]=true;
		
		if(memo[n])
			return n;
		int f = fib(n - 2) + fib(n - 1);
		memo[f] = true;
		return f;
	}
	public static void ex233(int n) {
	    if (n <= 0) return;
	    System.out.println("Before " + n);
	    ex233(n-2);
	    ex233(n-3);
	    System.out.println("After " + n);
	}
	public static void grayCodeBeckett(int n, boolean forward){
		if(n == 0)
			return;
		grayCodeBeckett(n - 1, true);
		if(forward)
			System.out.println("Enter " + n);
		else
			System.out.println("Exit " + n);
		grayCodeBeckett(n - 1, false);
	}
	public static void towerOfHanoi(int n, boolean left){
		if(n == 0)return;
		towerOfHanoi(n-1, !left);
		if(left)
			System.out.println("left " + n);
		else
			System.out.println("right " + n);
		towerOfHanoi(n - 1, !left);		
	}
	public static long binomialCoefficient(int n, int k){
		int max = (n+1);
		long table[][] = new long[max][max];
		//initialize the table
		for(int i=0; i<=n; i++)table[i][0]=1;
		for(int j=1; j<=n; j++)table[j][j]=1;
		for(int i = 1; i<=n; i++)
			for(int j=1; j < i; j++)
				table[i][j] = table[i - 1][j-1] + table[i - 1][j];
		return table[n][k];
	}
	public static List<Long> primeFactors(long num){
		long n = num;
		List<Long> factors = new ArrayList<Long>();
		
		for(long i = 2; i <= n/i; i++)
			while(n % i == 0){
				factors.add(i);
				n /= i;
			}
		if(n > 1){
			factors.add(n);
		}
		return factors;
	}
	public static long countFactors(long m){
		List<Long> factors = primeFactors(m);
		Map<Long, Long> map = new HashMap<Long, Long>();
		
		long count = 1;
		for(long i : factors){
			if(null != map.get(i)){				
				count = map.get(i) + 1;
			}
			map.put(i, count);
			count = 1;//reset to 1;s
		}
		long total = 1;
		for(Map.Entry<Long, Long> me : map.entrySet()){
			long i = me.getValue() + 1;
			total *= i;
		}
		return total;
	}
	public static long triangleNumberWithOver500Factors(){
		for(long i=3000; i > 0; i++){
			long tn = getNthTriangleNumber(i);
			if(isPrime(tn))continue;
			long f = countFactors(tn);
			System.out.println("Triangle Number =>" + tn + ", factors => " + f);
			if(f <= 500) return tn;
		}
		return -1;
	}
	public static long getNthTriangleNumber(long i){
		return binomialCoefficient((int)i + 1, 2);
	}
	public static int getSumOfEvenFibonacci(){
		int limit = 4000000;
		int n = 0;
		while(true){
			if(fib(n) > limit)
				break;
			n++;
		}
		n--;
		int sum = (fib(n + 2) - 1)/2;
		return sum; 
		/**
		 *  So your sum S = F3+F6+F9+...+F(3n) = (F1+F2) + (F4+F5) + (F7+F8)+...+(F(3n--2)+F(3n-1)) = T,
		 *  but S+T = F(3n)+F(3n-1)+...+F2+F1 = F(3n+2)-F1. 
		 *  Which give the neat formula S = 1/2(F(3n+2)-1).
		 *  F(33) = 3,524,578 is the last even fibonacci number before 4,000,000.
		 *  So your sum = 1/2(F(35)-1) = 1/2(9,227,465-1) = 4,613,732.
		 */
	}//4613732
	
	public static void getPrimeFactors(long n){
		boolean [] primes = sieveOfEratosthenes(n);
		int max = 0;
	    for(int i=0; i<primes.length; i++){
	        if(primes[i]==true && n % i == 0){
	            if(max < i)max = i;
	        }
	    }
	    System.out.println(max);
	}
	public static boolean isPrime(long tn){
		for(long i=3; i<=Math.sqrt(tn); i+=2)
			if(tn % i == 0)
				return false;
		return true;
	}
	public static long sumOfPrimesBelow2mil(){
		int limit = 2000000;
		boolean[] primeCandidates = new boolean[limit];
		
		for(int i=2; i < primeCandidates.length; i++){
			primeCandidates[i]=true;
		}
		//elimitation
		for(int i=1; i < Math.sqrt(limit); i++)
			if(primeCandidates[i] == true)
				for(int j= i+i; j< primeCandidates.length; j=j+i)
					primeCandidates[j] = false;
		
		long result = 0;
		for(int i=0; i < primeCandidates.length; i++)
			if(primeCandidates[i] == true)
				result +=i;
		return result;
	}
	public static int getNthPrime(int n){
		int limit = 1000000;
	    boolean[] primeCandidates = new boolean[limit];
	    
	    for(int i=2; i<primeCandidates.length; i++ ){
	    	primeCandidates[i]=true;
	    }
	    int k = 0;
	    int result [] = new int[limit];
	    for(int i=1; i<Math.sqrt(limit);i++){
	        if(primeCandidates[i] == true){
	            for(int j = i + i; j<primeCandidates.length; j=j+i){
	                primeCandidates[j]=false;
	            }
	        }
	    }
	    for(int i = 0; i < primeCandidates.length; i ++){
	    	if(primeCandidates[i] == true){
	    		result[k] = i;
	    		k++;
	    	}
	    }
		return result[n-1];
	}
	private static boolean[] sieveOfEratosthenes(long max){
	    boolean[] primeCandidates = new boolean[1000000]; //defaults to false
	    
	    for(int i=2; i<primeCandidates.length; i++ ){
	    	primeCandidates[i]=true;
	    }
	    for(int i=10; i<Math.sqrt(max);i++){
	        if(primeCandidates[i] == true){
	            for(int j = i + i; j<primeCandidates.length; j=j+i){
	                primeCandidates[j]=false;
	            }
	        }
	    }
	    return primeCandidates;
	}
	/*
	 * The palendrome from product of two 3 digits integers
	 */
	public static int getLargestPalendromeFromProduct(){
		int limit = 1000;
		List<Integer> palendromes = new ArrayList<Integer>();
		int p = 0;
		for(int i=100; i < limit; i++)
			for(int j = 100; j < limit; j++){ 
				p = i * j;
				if(isPalindrome(p) && !palendromes.contains(p))
					palendromes.add(p);
			}
		return getMax(palendromes);
		
	}
	private static int getMax(List<Integer> nums){
		int max = nums.get(0);
		for(int i = 1; i < nums.size(); i++)
			if(nums.get(i) > max)
				max = nums.get(i);
		return max;
	}
	public static int getLargestProductOfFiveDigit(BigInteger n){
		int limit = 1000;
		int [] digits = new int[limit];
		BigInteger tmp = n;
		
		for(int i = 0; i < digits.length; i++){
			digits[i]= tmp.remainder(new BigInteger("10")).intValue();
			tmp = tmp.divide(new BigInteger("10"));
			if(tmp == null)
				break;
		}
		int [] prods = new int[limit];
		for(int i = 0; i < digits.length; i++){
			int key = digits[i];
			int j = i + 4;
			while(j > i && j <= digits.length - 1){
				key = key * digits[j];
				j--;
			}
			prods[i] = key;
		}
		Arrays.sort(prods);
		return prods[prods.length - 1];
	}
	private static boolean isPalindrome(int p) {
		int[] a = new int[6];
		int tmp = p;
		for(int i=0;i <a.length; i++){
			a[i]=tmp%10;
			tmp /=10;
			if(tmp == 0)
				break;
		}
		for(int i = 0; i < a.length; i++){
			if(a[i] != a[a.length -1 - i]){
				return false;
			}
		}
		return true;
	}
	/**
	 * get the lowest digit divisible by 1 to 10
	 * @return
	 */
	public static int getLowestDivisible(int n){
		for(int i=1; i > 0; i++)
			for(int j = 1; j <= n; j++){
				if(i % j != 0)
					break;
				if(j == n)
					return i;
			}
		return -1;
	}
	public static int gcd0(int m, int n){
		if(m % n == 0) return n;
		else if(m > n)
			return gcd(n, m%n);
		else return gcd(m, n%m);
	}
	public static int gcd(int x, int y){
		if(x % y == 0)
			return y;
		else if(x > y)
			return gcd(y, x % y);
		else
			return gcd(y, x);
	}
	public static int lcm(int x, int y){
		int gcd = gcd(x, y);
		return (x * y)/gcd;
	}
	public static int diffOfSumOfSquaresAndSquareOfSum(int n){
		double sumOfSquares = Math.pow(n, 3)/3 + Math.pow(n, 2)/2 + n/6;
		double squareOfSum = Math.pow((n*(n + 1))/2, 2);
		return (int)(squareOfSum - sumOfSquares);
	}

	public static int pythagorianTriplet(){
		//first populate the array with odd numbers
		int limit = 1000;
		int [] odds = new int[limit];
		int j=0;
		for(int i=0; i<limit; i++){
			odds[j] = 2*i + 1;
			j++;
		}
		int a = 0, b=0, tmpb=0, c=0, k=0;
		for(int i=0; i < odds.length; i++)
			if(isPerfectSquare(odds[i]) && odds[i] > 1){
				a = (int)Math.sqrt(odds[i]);
				while(k < i){
					tmpb += odds[k];
					k++;
				}
				b = (int)Math.sqrt(tmpb);
				c = (int)Math.sqrt(tmpb + odds[i]);
				System.out.printf("{%d, %d, %d}\n", a,b,c);
				if(a + b +c == 1000){
					System.out.println("got a match!");
					break;
				}
			}
		return a*b*c;
	}
	public static int pythagorianTriplet0(){
		for(int a=1; a <= 500; a++)
			for(int b=a; b<=500; b++)
				for(int c=b; c<=500; c++)
					if((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)){
						if(a + b + c == 1000)
							return a*b*c;
					}
		return 0;
	}
	//euler 11
	public static int getProductOf4InAllDirections(int matrix[][]){
		int largestProduct = 0;
		for(int row = 0; row < matrix.length; row++){
			int tmp = 0;
			for(int col = 0; col < matrix[row].length; col++){
				//check vertically
				if(row < matrix[row].length - 4){
					tmp = matrix[col][row];
					for(int i=1; i < 4; i++)
						tmp *=matrix[col][row + i];
					largestProduct = Math.max(largestProduct, tmp);
				}
				//check horizontally
				if(col < matrix[col].length - 4){
					tmp = matrix[col][row];
					for(int i=1; i< 4;i++)
						tmp *=matrix[col + i][row];
					largestProduct = Math.max(largestProduct, tmp);
				}
				
				if(col < matrix[col].length - 4 && (row >= 4)){
					tmp = matrix[col][row];
					for(int i=1; i< 4;i++)
						tmp *=matrix[col + i][row - i];
					largestProduct = Math.max(largestProduct, tmp);
				}
				if(row < matrix[row].length - 4 && col < matrix[col].length -  4 ){
					tmp = matrix[col][row];
					for(int i=1; i< 4;i++)
						tmp *=matrix[col + i][row + i];
					largestProduct = Math.max(largestProduct, tmp);
				}
			}
		}
		System.out.println(largestProduct);
		return largestProduct;
	}
	private static int getFactors(int n) {
		int count = 0;
		for(int i =1; i <= n; i++)
			if(n % i == 0)
				count++;
		return count;
	}
	public static long getFactors0(long n){
		long count = 0;
		if(n == 1)
			return count;
		if(n % 2 == 0)
			count = getFactors0(n) * getFactors0((n + 1)/2);
		else
			count = getFactors0(n/2) * getFactors0((n + 1));
		return count;
	}

	public static boolean isPerfectSquare(int n){
	    int h = n & 0xF;  // h is the last hex "digit"
	    if (h > 9)
	        return false;
	    // Use lazy evaluation to jump out of the if statement as soon as possible
	    if(h != 2 && h != 3 && h != 5 && h != 6 && h != 7 && h != 8){
	    	int s =(int)Math.floor(Math.sqrt(n) + 0.5);
	        return s*s == n;
	    }
	    return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
