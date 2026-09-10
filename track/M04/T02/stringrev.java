import java.util.Scanner;

public class stringrev {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s1 = s.next();

        char arr[] = s1.toCharArray();
        char newArr[] = new char[arr.length];
        int j=newArr.length-1;
        for(int i = 0; i < arr.length; i++){
            newArr[j] = arr[i];
            j--;

        }
        String rev = new String(newArr);
        System.out.println("Reversed String : "+rev);
        System.out.println("Original String : "+s1);

        System.out.println("");
        System.out.println("****************");
        System.out.println("Enter a String :");
        String s2 = s.next();
        System.out.println("Original String : "+s2);

        char arr2[] = s2.toCharArray();
        System.out.print("Reversed String : ");
        for(int i=arr2.length-1;i>=0;i--){
            System.out.print(arr2[i]);
        }}}
