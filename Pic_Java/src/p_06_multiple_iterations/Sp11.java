package p_06_multiple_iterations;

import java.io.*;

public class Sp11 {
//continue 문으로 블록 시작 부분으로 돌아가기
	public static void main(String[] args) throws IOException {
		System.out.println("몇 번째 처리를 건너 뛰시겠습니까?(1-10)");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i=1; i<=10; i++) {
			if(i == res) {
				System.out.println("조건을 만족! continue를 이용해 for 문의 처음으로 갑니다.");
				continue;
			}
			System.out.println(i + "번째 처리입니다.");	//continue 문이 다음 건너뛰도록 해서 출력안됨
		}
	}

}
