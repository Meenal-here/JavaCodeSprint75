//leetcode 14
//https://leetcode.com/problems/longest-common-prefix/  
//Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".
//time complexity O(nlogn)
//space complexity O(1)
import java.util.Arrays;
class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;

        String ans="";
        Arrays.sort(strs);  //sort the array such that all the words are in lexicographical order
                            //after sorting the first and last words will have the minimum common prefix
        String first=strs[0];
        String last=strs[len-1];
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==last.charAt(i)){    //compare the first and last words
                ans+=first.charAt(i);               //add the common characters to the answer
            }else{
                break;  //break the loop when a mismatch is found
            }
        }
        return ans;
    }
}