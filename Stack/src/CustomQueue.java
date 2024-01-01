

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE=10;//private so no one can access final so that we don't change

    int end=-1;//poiter pointing towards the end

    public  CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){//constructor
        this.data=new int[size];

    }

    public boolean isFull() {
        return end == data.length - 1; //ptr is at last index
    }
    public boolean isEmpty () {
        return end == -1;
    }


    public boolean insert(int items){
        if(isFull()){
            return false;

        }
        data[end++]=item;//it first adds item in the end and then increment the end
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty");
        }
        int removed=data[0];
        //shift element to left

        for (int i = 1; i < end; i++) {
            data[i-1]=data[i];
            
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if (isEmpty()) {
            throw new Exception("queue is empty");
        }
        return data[0];

    }
    public  void display(){
        for (int i = 0; i < end; i++) {
            System.out.println(data[i] + " ");
            
        }
        System.out.println("end");
    }
}
