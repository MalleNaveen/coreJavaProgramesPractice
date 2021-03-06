package com.practice;

class SeqCharCount {

	static void printRLE(String s) {
		for (int i = 0; i < s.length() - 1; i++) {

			// Counting occurrences of s[i]
			int count = 1;
			while (s.charAt(i) == s.charAt(i + 1)) {
				i++;
				count++;
				if (i + 1 == s.length())
					break;
			}
			System.out.print(s.charAt(i) + "" + count + " ");
		}

		System.out.println();
	}

	// Driver code
	public static void main(String args[]) {
		printRLE("GeeeEEKKKss");
		printRLE("ccccOddEEE");
	}
}