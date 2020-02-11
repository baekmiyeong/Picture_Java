package p_04_expression_operator;

import java.io.*;

//키보드로 사각형의 한 변의 길이를 정수로 입력받아 넓이를 구하시오
//정사각형의 한 변의 길이를 입력하십시오. 3 => 정사각형의 넓이는 9입니다.
//정사각형의 넓이 = 한 변의 길이 * 한 변의 길이
public class Ex3 {

	public static void main(String[] args) throws IOException {
		System.out.println("정사각형의 한 변의 길이를 입력하십시오.");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));	
		String str = br.readLine();	
		int length = Integer.parseInt(str);
		//int area = length * length;        //넓이
		
		System.out.println("정사각형의 넓이는 " + (length * length) + "입니다.");
		                                     //넓이값 저장한 area
	}

}
