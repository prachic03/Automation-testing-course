package Practice;

public class Methods {
    public static void main(String[] args){
        //method = machine
        // You give it something → it does a job → gives back a result.
        // You can use it again and again without rewriting code.


        //write once - use many times

        greet("Prapti");

        sayHello();




    }

// void = returns nothing
// static = can call without creating object (for now)





    static void greet(String name){
        System.out.println("Hi," + name);
    }

    static void sayHello(){
        System.out.println("Hello!");
    }




}
