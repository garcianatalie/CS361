/**
 * 
 */
package mystack;

import java.util.Stack;

/**
 * @author ADD YOUR NAME
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		theStack = (theStack).next;
		return (T) (theStack).next;

	}

	public void push(T v) {
		// TODO To complete
		MyNode<T> tempNode = new MyNode<T>(null, null);
        tempNode.val = v;
        tempNode.next = theStack;
        theStack = tempNode;
     
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		Stack<Integer> newStack = new Stack<>();
		newStack.push(1);
		newStack.push(2);
		
		newStack.pop();
		
		newStack.push(5);

		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		Stack<Person> nameStack = new Stack<>();
		Person p1 = new Person();
		p1.setFname("Natalie");
		
		Person p2 = new Person();
		p2.setFname("Dr. Scharff");
		
		nameStack.push(p1);
		nameStack.push(p2);
		

	}

}
