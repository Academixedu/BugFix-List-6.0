import java.util.ArrayList;

public class Bug3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.set(1,2);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        
    }
}
