public class Stringbuild2 {

    public static void main(String[] args) {
    System.out.println("*******************************");
    System.out.println("String Builder methods");

    System.out.println(" ");
     System.out.println(" ");

        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);
        sb.append(" Programming");
        System.out.println(sb);
        sb.insert(0,"The Python");
        System.out.println(sb);
        sb.delete(0,4);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        System.out.println("*******************************");
        System.out.println("String builder to string conversion");
         System.out.println(" ");
          System.out.println(" ");
        StringBuilder sb1 = new StringBuilder("Java");
        System.out.println(sb1);
        String res = sb1.toString();
        System.out.println(res);
        res.concat(" world");
        System.out.println(sb1); // does concat until it has returned to any string variable

        String x = res.concat(" World"); // it will concat because it has returned to string variable
        System.out.println(x);

         System.out.println("*******************************");
          System.out.println(" ");
           System.out.println(" ");
}
}
