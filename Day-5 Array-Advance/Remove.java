//leetcode 27
//https://leetcode.com/problems/remove-element/
//time complexity- O(n)
class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;  //pointer 1 for putting value into the array
        for (int i = 0; i < nums.length; i++) { //iterate through array
            if (nums[i] != val) {   //if value don't match
                nums[index] = nums[i];  //at that index set that value
                index++;
            }
        }
        return index;
    }
}

