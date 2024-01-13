package myCoreJavaProject;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String reversal
		String str = "I am feeling lucky";
		String reversedString = "";
		for (int i = str.length(); i > 0; i--) {
			reversedString = reversedString + str.charAt(i - 1);
		}
		System.out.println("##################String reversal##################");
		System.out.println(reversedString);

		// find the sum of all the digits in num1
		int sumofDigits = 0;
		int reverseDigit = 0;
		for (int num1 = 10282023; num1 > 0; num1 /= 10) {
			int remainder = num1 % 10;
			reverseDigit = reverseDigit * 10 + remainder;
			sumofDigits += remainder;
			// System.out.println(remainder);
		}

		// find the reverse of num1
		System.out.println("##################Reverse digits###################");
		System.out.println(reverseDigit);

		// find the sum of all the digits in num1
		System.out.println("###############sum of all the digits###############");
		System.out.println(sumofDigits);

	}

}
