//Function Description
//
//Complete the repeatedString function in the editor below. It should return an integer representing the number of occurrences of a in the prefix of length  in the infinitely repeating string.
//
//repeatedString has the following parameter(s):
//
//s: a string to repeat
//n: the number of characters to consider
//Input Format
//
//The first line contains a single string, .
//The second line contains an integer, .
package HackerRank.warmup.challenges;

public class RepeatedString {
	static long repeatedString(String s, long n) {

		long countForSubstring = 0;
		long totalCount = 0;

		// Determines how many a's are in a substring
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				countForSubstring++;
			}
		}

		// Determines how many complete substrings we will analyze
		long divisor = n / s.length();

		totalCount += divisor * countForSubstring;

		// Determines how many characters in we will analyze towards the end of our n
		// range
		long remainder = n % s.length();

		for (int i = 0; i < remainder; i++) {
			if (s.charAt(i) == 'a') {
				totalCount++;
			}
		}
		return totalCount;
	}

	public static void main(String[] args) {
		System.out.println(repeatedString("aba", 10));
	}
}
