//leetcode problem 3
//https://leetcode.com/problems/longest-substring-without-repeating-characters/
//finding the length of longest substring without repeating characters
//sliding window approach
//Time Complexity: O(n)
//Space Complexity: O(min(m,n)) where m is the size of character set and n is the length of the string
import java.util.HashSet;
class LengthOfLongestSubstring{
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> dups=new HashSet<>();    //use of hash set to store unique values
        int start=0;    //starting index 
        int end=0;      //ending index
        int len=0;      //variable to store max length

        while(end<s.length()){  //iterate the String
            while(dups.contains(s.charAt(end))){    //if character is already in the hashset then it has to be removed and increase start
                dups.remove(s.charAt(start));
                start++;
            }
                dups.add(s.charAt(end));    //add the unique characters
                len=Math.max(len,end-start+1);   //longest length          
                end++;
        }
        return len;
    }
}