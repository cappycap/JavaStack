/* by Adam Bullard */

public class QStackTest {

	public static void main(String[] args) {

		// Case 1
		QStack case1 = new QStack();
		case1.push(1);
		case1.push(2);
		case1.push(3);
		case1.push(4);
		case1.push(5);
		case1.pop();
		case1.pop();
		case1.pop();
		System.out.println("-------\nCase 1:\n" + case1.top());

		// Case 2
		QStack case2 = new QStack();
		case2.push(2);
		case2.push(4);
		case2.push(8);
		case2.pop();
		case2.pop();
		System.out.println("-------\nCase 2:\n" + case2.isEmpty());

		// Case 3
		QStack case3 = new QStack();
		case3.push(3);
		case3.push(6);
		case3.push(9);
		case3.pop();
		System.out.println("-------\nCase 3:\n" + case3.top() + ", " + case3.isEmpty() + "\n-------");
	}

}
