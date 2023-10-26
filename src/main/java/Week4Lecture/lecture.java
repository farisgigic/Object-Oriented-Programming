package Week4Lecture;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class lecture {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(4);
        numbers.add(34);
        numbers.add(11);
        for(int number : numbers)
        {
            System.out.println(number);
        }
        if(numbers.contains(Integer.valueOf(34)))
        {
            numbers.remove(Integer.valueOf(34));
        }
        System.out.println("\n");
        for(int number : numbers)
        {
            System.out.println(number);
        }

    }
    public static void removeLast(ArrayList<Integer> list)

    {
        list.remove(0);
        list.remove(list.size()-1);
    }
}
