package palindrome.check;

public class StringPalindrome {

	public static void main(String[] args) {

		String str = "MADAM";

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);
		}

		System.out.println("Original String is :" + str);
		System.out.println("Reverse String is :" + reverse);

		if (str.equals(reverse)) {
			System.out.println(str + " And " + reverse + " Are Palindrome ");
		} else {
			System.out.println(str + " And " + reverse + " Are Not Palindrome ");
		}

	}
}
