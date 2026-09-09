public class StrAdding {
public static void main(String[] args) {

    System.out.println("String immutability display");
    String s1 = "Java";
    String res = s1.toUpperCase();
    System.out.println(res);
    System.out.println(s1);

System.out.println("----------------------------------------------");

    System.out.println("Adding two string using + and concat operator");
    String s2 = "Raja";
    String s3 = "Rani";
    String adding = s2+s3;
    System.out.println(adding);
    String s4 = new String ("Anu");
    String s5 = new String ("Banu");
    String result = s4.concat(" ").concat(s5).concat(" ").concat("Praveen").concat(" ").concat("Penguin");
    System.out.println(result);
System.out.println("----------------------------------------------");
    System.out.println("Converting string to char array and char arry back to string");

    String x = "Javid";
    System.out.println(x);
    char arr[] = x.toCharArray();
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    String y = new String(arr);
    System.out.println(y);

System.out.println("----------------------------------------------"); 
    
}
}
