package p_06_multiple_iterations;

//탭 문자(\t)를 사용해서, 구구단을 출력하는 코드를 작성하시오.
public class Ex3 {

	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i*j + "\t");
			}
			System.out.print("\n");
		}
	}

}
