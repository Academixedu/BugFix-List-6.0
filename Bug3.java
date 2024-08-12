import java.util.ArrayList;

public class Bug3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3); 
        for(Integer e:list){
            System.out.println(e);
    }
}
}