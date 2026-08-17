import java.util.Scanner;

public class pgm14array {
    public static void main(String[] args) {

        System.out.println("array creation with values type 1 ");
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

        System.out.println("  ");
        System.out.println("array creation with values type 2 ");
int ax[] = {10,20,30,40};
System.out.println(ax[0]+" "+ax[1]+" "+ax[2]+" "+ax[3]);

System.out.println("  ");
System.out.println("array creation with values type 3 taking input ");

Scanner s1 = new Scanner(System.in);
int a[] = new int[5];

System.out.println("Length if array is: "+a.length);
System.err.println("Enter elements of array : ");

for(int i=0;i<=a.length-1;i++)
{
    a[i]=s1.nextInt();
}

System.out.println("  ");
System.out.println("The elements are as follows:   ");

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

System.out.println("  ");
System.out.println("Reversing array :  ");


for(int i=a.length-1;i>=0;i--){ //reverse traversing  of array
System.out.println("elements from the index value of "+i+" is "+a[i]);
}

System.out.println("  ");
        System.out.println("array creation with values type where we copy one array values to other array ");
        System.out.println("  ");

        int j =0;
        int b[]=new int[a.length];
        for(int i=0;i<=a.length-1;i++){
            b[j]=a[i];
            System.out.println("Elements of array b are: "+j+" is "+b[j]);
            j++;
        }


System.out.println("  ");
System.out.println("Taking a array values into b array and put it in reverse order  ");
System.out.println("  ");

int x=b.length-1;
for(int i =0;i<=a.length-1;i++){
    b[x]=a[i];
   
    x--;
}
for(int i=0;i<=a.length-1;i++){
    System.out.println("Elements of array b are: "+i+" is "+b[i]);
}


System.out.println("  ");
System.out.println("Taking b array values and making it as reference  ");
System.out.println("  ");

int ref[]=b;

for(int i:ref)
{
    System.out.println(i);
}


}
}
