
public class printNum {
    public static void printNumber(int num) {
        if (num <= 0) return;
        System.out.println(num);
        printNumber(num - 1);
    }

    public static void main(String[] args) {
       
        printNumber(9);
      
    }
}
