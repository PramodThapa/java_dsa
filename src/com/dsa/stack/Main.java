package src.com.dsa.stack;


public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack2 = new Stack<>(Integer.class,5);

        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);



        System.out.println((Integer)stack2.pop());
        System.out.println((Integer)stack2.pop());
        System.out.println((Integer)stack2.pop());
        System.out.println((Integer)stack2.pop());
        System.out.println((Integer)stack2.pop());
        System.out.println((Integer)stack2.pop());



        System.out.println(stack2.toString());
    }
}
