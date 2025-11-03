//leetcode 509
//link: https://leetcode.com/problems/fibonacci-number/
//time complexity: O(2^n)
//space complexity: O(n)
// Fibonacci Number
class Fibonacci {
    public int fib(int n) {
        if(n==0||n==1){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }
}