public class QST19 {
    /*
    Write a Java Program using below steps.
19.1 Declare one of your group member names as instance variable.
19.2 Declare one of your group member names as static variable.
19.3 Declare one instance method name with group name (e.g. selenium())and call both global
variables.
19.4 Declare static method name agile() and call both variable
19.5 Call both user defined methods into main method.
Note: Declare 1 local variables in all user defined method and main method and print in to statement
     */

    String b = "Dyson";
    static String a = "Hillingdon";

    public void Selenium () {
        System.out.println(b + a);
    }

        public static void agile (){
        QST19 tfl = new QST19();
            System.out.println(tfl.a);

    }

    public static void main(String[] args) {
        QST19 XYZ = new QST19();
        XYZ.Selenium();agile();




    }



    }



