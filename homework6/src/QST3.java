public class QST3 {
    /*3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
            3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
    print statement.
            3.5 Declare the Main method.
            3.6 Call both instance and static methods into the Main method and run the programme.*/
    String name = "Dhawal";
    static String surname = "Patel";

    public static void bmw(){
        // String new1 = "Dhawal";
        QST3 qw = new QST3();
        System.out.println(qw.name);
        System.out.println(surname);
    }

    public void bmw1 (){
        System.out.println(name + surname);
    }

    public static void main(String[] args) {
        QST3 we= new QST3();
        we.bmw1();bmw();








    }

}



