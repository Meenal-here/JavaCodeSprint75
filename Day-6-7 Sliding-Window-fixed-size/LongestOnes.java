//leetcode 1004
//link: https://leetcode.com/problems/max-consecutive-ones-iii/
//time complexity: O(n^2)
//space complexity: O(1)
//bruteforce approach
//Considering all the subArrays and checking for the condition of zeroes less than equal to k
class LongestOnes {
    public int longestOnes(int[] nums, int k) {
        //bruteforce approach 
        //create all the subArrays and put that into condition

        int maxLen=0;   //to store the maximum length of subArray
        for(int i=0;i<nums.length;i++){ //starting index of subArray
            int zeroes=0;   //to count the number of zeroes in the subArray
            for(int j=i;j<nums.length;j++){ //ending index of subArray
                if(nums[j]==0){ //if we encounter zero increment the count
                    zeroes++;   //counting zeroes   
                }
                if(zeroes<=k){  //if zeroes are less than equal to k update the maxLen
                    maxLen=Math.max(maxLen,j-i+1);  //update the maximum length
                }
                else{
                    break;  //if zeroes exceed k break the loop
                }
            }
        }
        return maxLen;  //return the maximum length of subArray
    }
}