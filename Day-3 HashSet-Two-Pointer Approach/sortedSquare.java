//leetcode problem 977: Squares of a Sorted Array
//link: https://leetcode.com/problems/squares-of-a-sorted-array/
//time complexity: O(n) and space complexity: O(n)
//sort squares of a non-decreasing array and return the resulting array in non-decreasing order
class sortedSquare{
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length]; //making new resulting array
        int i = 0, j = nums.length - 1; //making two pointers i from the starting index j from the ending index
        for(int p = nums.length - 1; p >= 0;p--){   //array parsing starts from the end
          
            if(nums[i]*nums[i] < nums[j]*nums[j]){ //the greater square is chosen to fill from the end
                result[p] = nums[j]*nums[j]; 
                j --; //change the position which is set
            }else{
                result[p] = nums[i]*nums[i]; //if starting sqaure is greater
                i ++;   //change the position which is set
            }
        }
        return result;
    }
}