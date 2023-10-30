import java.util.HashSet;
import java.util.Iterator;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);
        System.out.println(set);

//        set.remove(2);
//
//
//        if(set.contains(2)){
//            System.out.println("set contains 2");
//        }if(set.contains(4)){
//            System.out.println("set contains 4");
//        }
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
