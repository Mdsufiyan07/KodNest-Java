import java.util.Scanner;

public class pgmJagged {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
   int x,y;
   System.out.println("Enter elements: ");
   int a[][]=new int[4][]; 
   a[0]=new int[3];
a[1]=new int[4];
a[2]=new int[5];
a[3]=new int[6];
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
