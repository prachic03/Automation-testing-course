package ex_13_Functions;

import java.util.Scanner;

public class Lab007_Functino_Arth {
    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1");
        int a = sc.nextInt();
        System.out.println("Enter the num 2");
        int b = sc.nextInt();

        float Substraction = Sub(a,b);
        System.out.println(a + " - " + b +  " = " + Substraction);

        int Sum = Sum(a,b);
        System.out.println(a + " + " + b +  " = " + Sum);

        int sum2 = Sum(3,4);
        System.out.println("Sum2 = " + sum2);






    }

    static float Sub(float num1, float num2){
        return num1-num2;
    }
    public static int Sum(int num1, int num2){
        return num1 + num2;
    }




}
