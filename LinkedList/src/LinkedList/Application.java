package LinkedList;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> newStringList = new LinkedList<String>();
		newStringList.add("A");
		newStringList.add("B");
		newStringList.add("C");
		newStringList.add("D");
		newStringList.add("E");
		newStringList.add("F");
		newStringList.add(1, "Nam");
		
		//newStringList.clear();
//		String[] strArr = newStringList.toArray();
//		System.out.println(strArr[0]);
		for(int i =1; i<=newStringList.getLength(); i++) {
			System.out.println(newStringList.getEntry(i));
		}
		System.out.println("------------------");


		newStringList.displayArr();
		System.out.println("Length: "+newStringList.getLength());
	}

}
