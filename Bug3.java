import java.util.ArrayList;

public class Bug3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.set(0, 1);
        for(Integer i:list){
            System.out.println(i);
        }


    }
}
