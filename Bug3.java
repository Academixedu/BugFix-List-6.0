import java.util.ArrayList;
import java.util.Iterator;

public class Bug3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2, 3); 
        Iterator <Integer> it=list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
