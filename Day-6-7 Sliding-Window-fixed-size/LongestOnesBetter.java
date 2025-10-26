//leetcode- 1004
//link: https://leetcode.com/problems/max-consecutive-ones-iii/
//time complexity: O(n)
//space complexity: O(1)
//better approach

class LongestOnesBetter {
    public int longestOnes(int[] nums, int k){
       int left=0;  //left pointer
       int right=0;  //right pointer
       int maxlen=0; //maximum length of subarray
       int zeros=0;  //count of zeros in the current window

        while(right<nums.length){   //traverse through the array
            if(nums[right]==0){ //if we encounter zero increment the count
                zeros++;    //counting zeroes
            }
            while(zeros>k){ //if zeros exceed k, shrink the window from the left
                if(nums[left]==0){  //if we encounter zero decrement the count
                    zeros--;    //counting zeroes
                }
                left++; //move the left pointer to the right
            }
            if(zeros<=k){   //if zeros are less than equal to k update the maxlen
                maxlen=Math.max(maxlen,right-left+1);   //update the maximum length
            }
            right++;    //move the right pointer to the right
        }
        return maxlen;  //return the maximum length of subArray
    }
}