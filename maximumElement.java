import java.util.*;
public class maximumElement {
    
     //Displying the array elements
    public static int displayData(int result[][]){
       int max=Integer.MIN_VALUE;
        for(int i=0; i < result.length; i++){
            for(int j=0; j < result[i].length; j++){
                    System.out.print(result[i][j]+ "\t");
                    max=Math.max(max,result[i][j]);
            }
            System.out.println();
            
        } 
        return max;
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


    public static void main(String[] args){ 
    
        int inputArr[][]=inputArray();
        int max=displayData(inputArr);
        System.out.println("Maximum element: "+max);

    }
}


