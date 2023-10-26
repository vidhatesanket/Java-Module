import java.util.Scanner;

public class Transpose {

    //Displying the array elements
    public static void displayData(int result[][]){
       
        for(int i=0; i < result.length; i++){
            for(int j=0; j < result[i].length; j++){
                    System.out.print(result[i][j]+ "\t");
                    
            }
            System.out.println();
            
        } 
       
    }
     //Take input of the array elements
    public static int[][] inputArray(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  of the rows: ");
        int rows= sc.nextInt();
        System.out.println("Enter the number  of the cols: ");
        int cols=sc.nextInt();

        int inputArr[][]=new int[rows][cols];

        for(int i=0; i < rows; i++){
            for(int j=0; j < cols; j++){
                    System.out.println("Enter the  element:  rows: "+(i+1)+"cols: "+(j+1)+" ");
                    inputArr[i][j]=sc.nextInt();
            }
            
        }
        return inputArr;
    }

    //Transpose of the array
    public static int[][] transpose(int arr[][]){
        int rows1=3;
        int cols1=4;
        int result[][]=new int[cols1][rows1];  

        for(int i=0; i < cols1; i++){
            for(int j=0; j < rows1; j++){
                    result[i][j]=arr[j][i];
            }
        }
         
        return result;
    }


    public static void main(String[] arg){
        int arr[][]=inputArray();
        System.out.println("Input array printing: ");
        displayData(arr);

        int result[][]=transpose(arr);
        System.out.println("Transpose array printing: ");
        displayData(result);
    }
}
