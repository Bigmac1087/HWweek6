public class QST14 {/*
    Write a Java program to print the sum (addition), multiply, subtract, divide and
    remainder of two numbers.
    Test Data:
    Input first number: 125
    Input second number: 24
    Expected Output:
            125 + 24 = 149
            125 - 24 = 101
            125 x 24 = 3000
            125 / 24 = 5
            125 mod 24 = 5*/

    public static void main(String[] args) {
        int num1 = 125, num2 = 24;

        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Sum: " + sum);


    }
}
