//leetcode-169: Majority Element
//time complexity: O(n)
//link: https://leetcode.com/problems/majority-element/
//space complexity: O(n)
import java.util.HashMap;
class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++) //loop for putting all the elements into hashmap
        {
            if(map.containsKey(nums[i])){   //if element is already present in the map increase the occurences
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1); //if not it's appearing for the first time there fore occurence is one
            }
        }

        for(int key : map.keySet())
        {
            if(map.get(key)>nums.length/2)  //return element which has more then half appearences 
            {
                return key;
            }
        }

        return 0;
    }
}