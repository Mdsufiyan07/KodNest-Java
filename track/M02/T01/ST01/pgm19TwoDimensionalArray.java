import java.util.Scanner;

public class pgm19TwoDimensionalArray {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int i,j,x,y;
   System.out.println("Enter number of rows: ");
   x=sc.nextInt();
   System.out.println("Enter number of colmuns: ");
   y=sc.nextInt();
   System.out.println("Enter elements: ");
   int a[][]=new int[x][y]; 

   for(i=0;i<x;i++){
    for(j=0;j<y;j++){
       a[i][j]=sc.nextInt();
    }
    System.out.println(); 
   }
System.out.println("Array elements are: ");
   
   for(i=0;i<x;i++){
    for(j=0;j<y;j++){
       System.out.print(a[i][j]+" ");
    }
    System.out.println();
   }
}
}
