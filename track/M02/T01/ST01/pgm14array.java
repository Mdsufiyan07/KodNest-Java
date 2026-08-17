import java.util.Scanner;

public class pgm14array {
    public static void main(String[] args) {
int []arr=new int [5];
arr[0]=10;
arr[1]=20;
arr[2]=30;
arr[3]=40;
arr[4]=50;
        System.out.println("the array elements are");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

int ax[] = {10,20,30,40};
System.out.println(ax[0]+" "+ax[1]+" "+ax[2]+" "+ax[3]);

Scanner s1 = new Scanner(System.in);
int a[] = new int[5];

System.out.println("Length if array is: "+a.length);
System.err.println("Enter elements of array : ");

for(int i=0;i<=a.length-1;i++)
{
    a[i]=s1.nextInt();
}
for(int i=0;i<=a.length-1;i++)
{
    System.out.println("elements from the index value of "+i+" is "+a[i]);

}
System.out.println(" ");


System.out.println("Advanced for loop");
for(int i:a)
{
    System.out.println("elements are: "+i);//faster output from advanced for loop here assigning values from the array to the variable i not indexing here (no i++ no need) but only use here no use in any other cases
}
System.out.println(" ");

for(int i=a.length-1;i>=0;i--){
System.out.println("elements from the index value of "+i+" is "+a[i]);
}

}
}
