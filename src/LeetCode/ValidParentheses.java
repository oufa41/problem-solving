package LeetCode;
import java.util.HashMap;
import java.util.Stack;

//
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Note that an empty string is also considered valid.
//
//Example 1:
//
//Input: "()"
//Output: true
//Example 2:
//
//Input: "()[]{}"
//Output: true
//Example 3:
//
//Input: "(]"
//Output: false
//Example 4:
//
//Input: "([)]"
//Output: false
//Example 5:
//
//Input: "{[]}"
//Output: true
public class ValidParentheses {

	public static boolean isValid(String s) {
		HashMap<Character, Character> mappings = new HashMap<Character, Character>();
		mappings.put(')', '(');
		mappings.put('}', '{');
		mappings.put(']', '[');
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			if (mappings.containsKey(s.charAt(i))) {
				char topElement = stack.empty()? '#': stack.pop();	
				if(topElement != mappings.get(s.charAt(i))) {
					return false;
				}
                  
			}else {
				stack.push(s.charAt(i));	
			}
		}

		return stack.empty()? true: false;
	}

	public static void main(String[] args) {
	
		System.out.println(isValid("(()))"));
	}

}
