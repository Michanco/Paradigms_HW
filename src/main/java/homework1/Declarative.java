package homework1;

import java.util.Arrays;
import java.util.Collections;

public class Declarative {
    public static void main(String[] args) {
        Integer[] inputarray = new Integer[]{1, 2, 3, 4, 5, 6 , 7 };
        Arrays.sort(inputarray, Collections.reverseOrder());
        System.out.println(Arrays.toString(inputarray));
        Arrays.sort(inputarray);
        System.out.println(Arrays.toString(inputarray));

    }
}
