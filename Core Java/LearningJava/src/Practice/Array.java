package Practice;

public class Array {
    public static void main(String[] args){
        //declare
        int[] number = {1,2,3,4,5};

        //access by index
        System.out.println(number[0]);
        System.out.println(number[1]);

        //array length
        System.out.println("length: " + number.length);

        //loop
        for(int num:number){
            System.out.println(num);
        }

    }
}
