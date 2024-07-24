import java.util.ArrayList;
import java.util.Iterator;

public class Bug2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
            if (value == 3) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}

