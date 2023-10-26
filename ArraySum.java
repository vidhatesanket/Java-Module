
import java.util.*;
public class ArraySum {

    //Adding the consecutive array elements acc. to their indexes
    public static int[] arraySum(int arr1[],int arr2[]){

        int maxLengthArray=Math.max(arr1.length,arr2.length);
        int result[] = new int[maxLengthArray];

        for(int i=0; i < maxLengthArray; i++ ){

                 result[i]=arr1[i]+arr2[i];
                 

        }

        return result;
    }
    //Displying the array elements
    public static void displayData(int result[]){
        
        for(int val: result){
            System.out.print(val + " ");
        }
    }
    public static int[] inputArray(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int inputArr[]=new int[size];

        for(int i=0; i < size; i++){
            System.out.println("Enter the "+(i+1)+" element: ");
            inputArr[i]=sc.nextInt();
        }
        return inputArr;
    }


    public static void main(String[] args){
        // System.out.println("Hello World");

        
        int arr[]=inputArray();
        int arr2[]=inputArray();
       
        System.out.println("Displaying first array");
         displayData(arr);
         System.out.println();
        System.out.println("Displaying first array");
        displayData(arr2);
        
        
        int result[]=arraySum(arr,arr2);
        System.out.println();
        System.out.println("Displaying result array");
        displayData(result);

        
    }
    
}
