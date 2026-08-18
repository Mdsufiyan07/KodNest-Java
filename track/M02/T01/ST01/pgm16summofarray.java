import java.util.Scanner;

public class pgm16summofarray {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("Enter array elements : ");
    for(int i =0 ;i<a.length;i++){
        a[i]= sc.nextInt();
    }
int sum =0;
for(int i =0 ;i<a.length;i++){
        sum+=a[i];
    }
    System.out.println("sum of array elements is : "+sum);
}
}
