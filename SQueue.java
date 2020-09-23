/* by Adam Bullard 
 * Note that remove() and peek() return -1 if they are being improperly called (ex. empty queue)
 */

import java.util.Stack;

public class SQueue {

	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();

	public void add(int x) {

		// Push the new element into the primary stack.
		s1.push(x);

	}

	public int remove() {

		// Check whether or not the primary stack is empty.
		if (!s1.isEmpty()) {

			// Move everything to stack 2, giving it the order of a queue.
			while(!s1.isEmpty()) {

				s2.push(s1.pop());

			}

			// Remove first element.
			int remove = s2.pop();

			// Return to original stack.
			while (!s2.isEmpty()) {

				s1.push(s2.pop());

			}

			// Return the integer element we removed.
			return remove;

		} else {

			// Stack is empty, return -1.
			return -1;

		}
	}

	public int peek() {

		// Check if the primary stack is empty.
		if (!s1.isEmpty()) {

			// Move everything to stack 2, giving it the order of a queue.
			while(!s1.isEmpty()) {

				s2.push(s1.pop());

			}

			// Peek at first element.
			int peek = s2.peek();

			// Return to original stack.
			while (!s2.isEmpty()) {

				s1.push(s2.pop());

			}

			// Return the integer element we found.
			return peek;

		} else {

			return -1;

		}

	}

	public int size() {

		int size = 0;

		// Move everything to stack 2 while counting the elements.
		while(!s1.isEmpty()) {

			s2.push(s1.pop());
			size++;

		}

		// Return to original stack.
		while (!s2.isEmpty()) {

			s1.push(s2.pop());

		}

		// Return the size we found.
		return size;

	}

	public boolean isEmpty() {

		return s1.isEmpty();

	}
}
