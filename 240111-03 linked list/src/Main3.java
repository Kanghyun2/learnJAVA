import java.util.Deque;
import java.util.LinkedList;

public class Main3 {
	public static void main(String[] args) {
		// Qeque : FIFO (First-In First-Out) : 선입선출
		// Deque : LIFO (Last-in First-Out) - Stack : 후입선출
		Deque<String> deque = new LinkedList<>();
		
		deque.push("원소1");
		deque.push("원소2");
		deque.push("원소3");
		deque.push("원소4");
		
		System.out.println(deque.size());
		System.out.println(deque);
		
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		System.out.println(deque.pop());
	}
}
