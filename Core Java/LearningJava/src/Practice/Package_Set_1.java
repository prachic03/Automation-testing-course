package Practice;
import java.util.Scanner;

public class Package_Set_1 {
    public static void main(String[] args){
        System.out.println("Hello");
//        keywords & identifiers
//        comments
//
        /*
        main method overloading --> there can be multiple main method but only one main method will be considered as entry point
        to overloading main method we need to give different param/return type etc

         */


        /*
         Datatypes ==>

    Primitive = can't be broken further
         1. Boolean
         2. Numeric
         - byte
         - short
         - char
         - int
         - long

         3. Floating
         - float
         - double

    Reference / Non- primitive
    => store reference (address) of an object, not actual value

    class, interface, enum, String, Array

        String name = "Prapti";
        int[] arr = {1,2,3};
        Student s = new Student();



         */

        int i = 34;
        short sh = 5;
        boolean bl = true;
        long l = 100;

        i = 10+1;
        System.out.println(i);

    /*
        //printf/println/print
        System.out.println("Hello everyone");
        System.out.print("Talk");
        String str = "          Hello this is string";
        System.out.printf(str);




    */
//constant
//        Final keyword

/*        final int aa = 10;
//        aa=45;
          System.out.println();
*/


//user input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);

        f1("Prapti");


//     StringBuilder & StringBuffer




    }

    static void f1(String name){
        System.out.println("Hello " + name);

    }


}
