 package collection;
import java.util.ArrayList;

public class Bug3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.set(2, 3); 
        System.out.println(list);
    }
}
