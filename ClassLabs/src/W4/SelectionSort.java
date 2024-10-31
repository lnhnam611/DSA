package W4;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {5,9,100,12,16,1,200};
		
		
		//System.out.println(minIndex(intArr,0));
		for(int i =0; i< intArr.length; i++) {
			swapEle(intArr,i,minIndex(intArr,i,intArr.length));
		}
		
		//swapEle(intArr,0,minIndex(intArr,0));
		for(int i =0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
	}
	
	public static int minIndex(int[] arr,int first, int last) {
		int minIndex = 0;		
		for(int i =1; i< last; i++) {
			if(arr[first] > arr[i]) {
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public static void swapEle(int[] arr, int i, int j) {		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;		
	}

}
