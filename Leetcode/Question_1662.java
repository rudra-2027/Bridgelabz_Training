package Leetcode;

//1662 Check If Two String Arrays are Equivalent
public class Question_1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res = String.join("", word1);
        String res2 = String.join("", word2);
        return res.equals(res2);

    }
}
