package W2;

/**
 *  Javadocs comment are used to explain a class and methods
 *  this class is to practice Recursion
 */

public class Recursion_1 {
	/**
	 * This is a main method to test our recursive methods
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//countDown(20);
		//countUp(10);
		System.out.println(sum(10));
			
		}
	
	/**
	 * This is count down method
	 * @param n
	 */
	
	public static void countDown(int n) {
		if(n<0) {
			System.out.println("n must be positive");
		}
		else {
			if(n==1) {
				System.out.println(n);
			}
			else {
				System.out.println(n);
				countDown(n-1);
			}
		}	
	}
	
	public static void countUp(int n) {
		if(n==1) {
			System.out.println(n);
		}
		else {
			countUp(n-1);
			System.out.println(n);
		}
	}
	
	public static int sum(int n) {
		if(n==1)
		{
			return 1;
		}
		else {
			return n +  sum(n-1);
		}
	}

	
	}

