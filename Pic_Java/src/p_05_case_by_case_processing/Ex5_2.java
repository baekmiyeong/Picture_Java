package p_05_case_by_case_processing;

import java.io.*;

//키보드로 1~5까지 5단계 성적을 입력받은 후, 경우에 따라 다음과 같은 메시지를 출력하게 하시오.(switch 문 사용)
//1 => 노력합시다. 
//2 => 조금 더 노력합시다. 
//3 => 더 높은 점수를 목표로 합시다. 
//4 => 매우 잘했습니다. 
//5 => 매우 우수합니다.
public class Ex5_2 {

	public static void main(String[] args) throws IOException {
		System.out.println("정수를 입력하십시오.");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		switch(res) {
		case 1:
			System.out.println("노력합시다.");
			break;
		case 2:
			System.out.println("조금 더 노력합시다.");
			break;
		case 3:
			System.out.println("더 높은 점수를 목표로 합시다.");
			break;
		case 4:
			System.out.println("매우 잘했습니다.");
			break;
		case 5:
			System.out.println("매우 우수합니다.");
			break;
		}
	}

}
