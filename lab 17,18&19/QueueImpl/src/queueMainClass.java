import java.util.*;
public class queueMainClass {
	public static void main(String[] args) {
		
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		System.out.println(queue);
		System.out.println("Front of the queue: "+ queue.peek());
		int element=queue.poll();
		System.out.println("Dequeue element: "+element);
		System.out.println("Topmost element "+ queue.peek());
	}
}
