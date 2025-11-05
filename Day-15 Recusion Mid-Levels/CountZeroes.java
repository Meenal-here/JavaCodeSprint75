// Count the number of zeroes in an array using recursion
//time complexity: O(n)
//space complexity: O(n) due to recursion stack
public class CountZeroes{
    static int count=0; // to keep track of zeroes
    public static int countZeroes(int[] arr,int i,int n){
        if(i==n){   // base case: if we've gone through the entire array
            return count;
        }
        if(arr[i]==0){  // if current element is zero
            count++;
        }
        return countZeroes(arr,i+1,n);  // recursive call for next element
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 0, 1, 1, 11, 0, 0};    // example array
        System.out.println(countZeroes(arr,0,arr.length));
    }
}