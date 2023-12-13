public class DynamicStack extends CustomStack {//it never gets full
    public DynamicStack(){
        super();//it will call customStack()
    }
     public DynamicStack(int size){
        super(size); ////it will call customStack(size)
     }





    @Override//to create own push of dyanmicstack not bothered by customstack push
    public boolean push(int item) {
       if(this.isFull()){
           //double the array size
           int[] temp=new int[data.length * 2];

           //copy all previous in new data
           for (int i = 0; i < data.length; i++) {
               temp[i]=data[i];

           }
           data=temp;
       }
        //at this point  we know that the array is not full
//insert item
        return super.push(item);
    }

}
