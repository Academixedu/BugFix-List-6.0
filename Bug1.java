import java.util.ArrayList;

public class Bug1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // the index starts from 0.. and ends at n-1... so index 2 is 3
        System.out.println(list.get(2));
    }
}
