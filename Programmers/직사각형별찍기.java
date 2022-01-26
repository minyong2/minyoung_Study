package 프로그래머스;

import java.util.Scanner;

public class 직사각형별찍기 {
	//이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
	//별(*) 문자를 이용해 가로의 길이가 n
	//세로의 길이가 m인 직사각형 형태를 출력해보세요.
	//NxM
	
//	1. n과 m은 각각 1000 이하인 자연수입니다.
//	2. System.out.print()를 사용하면 가로로 출력됩니다.(한줄로 쭉 작성)
//	3. System.out.println()는 개행문자(엔터를 입력한 것 처럼).
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=0;
		if(a <=1000) {
			a = sc.nextInt();			
		}
		if(b <=1000) {
		 b = sc.nextInt();
		}
		
		for(int j=0; j<b; j++) {
			System.out.println();
			for(int i=0; i<a; i++) {
				System.out.print("*");
			}
		}
		

	}

}