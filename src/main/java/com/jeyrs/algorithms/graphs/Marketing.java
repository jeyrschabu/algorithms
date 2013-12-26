package com.jeyrs.algorithms.graphs;

public class Marketing {
	public static int[][] table;
	public static int[] visited;
	public static int RED = 1;

	public static int BLACK = 0;

	public static void main(String[] args) {
		Marketing tmp = new Marketing();
		String s[] = new String[] { "", "", "", "", "", "", "", "", "", "", "",
				"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
				"", "", "" };
		long res = tmp.howMany(s);

		System.out.println(res);
	}

	public static boolean dfs(int node, int color, int n) {
		visited[node] = color;
		for (int i = 0; i < n; i++) {
			if (node != i) {
				if (table[i][node] == 1 && visited[i] != -1
						&& visited[i] == color)
					return false;
				if (table[i][node] == 1 && visited[i] == -1
						&& !dfs(i, 1 - color, n))
					return false;
			}
		}
		return true;
	}

	public static int find_components(String[] s) {
		int N = s.length;
		int result = 0;
		for (int i = 0; i < N; i++) {
			if (visited[i] == -1) {
				if (!dfs(i, BLACK, N)) {
					return -1;
				}
				result++;
			}
		}
		return 1 << result;
	}

	public static void makeGraph(String[] compete) {
		int n = compete.length;
		table = new int[n][n];
		for (int i = 0; i < n; i++) {
			char[] array = compete[i].toCharArray();
			for (int j = 0; j < array.length; j++) {
				if (array[j] != ' ') {
					table[i][Integer.parseInt("" + array[j])] = 1;
					table[Integer.parseInt("" + array[j])][i] = 1;
				}
			}
		}
		visited = new int[n];
		for (int i = 0; i < n; i++){
			visited[i] = -1;
		}
	}
	public long howMany(String[] compete) {
		makeGraph(compete);
		return find_components(compete);
	}
}
