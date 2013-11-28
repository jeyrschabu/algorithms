package com.jeyrs.algorithms;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ProjectEuler {
	public static void main(String [] args) throws MalformedURLException{
		//long l = triangleNumberWithOverXDivisors(500);
		//System.out.println(l);
		//int limit = 1000000;
		//lcs(limit);
		
		//System.out.println(binomialCoefficient(40, 20));
		
		//System.out.println(power(1000));
		//DecimalFormat format = new DecimalFormat("#");
		//System.out.println(format.format(Math.pow(2, 1000)));
		
		
		Map<Integer, String> dictionary = new HashMap<Integer, String>();
		dictionary.put(-1, "and");
		dictionary.put(1, "one");
		dictionary.put(2, "two");
		dictionary.put(3, "three");
		dictionary.put(4, "four");
		dictionary.put(5, "five");
		dictionary.put(6, "six");
		dictionary.put(7, "seven");
		dictionary.put(8, "eight");
		dictionary.put(9, "nine");
		dictionary.put(10, "ten");
		dictionary.put(11, "eleven");
		dictionary.put(12, "twelve");
		dictionary.put(13, "thirteen");
		dictionary.put(14, "fourteen");
		dictionary.put(15, "fifteen");
		dictionary.put(16, "sixteen");
		dictionary.put(17, "seventeen");
		dictionary.put(18, "eighteen");
		dictionary.put(19, "nineteen");
		dictionary.put(20, "twenty");
		dictionary.put(30, "thrity");
		dictionary.put(40, "forty");
		dictionary.put(50, "fifty");
		dictionary.put(60, "sixty");
		dictionary.put(70, "seventy");
		dictionary.put(80, "eighty");
		dictionary.put(90, "ninety");
		dictionary.put(100, "hundred");
		dictionary.put(1000, "thousand");
		
		
		//System.out.println(lookup(dictionary, 1, 1, 21));
		//System.out.println("Total is " +lookup(dictionary, 1000));
		//int n = 1000;
		//int total = lookup(dictionary, n);
		//System.out.println(total);
		//String letter2 = lookupSingle(dictionary, 3);
		//System.out.println(letter2);
		
//		int[][] matrix = { { 3, 0, 0, 0 }, { 7, 4, 0, 0}, { 2, 4, 6, 0}, { 8, 5, 9, 3} };
//		for(int row=0; row< matrix.length; row++){
//			for(int col = 0; col < matrix.length; col++){
//				System.out.print(matrix[row][col] + "-");
//			}
//			System.out.println();
//		}
//		Node g = copyMatrix(matrix);
//		System.out.println("head is :" + g.data);
//		for(Node n : g.adj){
//			System.out.print("Node :" + n.data + "(" +n.adj.size() + ") => ");
//			System.out.print("{");
//			for(Node l : n.adj){
//				System.out.print(l.data);
//			}
//			System.out.println("}");
//		}
//		dfs(g , 0, new LinkedList<Node>());
		
		
		//System.out.println(maxCount(matrix));
		
		
		//int res = howManySundays();
		//System.out.println("Result is => " + res);
		//howManySundays0();
		//System.out.println(factorialDigitSum(100));
		
		
		System.out.println(getAmicableNumbersSum(1000));
		
	}

	static void dfs(Node start, int maxCount, List<Node> visited){
		int total = 0;
		Stack<Node> stack = new Stack<Node>();
		visited.add(start);
		stack.push(start);

		while(!stack.isEmpty()){
			Node p = stack.pop();
			for(Node a : p.adj){
				if(!visited.contains(a)){
					visited.add(a);
					total +=a.data;
					if(total > maxCount)
						maxCount = total;
					stack.push(a);
					dfs(a, maxCount, visited);
				}
			}
		}
		System.out.println("MAX = >" + maxCount);
	}
	static class Node{
		int data;
		List<Node> adj = new LinkedList<Node>();
		public String toString(){
			return "Data: " + data + ": adj " + adj;
		}
	}
	static class Graph{
		List<Node> nodes = new LinkedList<Node>();
	}
	static Node copyMatrix(int matrix[][]){
		Node node = new Node();
		node.data = matrix[0][0];
		for(int row=1; row < matrix.length; row++){
			for(int col = 0; col < matrix[row].length; col++){
				node.adj.add(march(matrix, row, col));
			}
		}
		return node;
	}
	//problem #18
	static int maxCount(int table[][]){
		for(int row = table.length - 1; row >0; row--)
			for(int col=0; col < table.length - 1; col++)
				table[row - 1][col] += Math.max(table[row][col], table[row][col + 1]); 
		
		return table[0][0];
	}
	public static Node march(int matrix[][], int i, int j){
		Node current = new Node();
		current.data = matrix[i][j];
		
		Node r = getNode(i + 1, j, matrix);
		Node l = getNode(i - 1, j, matrix);
		//Node u = getNode(i, j + 1, matrix);
		Node d = getNode(i, j - 1, matrix);
		
		List<Node> list = new LinkedList<Node>();
		
		if(r != null){
			list.add(r);
		}
		if(l != null){
			list.add(l);
		}
//		if(u != null){
//			list.add(u);
//		}
		if(d != null){
			list.add(d);
		}
		current.adj = list;
		
		return current;
	}
	public  static Node getNode(int i, int j, int matrix[][]) {
		Node node = null;
		if(i>=0 && i <= matrix.length - 1 && j >=0 && j <=matrix.length - 1){
			node = new Node();
			node.data = matrix[i][j];
		}
		return node;
	}
	public static long triangleNumberWithOverXDivisors(long x){
		for(long i=1; i > 0; i++){
			if(isTriangle(i)){
				if(countFactors(i) >= x){
					return i;
				}
			}
		}
		return -1;
	}
	public static boolean isTriangle(long x){
		double d = Math.sqrt(8*x + 1);
		double n = (d - 1)/2;
		if(n == (int) n){
			return true;
		}
		return false;
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
	public static List<Long> primeFactorsLessThan(long num){
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
	public static int[] largeSum(){
		String str = BigString.bigString;
		String [] b = str.split(",");
		
		BigInteger bi [] = new BigInteger[b.length];
		
		int i=0;
		for(String s : b){
			bi[i++] = new BigInteger(s);
		}
		BigInteger total = BigInteger.ONE;
		for(BigInteger d : bi){
			total = total.add(d);
		}
		String lstr = total.toString();
		char chars[] = new char[lstr.length()];
		int index = 0;
		for(int k= lstr.length() - 1; k >= 0; k--){
			chars[index++] = lstr.charAt(k); 
		}
		BigInteger f = new BigInteger(new String(chars));
		return parseBigInt(f, 10);
	}
	public static int[] parseBigInt(BigInteger n, int limit){
		int [] digits = new int[limit];
		BigInteger tmp = n;
		
		for(int i = 0; i < digits.length; i++){
			digits[i] = tmp.remainder(new BigInteger("100")).intValue();
			tmp = tmp.divide(new BigInteger("10"));
			if(tmp == null)
				break;
		}
		return digits;
	}
	//problem 14
	public static void lcs(int limit){
		long maxSize = 0;
		long arr [] = new long[limit + 1];
		for(int i=limit; i > 0; i--){
			List<Long> sequence = generateSequenceRec(i, new ArrayList<Long>());
			int size = sequence.size();
			if(size  < maxSize) continue;
			maxSize = size;
			arr[i] = size;
		}
		for(int i=0; i < arr.length; i++){
			if(arr[i] == maxSize)
				System.out.println("Starting number(s) with max sequence length => " + maxSize + ": "+ i);
		}
		
	}
	private static List<Long> generateSequence(long n){
		long tmp = n;
		List<Long> list = new ArrayList<Long>();
		list.add(n);
		while(tmp >= 1){
			if(isEven(tmp)){
				tmp = tmp/2;
			}else{
				tmp = 3*tmp + 1;
			}
			list.add(tmp);
			if(tmp == 1) break;
		}
		return list;
	}
	private static List<Long> generateSequenceRec(long n, List<Long> list){
		list.add(n);
		if(n == 1)
			return list;
		else{
			if(isEven(n)){
				return generateSequenceRec(n/2, list);
			}else{
				return generateSequenceRec(3*n + 1, list);
			}
		}
	}
	private static boolean isEven(long x) {
		if((x & 1) == 0)
			return true;
		return false;
	}
	//#15
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
	//#16
	public static long power(long n){
		long total = 0;
		BigInteger bi = BigInteger.ONE.add(BigInteger.ONE);
		bi = bi.pow(1000);
		int digits [] = parseBigInt(bi, 1000);
		
		for(int i : digits){
			total +=i;
		}
		return total;
	}
	private static String lookupNumber(Map<Integer, String> dictionary, int n){
		int multiplier = 10;
		String letter = null;
		int first = 0;
		int r =0;
		if(n > 20) 
			r = n%multiplier;
		if(n >= 100 && n < 1000)
			multiplier = 100;
		else if(n >= 1000 ){
			multiplier = 1000;
		}
		if(n >= 100){
			first = Integer.parseInt(String.valueOf(String.valueOf(n).charAt(0)));
			String f = dictionary.get(first);
			String mid =dictionary.get(multiplier);
			String and = dictionary.get(-1);
			String last = "";
			int whole = first * multiplier;
			letter = f +" "+mid;
			if(n % multiplier == 0){
				and="";
			}else{
				String p = lookupNumber(dictionary, n - whole);
				last=p;
				letter +=" "+and+" "+last;
			}
			return letter;
		}
		letter = dictionary.get(n - r);
		String extra = dictionary.get(r);
		
		if(extra != null){
			letter +="-"+extra;
		}
		return letter;
	}
	public static int lookup(Map<Integer, String> dictionary, int n){
		int totalLength = 0;
		for(int i=1; i <= n; i++){
			totalLength +=getCleanStringLength(lookupNumber(dictionary, i));
		}
		return totalLength;
	}
	private static int getCleanStringLength(String l) {
		String str = l.replaceAll(" ", "");
		str = str.replaceAll("-", "");
		return str.length();
	}
	public static void findMaximumSuMatrix(int matrix[][]){
		int holder[];
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0; i < matrix.length; i++){
			holder = new int[matrix[0].length];
			int current = 0;
			int maxCurrent = Integer.MIN_VALUE;
			
			for(int k=0; k < matrix[0].length; k++){
				current = 0;
				for(int j=0; j < matrix[0].length;j++ ){
					holder[j] = holder[j] + matrix[k][j];
					current = current + holder[j];
					if(current > maxCurrent){
						maxCurrent = current;
					}
					if(current < 0) current = 0;
					if(maxSum < maxCurrent) maxSum = maxCurrent;
				}
			}
		}
		System.out.println(maxSum);
	}
	public static int howManySundays0(){
		int sundays = 0;
		//first pass
		int day = 1;
		int year = 1900;
		for(; year < 1901; year++)
			for(int month = 1; month <= 12; month++)
				for(int date = 1; date <= daysInMonth(month, year); date++, day++){
					if(day % 7 == 0)day = 0;
				}
		for(; year <= 2000; year++){
			for(int month = 1; month <= 12; month++){
				int limit = daysInMonth(month, year);
				for(int date = 1; date <= limit; date++, day++){
					if(day % 7 == 0){
						if(date == 1) sundays++;
						day = 0;
					}
				}
			}
		}
		return sundays;
	}
	static int daysInMonth(int month, int year){
		int count = 31;
		if(month == 9 || month == 4 || month == 6 || month == 11)
			count = 30;
		else if(month == 2){
			count = 28;
			if(year % 100 != 0){
				if(year % 4 == 0)
					count = 29;
			}else{
				if(year % 400 == 0)
					count = 29;
			}
		}
		return count;
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
	public static BigInteger factorial(int n){
        BigInteger ret = BigInteger.ONE;
        for (int i = 1; i <= n; ++i) ret = ret.multiply(BigInteger.valueOf(i));
        return ret;
	}
	public static long factorialDigitSum(int i){
		BigInteger f = factorial(i);
		int len = f.toString().length();
		int [] digits = new int[len];
		BigInteger tmp = f;
		for(int j = 0; j < digits.length; j++){
			digits[j] = tmp.remainder(new BigInteger("10")).intValue();
			tmp = tmp.divide(new BigInteger("10"));
			if(tmp == null)
				break;
		}
		int total = 0;
		for(int j = 0; j < digits.length; j++){
			total += digits[j];
		}
		return total;
	}
	public static long sumOfDivisors(int n){
		List<Long> factors = primeFactors(n);
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
			total *=(Math.pow(me.getKey(), me.getValue() + 1) - 1)/(me.getKey() - 1);
		}
		return total;
	}
	public static long getAmicableNumbersSum(int limit){
		long buffer [] = new long[limit + 1];
		long total = 0;
		
		for(int i = 0; i < limit; i++){
			buffer[i] = sumOfDivisors(i);
			buffer[i] -= i;
			System.out.println("num => ["+i+"] divisors => ["+ (buffer[i])+"]");
		}
		int b = 0;
		for(long a = 0; a < buffer.length; a = buffer[b++]){
			//long tmp = buffer[(int)a];//b = d(a)
			System.out.println("a =>" + a);
			if(buffer[(int)a] == b){
				total +=b + a;
			}
		}
		return total;
	}
}