import java.util.Scanner;
public class pgm17findkey {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter size: ");
    
    //taking size input
    int size = s.nextInt();
    int a[] = new int[size];

    //target entry for finding in array
    System.out.println("Enter Key to find: ");
    int key = s.nextInt();

    //entering elements in array
    System.out.println("Enter elements: ");
    for(int i =0; i<size;i++){
        a[i] = s.nextInt();
    }
    //making object
search s1= new search();

//function call
s1.searchKey(a, key);
}
}

//search class  
class search{
    boolean f = false;
    void searchKey(int a[],int k){
        
        for(int i=0;i<a.length;i++){
if(a[i]==k){
    System.out.println("The element "+k+" found in index: "+i);
    f=true;
    break;
}
}

if(!f){
    System.out.println("The element"+k+"is not found");
}

    }
}
