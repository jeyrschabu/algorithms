package com.jeyrs.algorithms;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class NumberStuff {
	public static void main(String [] args){
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
		
		System.out.println(pythagoreTriplet());
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
	public static int fib(int n){
		if(n == 0 || n == 1)return n;
		return fib(n-2) + fib(n-1);
	}
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
	public static int pythagoreTriplet(){
		double a = 0, b=0, c=0;
		for(int i = 2; i >= 0; i=i*2){
			a = i;
			b = Math.pow(a/2, 2) - 1;
			c = b + 2;
			System.out.println("a => " + a + " b => " + b +" c => " + c);
			if(a + b + c == 1000){
				System.out.println("a => " + a + "b => " + b +"c => " + c);
				break;
			}
		}
		//System.out.printf("a => %d, b => %d, c => %d", (int)a, (int)b, (int)c);
		return (int)(a * b * c);
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
	
}
