import java.util.Scanner;

public class pgm18frequency {
public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
    System.out.println("Enter size: ");

    int size = s.nextInt();//size

    int a[] = new int[size];//array creation

    System.out.println("Enter Key to find: ");//key input
    int key = s.nextInt();

    //input elements
    System.out.println("Enter elements: ");
    for(int i =0; i<size;i++){
        a[i] = s.nextInt();
    }

    //making object
frequency s1= new frequency();

//function call
s1.freq(a, key);

}
}

class frequency{
    int count = 0;
    void freq(int a[],int k){
        
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                count++;
            }
        }
        System.out.println("The frequency of "+k+" is "+count);
    }
}
