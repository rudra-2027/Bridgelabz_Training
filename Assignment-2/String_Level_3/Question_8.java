import java.util.Scanner;

public class Question_8 {
  public static boolean areAnagrams(String str1, String str2) {

    str1 = str1.replace(" ", "").toLowerCase();
    str2 = str2.replace(" ", "").toLowerCase();

    if (str1.length() != str2.length()) {
      return false;
    }

    int[] freq = new int[256];

    for (int i = 0; i < str1.length(); i++) {
      freq[str1.charAt(i)]++;
    }

    for (int i = 0; i < str2.length(); i++) {
      freq[str2.charAt(i)]--;
    }

    for (int i = 0; i < 256; i++) {
      if (freq[i] != 0) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first text: ");
    String s1 = sc.nextLine();

    System.out.print("Enter second text: ");
    String s2 = sc.nextLine();

    boolean result = areAnagrams(s1, s2);

    if (result) {
      System.out.println("The texts are anagrams.");
    } else {
      System.out.println("The texts are NOT anagrams.");
    }
  }
}
