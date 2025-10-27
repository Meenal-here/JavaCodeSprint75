//leetcode 1456
// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
// Sliding Window Approach
// finding maximum number of vowels in a substring of given length k
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.HashSet;
class MaxVolwels {
    public int maxVowels(String s, int k) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int count=0;
        int max=0;
        int start=0;
        for(int end=0;end<s.length();end++){
            if(vowels.contains(s.charAt(end))){
                count++;
            }
            if(end-start+1==k){
                max=Math.max(max,count);
                if(vowels.contains(s.charAt(start))){
                    count--;
                }
                start++;
            }
        }
        return max;
    }
}