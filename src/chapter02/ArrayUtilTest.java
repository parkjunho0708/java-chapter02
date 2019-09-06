package chapter02;

public class ArrayUtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {10, 11, 12, 13};
		double[] d1 = ArrayUtil.intToDouble(a1);
		
		// java 1.6에서 나옴
		for(double d : d1) {
			System.out.print(d + " ");
		}
		
		System.out.println("");
		
		double[] d2 = {0.0, 1.1, 2.2, 3.3};
		int[] a2 = ArrayUtil.doubleToInt(d2);
		for(int i : a2) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		
		int[] a3 = ArrayUtil.concat(a1, a2);
		for(int i : a3) {
			System.out.print(i + " ");
		}
		
	}

}
