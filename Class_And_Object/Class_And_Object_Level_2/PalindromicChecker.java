package Class_And_Object_Level_2;
//Problem Statement: 	Create a PalindromicChecker class with an attribute text. Add methods to:
//Check if the text is a palindrome.
//Display the result.
//Explanation: The PalindromicChecker class holds the text attribute. The methods operate on this attribute to verify its 
//palindrome status and display the result.

public class PalindromicChecker {
	String text;
	PalindromicChecker(String text){
		this.text = text;
		
	}
	boolean isPalinDromic() {
		String str = text.replaceAll("\\s+","");
		int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
	}
	void displayResult() {
        if (isPalinDromic()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println( text + " is not a palindrome.");
        }
    }
	public static void main(String[] args) {
        PalindromicChecker p1 = new PalindromicChecker("madam");
        PalindromicChecker p2 = new PalindromicChecker("hello");
        PalindromicChecker p3 = new PalindromicChecker("Never odd or even");

        p1.displayResult();
        p2.displayResult();
        p3.displayResult();
    }
}
