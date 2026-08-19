import java.util.Scanner;

public class pgm2Darray {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int x,y;
   System.out.println("Enter number of rows: ");
   x=sc.nextInt();
   System.out.println("Enter number of colmuns: ");
   y=sc.nextInt();
   System.out.println("Enter elements: ");
   int a[][]=new int[x][y]; 

   for(x=0;x<a.length;x++){
    for(y=0;y<a[x].length;y++){
       a[x][y]=sc.nextInt();
    }
   }
System.out.println("Array elements are: ");
   
   for(x=0;x<a.length;x++){
    for(y=0;y<a[x].length;y++){
       System.out.print(a[x][y]+" ");
    }
    System.out.println();
   }
}
}
