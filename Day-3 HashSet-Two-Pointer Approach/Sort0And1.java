
import java.util.Scanner;
public class Sort0And1 {


    public static int[] sort0And1(int[] array){
        //using traversals and counting number of 0s
        // int count=0;
        // for(int i=0;i<array.length;i++){
        //     if(array[i]==0){
        //         count++;
        //     }
        // }
        // for(int i=0;i<count;i++){
        //     array[i]=0;
        // }
        // for(int i=count;i<array.length;i++){
        //     array[i]=1;
        // }

        //using 0s and 1s
        int left =0;    //left pointer
        int right = array.length - 1;   //right pointer

        while(left<right){  //use until one pointer is smaller 
            if(array[left]==1 && array[right]==0){  //if 0 is at later pointer and 1 comes earlier swap them
                array[left]=0;
                array[right]=1;
                left++; //increment left pointer
                right--;    //decrement right pointer
            }

            if(array[left]==0){ //if left has 0 then no need to change.. therefore, increment left
                left++;
            }

            if(array[right]==1){    ////if left has 1 then no need to change.. therefore, decrement right
                right--;
            }

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
