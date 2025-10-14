//Day-1 #JavaCodeSprint75 Challenge
//leetcode problem 217
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//link- https://leetcode.com/problems/contains-duplicate/description/       
//Time Complexity: O(n) as we are using a single loop and hashset
class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        int len=nums.length;
        HashSet<Integer> set = new HashSet<>();//using hashset as it can only contain unique values

        for(int i=0;i<len;i++){
            if(set.contains(nums[i])){  //if hashset has the element return true
                return true;
            }
            else{
            set.add(nums[i]); //if not then add the element into hashset 
                              //not doing earlier to save memory as duplcates could come in earlier indices
            }
        }
        return false;   //false if no duplicates found
    }
}