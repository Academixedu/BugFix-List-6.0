import java.util.ArrayList;
import java.util.Iterator;

public class Bug2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        while (iterator.hasNext()) {
            list.remove(1);
            System.out.println(iterator.next());
            Integer current = iterator.next();
            if (current == 2) { 
                iterator.remove();
            } else {
                System.out.println(current);
            }
        }
    }
}
}
 

