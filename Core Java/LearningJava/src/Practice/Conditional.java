package Practice;

public class Conditional {
    public static void main(String[] args){
/*
        //if it rains -> take umberalla
        // else --> wear sunglasses

        int age = 20;

        if(age >= 18) {
            System.out.println("You can Vote!");
        }
        else {
            System.out.println("Too young to vote.");
        }
*/
/*
        //else if
        int marks = 78;

        if(marks >=90){
            System.out.println("Grade: A");
        }else if(marks >= 70){
            System.out.println("Grade: B");
        }else if(marks >= 50){
            System.out.println("Grade: C");
        }else {
            System.out.println("Grade: D");
        }


 */

        //use .equals() instead of ==

        String color = "red";

        if(color.equals("red")){
            System.out.println("Stop!");
        }else if(color.equals("yellow")){
            System.out.println("Get ready.");
        }else {
            System.out.println("Go!");
        }
    }
}
