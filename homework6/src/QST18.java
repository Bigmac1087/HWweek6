public class QST18 {
    /*Write a Java Program using below steps.
18.1 Declare your council name as static variables.
18.2 Declare your house number as instance variables.
18.3 Declare one instance method name borough() and call Static variable
18.4 Declare static method name address() and call instance variable
18.5 Call both user defined methods into main method.*/

    static String a = "Hillingdon";
    String b = "Dyson";

    public void Berkshire() {
        System.out.println(a);
    }

    public static void Uxbridge() {
        QST18 FT = new QST18();
        System.out.println(FT.b);
    }

    public static void main(String[] args) {
        QST18 abc = new QST18();
        abc.Berkshire();Uxbridge();



    }
}