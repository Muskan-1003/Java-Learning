import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //creating hash map world population
        HashMap<String,Integer> hm= new HashMap<>();

//        adding elements in it
        hm.put("India",100);
        hm.put("USA",10);
        hm.put("China",1000);
        System.out.println(hm);


//        //get
//        int population=hm.get("India");
//        System.out.println(population);


//        //CointainsKey
//        System.out.println(hm.containsKey("India"));


//        //remove-O(1)
        System.out.println(hm.remove("India"));
        System.out.println(hm);
//size
        System.out.println(hm.size());
        //to check if it is empty or not
        System.out.println(hm.isEmpty());
        //clear --clear all the hashmapn elements
        hm.clear();




    }

}