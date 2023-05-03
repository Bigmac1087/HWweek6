public class QST20 {
    /*Write a Java Program using below steps.
20.1 Declare your Spain as static variable.
20.2 Declare your United Kingdom as instance variable.
20.3 Declare instance method name homeCountry()and call static variable.
20.4 Declare static method name holidays() and call instance variable
20.5 Call both methods in main method.*/

    static String a = "spain";
    String b = "uk";

    public void homeCountry() {
        System.out.println(a);

    }

    public static void holidays () {
        QST20 gb = new QST20();
        System.out.println(gb.b);

    }

    public static void main(String[] args) {
        QST20 the = new QST20();
        the.homeCountry();holidays();
    }
}


