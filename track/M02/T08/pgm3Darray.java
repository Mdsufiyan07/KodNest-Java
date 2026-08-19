import java.util.Scanner;

public class pgm3Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,k;
System.out.println("Enter Block size: ");
System.out.println("Enter Row size: ");
System.out.println("Enter Column size: ");

        i= sc.nextInt();
        j= sc.nextInt();
        k= sc.nextInt();
        int a[][][]= new int[i][j][k];


System.out.println("Enter array elements: ");
        for( i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
             for(k=0;k<a[i][j].length;k++){
                a[i][j][k]=sc.nextInt();
             }
            }
        }

        System.out.println("3D array elements are:  ");
        for( i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
             for(k=0;k<a[i][j].length;k++){
                System.out.print(a[i][j][k]+" ");
             }
             System.out.println();
            }
            System.out.println();
        }
    }
}
