package HackerRank.warmup.challenges;
import java.util.HashMap;
//John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
//
//For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
//
//Function Description
//
//Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.
//
//sockMerchant has the following parameter(s):
//
//n: the number of socks in the pile
//ar: the colors of each sock
public class SockMerchant {

	static int solution(int n, int[] ar) {
		int count = 0;
		HashMap<Integer, Integer> data = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			if (data.containsKey(ar[i])) {
				int val = data.get(ar[i]);
				data.put(ar[i], val + 1);
			} else {
				data.put(ar[i], 1);
			}
		}
		for (Integer a : data.keySet()) {
			System.out.println(data.get(a));
			if (data.get(a) >= 2) {
				count = count + (data.get(a) / 2);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(solution(9, new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20 }));
	}

}
