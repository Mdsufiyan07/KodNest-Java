
public class StrCmp {
    public static void main(String[] args) {
        String s1 = "Kodnest Technologies";
        String s2 = "Kodnest Technologies";
        String s3 = "Raja";
        String s4 = "";
        String s5 = " ";

        String tr = "    java    ";
        String tx = "     ja    va     ";
        if (s1 == s2) {
            System.out.println("Ref are equal");
        } else {
            System.out.println("Ref are not equal");
        }
       
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("String are same");
        }else{
            System.out.println("String are not same");
        }

        System.out.println(s1.charAt(3)); //if we write 99 i.e, not there  a error will come as exception
        System.out.println(s1.indexOf("e")); //4
        System.out.println(s1.indexOf("Z")); // -1
        System.out.println(s1.contains("Nest")); // true
    
        System.out.println(s1.toUpperCase()); //KODNEST TECHNOLOGIES
        System.out.println(s1.toLowerCase()); //kodnest technologies
        System.out.println(s1.startsWith("Kod")); //true
        System.out.println(s1.endsWith("ies")); //true
        System.out.println(s1.length()); //20
        System.out.println(s1.replace('e','A'));
        System.out.print(s1.substring(5));
        System.out.println(s1.substring(5,14));

        System.out.print(s3.isEmpty()); // false
        System.out.println(s4.isEmpty()); // true
        System.out.println(s5.isEmpty()); // true
        System.out.println(s3.isBlank()); // false
        System.out.println(s4.isBlank()); // false
        System.out.println(s5.isBlank()); // true
        System.out.println(tr.trim());
        System.out.println(tx.trim());
    }}
