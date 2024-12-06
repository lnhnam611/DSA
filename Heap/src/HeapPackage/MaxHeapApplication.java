package HeapPackage;

import java.util.Scanner;

public class MaxHeapApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArr = new Integer[]{10,50,30,90,70,80,200};
		Integer intInput;
		Scanner scanner = new Scanner(System.in);
		MaxHeap<Integer> maxHeapInt = new MaxHeap();
		int count = 0;
		while(count < 5) {
			intInput = scanner.nextInt();
			scanner.nextLine();
			maxHeapInt.Add(intInput);
			count++;
		}		
		System.out.println(maxHeapInt.removeMax());
		System.out.println(maxHeapInt.removeMax());
		System.out.println(maxHeapInt.removeMax());
		System.out.println(maxHeapInt.removeMax());
		System.out.println(maxHeapInt.removeMax());
//		System.out.println(maxHeapInt.removeMax());
//		System.out.println(maxHeapInt.removeMax());

	}

}
