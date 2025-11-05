//leetcode 50: Pow(x, n)
//link: https://leetcode.com/problems/powx-n/
// Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).
//time complexity: O(log n)
//space complexity: O(log n) due to recursion stack
class Power {
    public double myPow(double x, int n) {
        // handle negative exponents
        if (n < 0) {
            x = 1 / x;  // take reciprocal
            n = -n; // make n positive
        }

        return fastPower(x, n); // call helper function
    }

    private double fastPower(double x, int n) {
        if (n == 0) return 1;   // base case: x^0 = 1

        double half = fastPower(x, n / 2);  // divide the problem into half, such as x^n = (x^(n/2))^2
        if (n % 2 == 0) {   // if n is even
            return half * half; // combine results
        } else {
            return half * half * x; // if n is odd, multiply by x one more time
        }
    }
}

// Example usage:
//2^3
//Input: x = 2.00000, n = 3
//Output: 8.00000
//half=2^1=2
//half=2^0=1
//2^3=2^1*2^1*2=8