//leetcode 58   
//https://leetcode.com/problems/length-of-last-word/
//Given a string s consisting of words and spaces, return the length of the last word in the string.
//A word is a maximal substring consisting of non-space characters only.
//time complexity O(n)
//space complexity O(1)
class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] stringArray = s.split(" ");
        int len = stringArray.length;
        return stringArray[len-1].length();
    }
}