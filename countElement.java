import java.util.Scanner;

public class countElement 

{
    //Displaying the array
    public static void displayData(int result[][]){
       
        for(int i=0; i < result.length; i++){
            for(int j=0; j < result[i].length; j++){
                    System.out.print(result[i][j]+ "\t");
                    
                    
            }
            System.out.println();
        } 
       
    }

    //Taking the input array
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


    //Counting the occrerence of the element
    public static int count_element(int element,int[][] arr){
        int count=0;
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr[i].length; j++){
                    if(arr[i][j]==element){
                        count++;
                    }
            }
            
        }
        return count;
    }





    public static void main(String arg[]){

       
        int arr[][]=inputArray();
       displayData(arr);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to search in an array: ");
        
        int element=sc.nextInt();
       System.out.println("Count of entered element in the given array: "+count_element(element, arr));

    }
    
}
