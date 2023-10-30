public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int key = 5;
        int index=linearSearch(numbers,key);
        if (index==-1){
            System.out.println("key not found");
        }else{
            System.out.println( "Found the key " + index);
        }
    }
//function
    public static int linearSearch(int[] numbers, int key){
        for (int i = 0; i < numbers.length; i++) {
            if(i==key){
                return i;
            }

        }
        return -1;
    }
}