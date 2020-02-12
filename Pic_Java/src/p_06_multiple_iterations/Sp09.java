package p_06_multiple_iterations;

import java.io.*;

public class Sp09 {
//break 문으로 블록에서 빠져나가기
	public static void main(String[] args) throws IOException {
		System.out.println("몇 번째에서 루프를 빠져 나가시겠습니까?(1-10)");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i=1; i<=10; i++) {                         //원래는 10번 반복되어야 하지만
			System.out.println(i + "번째 처리입니다.");
			if(i == res) {                             //키보드로 입력한 숫자만큼 반복되면 탈출
				System.out.println("조건을 만족! ");
				break;
			}
		}
		System.out.println("break를 이용해 빠져나왔습니다!!");
	}

}
