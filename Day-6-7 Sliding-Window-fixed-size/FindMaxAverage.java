//leetcode-643: Maximum Average Subarray I
//https://leetcode.com/problems/maximum-average-subarray-i/
//Sliding Window Approach (fixed size)
//Time Complexity: O(n)
//Space Complexity: O(1)
class findMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        int start=0;    //sliding window start pointer
        int sum=0;
        double average=Double.NEGATIVE_INFINITY;    //given initial minimum value

        for(int end=0;end<nums.length;end++){   //sliding window end pointer
            sum+=nums[end]; //add current element to sum

            if(end-start+1==k){ //when window size reaches k
                average=Math.max(average,sum/(double)k);    //update maximum average
                sum-=nums[start];   //remove the element going out of the window
                start++;    //move the start pointer forward
            }
        }
        return average;
    }
}