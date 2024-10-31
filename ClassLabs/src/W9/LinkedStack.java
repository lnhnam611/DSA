package W9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Vector;

public class LinkedStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(45);
		vec.add(90); //push
		
		System.out.println(vec);
		vec.remove(vec.size()-1); //pop method
		vec.add(990); //push
		vec.add(6868); //push
		System.out.println(vec);
		vec.get(vec.size()-1); // peek
		
		
	}

}
