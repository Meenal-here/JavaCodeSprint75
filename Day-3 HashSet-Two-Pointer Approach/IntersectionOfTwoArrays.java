//leetcode problem 349
//link: https://leetcode.com/problems/intersection-of-two-arrays/
//Given two integer arrays nums1 and nums2, return an array of their intersection. Each
//Time complexity O(m+n) where m and n are the lengths of nums1 and nums2
//Space complexity O(min(m,n)) for the hashsets used
import java.util.HashSet;
class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();    //create hashset of nums1 to check if it has any intersection element from nums2
        HashSet<Integer> set2 = new HashSet<>();    //for unique elements in the result
        for(int i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]); //adding all elements to set1 from nums1
        }
        for(int i=0;i<nums2.length;i++) //iterating through nums2 to check for interection
        {
            if(set1.contains(nums2[i])) //check if the element present in nums2 is in set1
            {
                set2.add(nums2[i]); //add the common element to resulting set
            }
        }
        
        int[] intArray = new int[set2.size()];  //make an integer array of size of set2 
        int i = 0; //use a count to put values in the int array
        for(int num : set2){    //iterate through the set2
            intArray[i++]=num;  //put each element from set2 into integer array
        }
            return intArray;
    }
}