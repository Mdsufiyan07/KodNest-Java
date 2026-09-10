public class stringbuild {
public static void  main (String [] args){
   System.out.println("*******************************");
   System.out.println("Normal string Builder creation");

    StringBuilder s1 = new StringBuilder();
    System.out.println(s1.capacity());
    System.out.println(s1.length());
    s1.append("sufiyan");
    System.out.println(s1);
    System.out.println(s1.capacity());
    System.out.println(s1.length());
    s1.append(" Java");
    System.out.println(s1);
    System.out.println(s1.capacity());
    System.out.println(s1.length());
    s1.append(" class");
    System.out.println(s1);
    System.out.println(s1.capacity());
    System.out.println(s1.length());

    System.out.println("*******************************");
    System.out.println("Adding data along with creation and also for new string Ensuring String builder");
    StringBuilder s2 = new StringBuilder("Jack");
    System.out.println(s2);
    System.out.println(s2.capacity());
    System.out.println(s2.length());
    s2.append(" Ma");
    System.out.println(s2);
    StringBuilder s3 = new StringBuilder();
    s3.ensureCapacity(100);
    System.out.println(s3.capacity());
    System.out.println(s3.length());

    System.out.println("*******************************");
   }
}
