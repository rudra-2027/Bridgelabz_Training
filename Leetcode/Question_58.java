package Leetcode;
//58 Length of last word
public class Question_58 {
	public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return (arr[arr.length-1]).length();
        
    }
}
