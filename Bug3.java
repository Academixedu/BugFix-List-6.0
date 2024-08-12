import java.util.ArrayList;

public class prac {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(0);
        list.set(2, 3); 
        for(Integer e:list){
          System.out.println(e);
        }
    }
}
