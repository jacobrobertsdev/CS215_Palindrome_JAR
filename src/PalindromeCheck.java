import java.util.Stack;

/**
 * The PalindromeCheck class takes in a String and determines whether or not it
 * is a palindrome. Ignores case, special characters, spaces, and digits.
 * 
 */
public class PalindromeCheck {

	private Stack<Character> charStack;

	/**
	 * Default constructor. Creates an empty Stack of Characters
	 * 
	 */
	public PalindromeCheck() {
		charStack = new Stack<>();
	}

	/**
	 * Tests if the input string is a palindrome.
	 * 
	 * @param input String to test for palindrome
	 * @return true if the input String is a palindrome, false otherwise.
	 */
	public boolean isPalindrome(String input) {

		charStack.clear();

		char[] charArray = input.toCharArray();

		for (char c : charArray) {
			if (Character.isLetter(c)) {
				charStack.push(Character.toLowerCase(c));
			}

		}

		for (char c : charArray) {
			if (Character.isLetter(c) && charStack.pop() != Character.toLowerCase(c)) {
				System.out.println(input + " is not a palindrome!\n");
				return false;
			}
		}

		System.out.println(input + " is a palindrome!\n");
		return true;
	}

}
