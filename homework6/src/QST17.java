public class QST17 {
    /*Write a Java Program using below steps.
17.1 Declare your city as instance variables.
17.2 Declare your country as static variables.
17.3 Declare one instance method and call static variable in print statement
17.4 Declare static method and call instance variable in print Statement.
17.5 Call both user defined methods into main method.*/
    String a = "london";
    static String b = "GB";

    public void sw() {
        System.out.println(b);
    }


    public static void DFG() {
        QST17 GH = new QST17();
                System.out.println(GH.a);
    }

    public static void main(String[] args) {
        QST17 TB = new QST17();
        TB.sw();DFG();
    }



    }



