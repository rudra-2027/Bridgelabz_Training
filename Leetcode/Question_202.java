package Leetcode;

import java.util.*;

// 202 Happy Number
public class Question_202 {
	 public boolean isHappy(int n) {
	        Set<Integer> hs = new HashSet<>();
	         while(n!=0 && !hs.contains(n)){
	            hs.add(n);
	            int sum = 0;
	            while(n>0){
	                int rem = n%10;
	                sum += rem*rem;
	                n=n/10;
	            }
	            n = sum;
	            
	        }
	        return n==1;
	    }
}
