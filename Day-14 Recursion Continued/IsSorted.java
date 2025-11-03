// Check if an array is sorted in ascending order using recursion
// Time Complexity: O(n)
// Space Complexity: O(n)
public class IsSorted{
    public static boolean isSorted(int[] arr,int n){
        if(n==0||n==1){
            return true;    //base case
        }
        return arr[n-1]>=arr[n-2] && isSorted(arr,n-1); //recursive case, check last two elements and recurse
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr,arr.length)); // Output: true

        int[] arr2 = {5, 3, 4, 1, 2};
        System.out.println(isSorted(arr2,arr2.length)); // Output: false
    }
}