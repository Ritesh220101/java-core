import java.util.ArrayDeque;
import java.util.Deque;

public class QueueImplementation {
	private static Deque<Integer> queue = new ArrayDeque<>();

	public static void main(String[] args) {
		add(1);
		add(2);
		add(3);
		add(4);
		System.out.println(queue);
		remove();
		remove();
		System.out.println(queue);
		remove();
		remove();
		System.out.println(queue);
		remove();
	}

	private static void remove() {
		if (queue.isEmpty())
			System.out.println("No element in queue");
		else
			queue.removeLast();

	}

	private static void add(int number) {
		queue.add(number);
	}

}
