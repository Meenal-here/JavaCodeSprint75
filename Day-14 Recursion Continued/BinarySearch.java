//leetcode problem 704
//link:https://leetcode.com/problems/binary-search/
// Binary Search using Recursion
// Time Complexity: O(log n)
// Space Complexity: O(log n) due to recursion stack
public class BinarySearch {
    //helper function for recursion
    public static int binarySearch(int[] nums, int target,int start, int end){//
        if(start<=end){//base condition
            int mid=start+(end-start)/2;//mid calculation to avoid overflow
            if(nums[mid]==target){//target found
                return mid;
            }else
            if(nums[mid]<=target){//search in right half
                return binarySearch(nums,target,mid+1,end);
            }else
            if(nums[mid]>=target){//search in left half
                return binarySearch(nums,target,start,mid-1);
            }

        }
        return -1;

    }
    public int search(int[] nums, int target) {
       int start=0,end=nums.length-1;//initializing start and end indices
       return binarySearch(nums,target,start,end);        //calling helper function
    }
}