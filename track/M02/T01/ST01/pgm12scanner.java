import java.util.Scanner;

public class pgm12scanner {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
 System.out.println("enter name full name : "); //Full name
 String w = sc.nextLine();
 
    
 System.out.println("Age : "); //Age
 int s = sc.nextInt();
 
 System.out.println("roll number : "); //Roll Number
 int x = sc.nextInt(); 
 
 char ct = w.charAt(2); //2nd char display


 System.out.println("full name is :"+w);
 System.out.println("Age is: "+s);
 System.out.println("roll number is : "+x);
 System.out.println("the second character in the full name is :"+ct);
 
 }
}