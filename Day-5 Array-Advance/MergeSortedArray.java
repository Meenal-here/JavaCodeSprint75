//leetcode 88
//https://leetcode.com/problems/merge-sorted-array/
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
//time complexity O(m+n)
//space complexity O(1)
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0 && n>0){    //if nums1 is empty then copy all elements of nums2 to nums1
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
        }
        int i=m-1,j=n-1;    //use two pointers starting from the end of both arrays
        int k = m+n-1;      //pointer for placing elements in nums1 from the end
        while(i>=0 && j>=0){    //while both pointers are valid
            if(nums1[i]>=nums2[j]){ //compare elements from the end
                nums1[k]=nums1[i];  //place the larger element at the end of nums1
                 k--;   //move the pointer for index
                i--;    //move the pointer for nums1
            }else{
               nums1[k]=nums2[j];   //place the larger element at the end of nums1
               k--;    //move the pointer for index 
               j--;   //move the pointer for nums2
            }
        }
        while(j>=0){    //if any elements are left in nums2
            nums1[k]=nums2[j];  //copy them to nums1
            k--;
            j--;
        }
        while(i>=0){
            nums1[k]=nums1[i];  //copy remaining elements of nums1 if any
            k--;
            i--;
        }
        
    }
}