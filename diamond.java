import java.util.*;

public class diamond {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int rows=sc.nextInt();

        for(int i=1; i <=rows/2+1; i++){
                
                for(int j=1; j <= rows-i; j++){
                    System.out.print(" ");
                }
                 for(int k=1; k <= 2*i-1; k++){
                    System.out.print("*");
                }
                System.out.println();
        }

        for(int i=rows/2; i >=1; i--){
                
                for(int j=1; j <= rows-i; j++){
                    System.out.print(" ");
                }
                 for(int k=1; k <= 2*i-1; k++){
                    System.out.print("*");
                }
                System.out.println();
        }

    }
}
