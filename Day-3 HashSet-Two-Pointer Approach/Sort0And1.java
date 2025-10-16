    import java.util.Scanner;
public class Sort0And1 {


    public static int[] sort0And1(int[] array){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            array[i]=0;
        }
        for(int i=count;i<array.length;i++){
            array[i]=1;
        }
        return array;
    }
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n = input.nextInt();
        System.out.println("Enter the elements of array (0s and 1s only)");
        int[] array0And1 = new int[n];
        for(int i=0;i<n;i++){
            array0And1[i] = input.nextInt();
        }

        array0And1=sort0And1(array0And1);

        System.out.println("Sorted Array:");
        for(int i =0;i<n;i++){
            System.out.print(array0And1[i]+" ");
        }
        input.close();
    }
}
