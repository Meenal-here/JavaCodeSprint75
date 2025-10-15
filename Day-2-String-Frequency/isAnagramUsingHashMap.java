//leetcode problem 242 isAnagram
//https://leetcode.com/problems/valid-anagram/  
//time complexity O(n) space complexity O(1)
//using HashMap to store frequency of characters
import java.util.HashMap;
public class isAnagramUsingHashMap {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false; // If lengths differ, they can't be anagrams

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1); // Count frequency of each char in s
                                                                //getOrDefault returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1); // Decrease frequency for each char in t
            if (map.get(c) < 0) return false; // More of this char in t than in s
        }

        return true; // If all balances out, they’re anagrams
    }
} 
