import java.util.ArrayList;

public class Bug3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3); 
        list.set(2, 4);

        for (Integer integer : list) {
            System.out.println(integer);
        }
       

    }

}
