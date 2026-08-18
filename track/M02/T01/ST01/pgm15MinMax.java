import java.util.Scanner;
public class pgm15MinMax {
    public static void main(String[] args) {
        
    
 Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array : ");
    int size=sc.nextInt();
    int a[]= new int[size];
    System.out.println("enter elements:  ");
    for(int i = 0 ; i<a.length; i++){
        a[i] = sc.nextInt();
    }

    int max=a[0];
    for(int i =0;i<a.length;i++){
        if(a[i]>max){
            max=a[i];
        }
    }
    System.out.println("Max value is: "+max);

    int min=a[0];
    for(int i =0;i<a.length;i++){
        if(a[i]<min){
            min=a[i];
        }
    }
    System.out.println("Min value is: "+min);
}
}
