package W4;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mystery(4,4));
	}
	
	public static int mystery(int x, int y) {
		if(y == 0) {
			return 1;
		}
		if( y == 1) {
			return x;
		}
		return x * mystery(x,y-1);
	}

}
