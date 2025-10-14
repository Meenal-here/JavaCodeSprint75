//leetcode problem 1
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//link- https://leetcode.com/problems/two-sum/description/
//Day-1 #JavaCodeSprint75 Challenge
//Time Complexity: O(n^2) as there are two nested loops(Brute force approach)
class TwoSum {
    public int[] twoSum(int[] nums, int target){
        int n = nums.length;    //getting size of nums
         for (int i = 0; i < n - 1; i++) {  //first loop starting with 0 upto the length -1
            for (int j = i + 1; j < n; j++) {   //start j with i+1 to check further and reduce redundant checking
                if (nums[i] + nums[j] == target) { //when the conditions fills up return the array
                    return new int[]{i, j};
                }
            }
         }
        return new int[]{};
    }
}