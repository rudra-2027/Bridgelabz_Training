package Leetcode;

public class Question_38 {
  class Solution {
    public String countAndSay(int n) {
      if (n < 2) {
        return n + "";
      }
      String s = "1";
      for (int i = 2; i <= n; i++) {
        s = help(s);
      }
      return s;
    }

    String help(String s) {
      StringBuilder sb = new StringBuilder();
      char c = s.charAt(0);
      int cnt = 1;
      for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i) == c) {
          cnt++;
        } else {
          sb.append(cnt).append(c);
          c = s.charAt(i);
          cnt = 1;
        }
      }
      sb.append(cnt).append(c);
      return sb.toString();
    }
  }
}
