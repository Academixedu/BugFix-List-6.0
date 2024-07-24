import java.util.ArrayList;

public class Bug1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(2));//Here 3 represents the index of the List , Their are upto 0-2 index only ,so its giving error
    }
}
