package ex_13_Functions;

public class Lab002_Method_Function {
    public static void main(String[] args) {
        //Step 2 - Function Call
        f1();
        name_of_function();

        f2("prapti");

    }

    // Step 1- Function Def.
    static void f1(){
        System.out.println("Hi");
    }

    static void name_of_function(){
        System.out.println("THIS IS THE CODE THAT YOU WANT TO EXECUTE");
        System.out.println("THIS IS THE CODE THAT YOU WANT TO EXECUTE");
        System.out.println("THIS IS THE CODE THAT YOU WANT TO EXECUTE");
        System.out.println("THIS IS THE CODE THAT YOU WANT TO EXECUTE");
    }

    static void f2(String str){
        System.out.println("Hello "+ str);
    }


}
