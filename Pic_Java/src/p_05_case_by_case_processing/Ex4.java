package p_05_case_by_case_processing;

import java.io.*;

//키보드로 정수 값을 입력받은 후, 다음과 같은 메시지를 출력하게 하시오.
//값이 0~10인 경우 => 정답입니다.
//그렇지 않은 경우 => 오답입니다.
public class Ex4 {

	public static void main(String[] args) throws IOException {
		System.out.println("0 에서 10까지의 수를 입력하십시오.");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if(res >= 0 && res <= 10)
			System.out.println("정답입니다.");
		else
			System.out.println("오답입니다.");
	}

}
