//leetcode 28
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
class FirstOccurrenceInString {
    public int strStr(String haystack, String needle) {
        int needleLen=needle.length();
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            System.out.println(haystack.substring(i,i+needleLen));
            if(haystack.substring(i,i+needleLen).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}