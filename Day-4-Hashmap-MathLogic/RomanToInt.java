//leetcode-13: Roman to Integer
//time complexity: O(n)
//link: https://leetcode.com/problems/roman-to-integer/
//space complexity: O(1)
import java.util.HashMap;
class RomanToInt{
    public int romanToInt(String s) {
        HashMap<Character,Integer> numbers = new HashMap<>();
        //make a hashmap containing all the values symbol of roman numbers
        numbers.put('I',1);     
        numbers.put('V',5);
        numbers.put('X',10);
        numbers.put('L',50);
        numbers.put('C',100);
        numbers.put('D',500);
        numbers.put('M',1000);

        //if ith position is < i+1th position===> i.e- iv 
        //subtract ith position from result==> i.e xiv 1..10 2..-1 3...5 result = 14
        //in loop ith<i+1th sub ith
        //not less then add ith
        int result=0;
        for(int i=0;i<s.length()-1;i++){
         if(numbers.get(s.charAt(i))<numbers.get(s.charAt(i+1))){
            result-=numbers.get(s.charAt(i));
        }
        else{
           result+= numbers.get(s.charAt(i));
        }
        }
    return result+numbers.get(s.charAt(s.length()-1));
    }
}