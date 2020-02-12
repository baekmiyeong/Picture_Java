package p_06_multiple_iterations;

import java.io.*;

//키보드 정수를 입력받아, 그 수가 소수(1과 자기 자신으로만 나눠떨어지는 수)인지
//여부를 판단하는 코드를 작성하시오.(☆☆☆)
public class Ex5 {

	public static void main(String[] args) throws IOException {
		System.out.println("2 이상의 정수를 입력하십시오.");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		for(int i=2; i<=num; i++) {
			System.out.println("i는 " + i +", num은 " + num);
			
			if(i == num) {
				System.out.println(num + "은 소수입니다.");
			}
			else if(num % i == 0) {
				System.out.println(num + "은 소수가 아닙니다.");
				break;
			}
		}
	}

}
