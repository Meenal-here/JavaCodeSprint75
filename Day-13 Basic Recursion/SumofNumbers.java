import java.util.Scanner;
public class SumofNumbers {
    public static long sumofNumbers(int n){
        if(n==0){
            return 0;

        }
        return n +sumofNumbers(n-1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);ṇ
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

            long result = sumofNumbers(number);
            System.out.println("Sum of numbers from 1 to " + number + " is: " + result);

        scanner.close();
    }
}