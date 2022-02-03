package 프로그래머스;

public class 평균구하기 {
//정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
//	1. 정수형 타입 배열이 파라미터에 있어야 함.
//	2. return 타입은 double.
//	3. 메소드 이름은 solution.
//	4. int형으로 나누면 소수점이 무시됩니다.
	
	public static double solution(int arr[]) {
		double answer = 0;
		double sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i]; 
		}
		answer = sum/arr.length;
		System.out.println(answer);
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4};
		solution(arr);
	}
}
