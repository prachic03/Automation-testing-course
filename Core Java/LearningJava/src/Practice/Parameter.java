package Practice;

public class Parameter {
    public static void main(String[] args){

        greet("rahul");
        add(4,5);
    }
    static void greet(String name){
        System.out.println("Hello " + name + "!");

    }
    static void add(int a,int b){
        int sum = 0;
        System.out.println(a+b);

    }
}
