import java.util.HashMap;
import java.util.Set;

public class SetIteration {
    public static void main(String[] args) {
        HashMap<String,Integer> hm= new HashMap<>();

        // adding elements in it
        hm.put("India",100);
        hm.put("USA",10);
        hm.put("China",1000);
        hm.put("Nepal",90);

        //Iterate
        Set<String> keys=hm.keySet();
        System.out.println(keys);
        //for each loop
        for (String k:keys) {
            System.out.println("keys = "+k+ ",value="+hm.get(k));
            
        }
    }
}
