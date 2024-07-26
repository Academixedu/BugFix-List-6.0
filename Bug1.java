import java.util.ArrayList;

public class Bug1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
     //you should add more before accessing index 3:
        list.add(4);

        System.out.println(list.get(3));

        //you should print 2:
       // System.out.println(list.get(2));
    }
}
