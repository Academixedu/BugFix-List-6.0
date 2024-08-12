import java.util.ArrayList;
import java.util.Iterator;

public class Bug3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.set(1,3);

        Iterator<Integer>i=list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
