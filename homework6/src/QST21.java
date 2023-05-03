public class QST21 {

    /*Write a Java programme using the following steps.
            4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
            4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
    print statement.
            4.5 Declare the Main method.
            4.6 Call both instance and static methods into the Main method and run the programme.*/

        String name = "Dhawal";
        String surname = "Patel";

        static String a = "D",b= "p";


        public void nw() {
        System.out.println(name);
        System.out.println(surname);
    }

        static void nw1() {
        System.out.println(a + b);

    }

        public static void main(String[] args) {
        QST21 TFL = new QST21();
        nw1();
        TFL.nw();
    }
    }

