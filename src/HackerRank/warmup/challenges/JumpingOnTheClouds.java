package HackerRank.warmup.challenges;

public class JumpingOnTheClouds {
	static int solution(int[] c) {
		int count = 0;
		int i = 0;
		while (i < c.length - 1) {
			if (i + 2 >= c.length || c[i + 2] == 1) {
				i++;
				
			} else {
				i += 2;
			}
			count++;
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 0, 0, 0, 0, 1, 0 }));
		System.out.println(solution(new int[] { 0, 0, 1, 0, 0, 1, 0 }));
		System.out.println(solution(new int[] { 0, 0, 0, 0, 0, 0, 0 }));
		System.out.println(solution(new int[] { 0, 1, 0, 0, 0, 0 }));
		System.out.println(solution(new int[] { 0, 1, 1, 0, 1, 0 }));
	}

}
