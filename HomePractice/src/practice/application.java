package practice;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		LinkedStack<String> linkedStack = new LinkedStack<String>();
		
		linkedStack.push("Nam");
		linkedStack.push("Le");
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.pop());
	}

}
