import java.util.Scanner;
public class pgm17findkey {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter size: ");
    int size = s.nextInt();
    int a[] = new int[size];
    System.out.println("Enter Key to find: ");
    int key = s.nextInt();
    System.out.println("Enter elements: ");
    for(int i =0; i<size;i++){
        a[i] = s.nextInt();
    }
search s1= new search();
s1.searchKey(a, key);

}
}

class search{
    void searchKey(int a[],int k){
        boolean f = false;
        for(int i=0;i<a.length;i++){
if(a[i]==k){
    System.err.println("The element "+k+" found in index: "+i);
    f=true;
    break;
}
}

if(!f){
    System.out.println("element is not found");
}

    }
}
