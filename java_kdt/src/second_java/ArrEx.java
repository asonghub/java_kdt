package second_java;
import java.util.Arrays;
import java.util.Scanner;

public class ArrEx {
	
	public static void main(String[] args) {
		
//		int[] intArray = {1,2,3,4,5};
//		
//		for(int i = 0; i < intArray.length; i++) {
//			System.out.print(intArray[i]+ " ");
//		}
		
		Scanner  scan = new Scanner(System.in);
		int[] intArray = new int[5]; //크기가 5인 int배열 
		
		System.out.println("숫자 5개를 입력하세요");
		for( int i = 0 ; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
		}
		//Array.toString 배열의 요소를 문자열로 반환 
		System.out.println(Arrays.toString(intArray));
		System.out.println(intArray);
		
		scan.close();
	}

}
