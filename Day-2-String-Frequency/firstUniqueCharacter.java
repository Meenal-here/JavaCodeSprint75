import java.util.HashMap;
//leetcode problem 387
//https://leetcode.com/problems/first-unique-character-in-a-string/
//time complexity O(n) space complexity O(1)
//using HashMap to store frequency of characters   
//two pass algorithm, first to store frequency and second to find the first unique character

class firstUniqueCharacter {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> countMap = new HashMap<>();

        
        for (char c : s.toCharArray()) {    // Count frequency of each character
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);   //getOrDefault returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
        }

       
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) { // Find the first unique character
                return i;
            }
        }

        return -1; // if no unique character found
    }
}