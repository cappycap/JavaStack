/* by Adam Bullard */

public class SQueueTest {

	public static void main(String[] args) {

		// Case 1
		SQueue case1 = new SQueue();
		case1.add(1);
		case1.add(2);
		case1.add(3);
		case1.add(4);
		case1.add(5);
		case1.remove();
		case1.remove();
		case1.remove();
		System.out.println("-------\nCase 1:\n" + case1.peek());

		// Case 2
		SQueue case2 = new SQueue();
		case2.add(2);
		case2.add(4);
		case2.add(8);
		case2.remove();
		case2.remove();
		System.out.println("-------\nCase 2:\n" + case2.isEmpty());

		// Case 3
		SQueue case3 = new SQueue();
		case3.add(3);
		case3.add(6);
		case3.add(9);
		case3.remove();
		System.out.println("-------\nCase 3:\n" + case3.peek() + ", " + case3.isEmpty() + "\n-------");
	}
}
