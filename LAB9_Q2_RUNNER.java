package Q2;

import java.util.StringTokenizer;

public class LAB9_Q2_RUNNER {
	public static void main(String[] args) {
		StringTokenizer s1 = new StringTokenizer("I am Laraib Zahra");
		CustomStringTokenizer c1 = null;
		while(s1.hasMoreTokens()) {
			c1 = new CustomStringTokenizer(s1.nextToken());
		}
		
		int token_count = c1.countToken();
		System.out.println(token_count);
		
	}
}
