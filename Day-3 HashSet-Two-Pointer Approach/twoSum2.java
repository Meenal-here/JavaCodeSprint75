//leetcode problem 167: Two Sum II - Input Array Is Sorted
//link- https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
//time complexity: O(n) and space complexity: O(1)
class twoSum2{
    public int[] twoSum(int[] nums, int target) {
     int left = 0;  //make a left pointer
     int right = nums.length-1; //make right pointers

     while(left<right){ //until one pointer is smaller then other
        if(nums[left]+nums[right]==target){ //if sum of left of right are equal to the target 
            return new int[]{left+1,right+1};   //return array of the indices
        }
        else if(nums[left]+nums[right]>target){ //if sum is more then right is bigger.. therefore decrement right
            right--;
        }
        else{
            left++;  //if sum is less then left is smaller.. therefore increment left
        }
     }
     return new int[]{};
    }
}