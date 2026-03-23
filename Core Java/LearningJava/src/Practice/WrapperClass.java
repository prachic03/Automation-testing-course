package Practice;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
    public static void main(String[] args){
        //needed for collections like List<Integer>
        // autoboxing converts automatically

        Integer y = 5;
        List<Integer> nums = new ArrayList<>();
        nums.add(10);  // autoboxing : int --> Integer

        //Useful wrapper methods
        Integer.parseInt("42"); // String -> int
        String.valueOf(100); //int -> string
        Boolean.parseBoolean("true");


    }
}
