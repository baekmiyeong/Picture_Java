package p_06_multiple_iterations;

//화면에 출력하는 코드를 작성하시오.
//*
//**
//***
//****
//*****
public class Ex4 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
