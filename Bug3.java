import java.util.ArrayList;

public class Bug3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.set(2, 3); 
        list.set(0, 3); 
        list.set(1, 3); 
        System.out.println(list);
    }
}
