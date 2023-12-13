public class Main {
    public static void main(String[] args) throws Exception {
//          CustomStack stack= new CustomStack(5);
CustomStack stack=new DynamicStack();//. In object-oriented programming, this is known as polymorphism,
// where a subclass object can be treated as an object of its superclass.
          stack.push(23);
            stack.push(23);
            stack.push(23);
            stack.push(23);
            stack.push(23);
            stack.push(23);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        }
}