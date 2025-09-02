	package Assignment_4;
	
	import java.util.Scanner;
	
	//Remove Duplicates from a String
	//Problem:
	//Write a Java program to remove all duplicate characters from a given string and return
	//the modified string.
	public class Question_4 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			int[] freq = new int[256];
			for(int i = 0;i<str.length();i++) {
				freq[str.charAt(i)]++;
			}
			String res = "";
			for(int i = 0;i<str.length();i++) {
				if(freq[str.charAt(i)]!=0) {
					res+=str.charAt(i);
					freq[str.charAt(i)]=0;
				}
			}
			System.out.println(res);
		}
	
	}
