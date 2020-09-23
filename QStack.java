/* by Adam Bullard
 * Note that pop() and top() return -1 if they are being improperly called (ex. empty stack)
 */

import java.util.LinkedList;
import java.util.Queue;

public class QStack {

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	int top;

	public void push(int x) {

		// Add the element to the primary queue.
		q1.add(x);

		// Set or update the top element tracker.
		top = x;

	}

	public int pop() {

		// Check whether or not the primary queue is empty.
		if (!q1.isEmpty()) {

			// Find what our top variable is.
			int x = top;

			// Move all elements except top to queue 2.
			while (q1.size() > 1) {
				q2.add(q1.remove());
			}

			// Remove top.
			q1.remove();

			// Add leftovers back to queue 1.
			while (!q2.isEmpty()) {
				top = q2.peek();
				q1.add(q2.remove());
			}

			return x;

		} else {

			// Queue is empty, return -1.
			return -1;

		}

	}

	public int top() {

		// Check whether or not the primary queue is empty.
		if (!q1.isEmpty()) {

			return top;

		} else {

			return -1;

		}
	}

	public int size() {

		int size = 0;

		// Move all elements to queue 2 while counting.
		while (!q1.isEmpty()) {

			q2.add(q1.remove());
			size++;

		}

		// Move everything back.
		while (!q2.isEmpty()) {

			q1.add(q2.remove());

		}

		return size;

	}

	public boolean isEmpty() {

		return q1.isEmpty();

	}
}
