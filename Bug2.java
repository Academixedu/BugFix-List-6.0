
import java.util.*;

public class Bug2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num.equals(2)) 
               iterator.remove();
            
            System.out.println(num);
        }

        
    }
}

