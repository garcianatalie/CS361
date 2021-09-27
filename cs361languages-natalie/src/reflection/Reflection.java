/**
 * 
 */
package reflection;

/**
 * @author ADD YOUR NAME 
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * 
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());

	}

	/**
	 * Print the chain of super classes of the object Format of the output:
	 * Inheritance chain: Cn inherits from Cn-1 inherits ... inherits from
	 * java.lang.Object
	 * 
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
		Object obj = o;
		System.out.println(obj.getClass().getName());
		while (obj.getClass().getSuperclass() != null) {
			if (obj.getClass().getSuperclass().getName().equals("java.lang.Object")) {
				System.out.print("Cn inherits from " + obj.getClass().getSuperclass().getName());
				break;
			}
			System.out.print("Cn-1 inherits from " + obj.getClass().getSuperclass().getName());
			obj = obj.getClass().getSuperclass();
		}
	}

	/**
	 * Print the list of methods of the object
	 * 
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		Method[] m = o.getClass().getMethods();

		// List of methods
		// TODO To complete
		// Print each method on one line
		// Use this EXACT format
		System.out.println("Methods: ");
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i].toString());
		}
		System.out.println("\n");

	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();

		// Demonstration of the methods on an objet of type String
		// TODO To complete
		System.out.println("String");
		String s1 = new String();
		r.correspondingClass(s1);
		r.inheritanceChain(s1);
		r.listMethods(s1);
		

		// Demonstration of the methods on an objet of type ColoredCircle
		// TODO To complete
		System.out.println("ColoredCircle");
		ColoredCircle c1 = new ColoredCircle();
		r.correspondingClass(c1);
		r.inheritanceChain(c1);
		r.listMethods(c1);
	}

}
