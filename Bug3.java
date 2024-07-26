import java.util.ArrayList;

public class Bug3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3); // Add the third element
        list.set(2, 3); // Set the third element to 3
        System.out.println(list); // Print the list to verify
    }
}
