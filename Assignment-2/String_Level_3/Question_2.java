import java.util.Scanner;

public class Question_2 {
  public static int findLn(String text) {
    int cnt = 0;
    try {
      while (true) {
        text.charAt(cnt);
        cnt++;
      }
    } catch (Exception e) {
      return cnt;
    }
  }

  public static char[] findChar(String str) {
    int n = findLn(str);
    char[] temp = new char[n];
    int idx = 0;

    for (int i = 0; i < n; i++) {
      char c = str.charAt(i);
      boolean isUnique = true;

      for (int j = 0; j < idx; j++) {
        if (temp[j] == c) {
          isUnique = false;
          break;
        }
      }

      if (isUnique) {
        temp[idx++] = c;
      }
    }

    char[] ans = new char[idx];
    for (int i = 0; i < idx; i++) {
      ans[i] = temp[i];
    }

    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = sc.nextLine();

    char[] uniqueChars = findChar(input);

    System.out.print("Unique characters are: ");
    for (char c : uniqueChars) {
      System.out.print(c + " ");
    }
  }

}
