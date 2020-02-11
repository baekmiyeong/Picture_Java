package p_05_case_by_case_processing;

import java.io.*;

public class Sp8 {
//조건 연산자 사용하기(? :)
	public static void main(String[] args) throws IOException {
		System.out.println("몇 번째 코스를 선택 하시겠습니까?");
		System.out.println("정수를 입력하십시오.");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		//--if문을 사용한 조건 판단문--//
		/*char ans;
		if(res == 1)
			ans = 'A';
		else
			ans = 'B'; */
		
		//--조건 연산자(? :)를 사용한 조건 판단문--//
		char ans = (res == 1)? 'A':'B';
		
		System.out.println(ans + "코스를 선택했습니다.");
	}

}
