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
           

            System.out.println(iterator.next());
        }

        System.out.println("Removing element at index 1");
        System.out.println("the purpose of using iterator is to load values and print it.. so after creating itearable object we should print it");

        list.remove(1);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
