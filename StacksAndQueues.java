import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StacksAndQueues {
    //Stack -> LIFO(Last In First Out)
    //Queues -> FIFO(First In First Out)
    public static void main(String[] args) {
   
        /*
    Stack<Integer> stack = new Stack();
    stack.push(20);
    stack.push(15);
    stack.push(10);
    stack.push(5);
    stack.push(0);

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
        
     Queue<Integer> queue = new LinkedList<>();   
       queue.add(7);
       queue.add(9);
       queue.add(5);
       queue.add(0);
       queue.add(6);
       
       queue.remove(5);
       System.out.println(queue.remove(0));

       Deque<Integer> deque = new ArrayDeque<>();
       deque.add(19);
       deque.addFirst(99);
       System.out.println(deque.peek());
       */

       protected int[] data;
       private static final int DEFAULT_SIZE = 10;

       public StacksAndQueues(){
        this(DEFAULT_SIZE);
       }

       public StacksAndQueues(int size){
          this.data = new int[size];
       }
 }
}