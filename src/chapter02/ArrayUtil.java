package chapter02;

public class ArrayUtil {

	// int 배열을 double 배열로 변환
	public static double [] intToDouble( int[] source ) {
		double[] result = new double[source.length];
		for(int i = 0; i < source.length; i++) {
			result[i] = source[i]; // double이 size가 크기 때문에 casting이 암시적으로 일어남.
		}
		return result;
	}
	// double 배열을 int 배열로 변환
	public static int [] doubleToInt( double[] source ) {
		int[] result = new int[source.length];
		for(int i = 0; i < source.length; i++) {
			result[i] = (int)source[i]; // double이 size가 크기 때문에 casting이 암시적으로 일어남.
		}
		return result;
	}
	// int 배열 두 개를 연결한 새로운 배열 리턴
	public static int [] concat( int[] a1, int[] a2 ) {
		int[] result = new int[a1.length + a2.length];
		int index = 0;
		for(int i = 0; i < a1.length; i++) {
			//result[index] = a1[i];
			//index++;
			result[index++] = a1[i];
		}
		
		for(int i = 0; i < a2.length; i++) {
			result[index++] = a2[i];
		}
		return result;
	}


}
