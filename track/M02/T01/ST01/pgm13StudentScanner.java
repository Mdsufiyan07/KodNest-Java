import java.util.Scanner;

public class pgm13StudentScanner {

public static void main(String[] args){
    Scanner x2 = new Scanner(System.in);

    Student s1 = new Student();

System.out.println("Enter id");
    s1.id = x2.nextInt();
    System.out.println("Enter name");
    s1.name = x2.next();
    System.out.println("Enter height");
    s1.height = x2.nextDouble();

    s1.run();
    s1.sleep();
    s1.details();

}

}
class Student{
    int id = 5;
    String name = "Sufiyan";
    double height = 5.5;

    void run(){
        System.out.println("running");
    }
    void details(){
        System.out.println("id   : "+id);
        System.out.println("name : "+name);
        System.out.println("height : "+height);
    }

    void sleep(){
        System.out.println("sleeping");
    }
}


