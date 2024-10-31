package W3;

public class Recursion_cont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr = {4,5,1,100,120,4,9};
		
		displayArr(intArr,0,intArr.length-1);
		
	}
	
	public static void displayArr(int arr[], int first, int last) {
		System.out.print(arr[first]+ " ");
		if(first < last) {
			displayArr(arr, first + 1, last);
		}
	}

}
