import java.util.ArrayList;

public class Bug2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int i = 0; i < list.size(); i++) {
            list.remove(i); // Remove the element at index i
            System.out.println(list);
            i--; // Decrement i to adjust for the shifted indices after removal
        }
    }
}
