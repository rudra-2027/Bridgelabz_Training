package Leetcode;

import java.util.*;

//Fizz
//Buzz
public class Question_412 {
	class Solution {
		public List<String> fizzBuzz(int n) {
			List<String> al = new ArrayList<>();
			for (int i = 1; i <= n; i++) {
				al.add(check(i));
			}

			return al;
		}

		public String check(int i) {
			if (i % 3 == 0 && i % 5 == 0) {
				return "FizzBuzz";
			} else if (i % 3 == 0) {
				return "Fizz";
			} else if (i % 5 == 0) {
				return "Buzz";
			}
			return String.valueOf(i);
		}
	}
}
