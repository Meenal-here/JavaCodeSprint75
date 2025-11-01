//leetcode 35
//https://leetcode.com/problems/search-insert-position/
//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//time complexity O(n)
//space complexity O(1)
class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }else
            if(nums[i]<target){
                pos++;
            }else{
                break;
            }
        }
        return pos;
    }
}