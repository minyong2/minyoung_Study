import java.util.Arrays;

public class 배열문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번문제 아래 배열을 선언하고, 3의배수 개수를 찾아내시오. 
		//int array[] = {3,6,9,10,1}; 
		System.out.println("1번 문제");
		int array[]= {3,6,9,10,1};
		int i;
		int count=0;
		for(i=0; i<array.length; i++) {
			if((array[i]%3)==0) {
				count++;
			}
		}System.out.println("배열에서의 3의 배수의 개수는 :"+count);
		System.out.println();

		
		//2번문제  아래 배열을 선언하고, 총 합을 구한후 평균값을 구하시오.
		System.out.println("2번 문제");
		int array2[]= {80,90,100,70,50};
		int sum=0;
		int avg =0;
		for(i=0; i<array2.length; i++) {
			sum += array2[i];
			avg = sum/array2.length;
		}
		System.out.println("총합 :"+sum +"\n평균 :"+avg);
		System.out.println();
		
		//3번 문제  아래 배열을 선언하고, 짝수를 0으로 수정하시오.
		System.out.println("3번 문제");
		
		int array3[] = {2,4,6,8,10};
		for(i=0; i<array3.length; i++) {
			if((array3[i]%2)==0) {
				array3[i] = 0;
			}System.out.println(array3[i]);
		}
		System.out.println();
		
		//4번 문제  아래 배열을 선언하고, 배열 인덱스 중 가장 큰 수를 찾아내시오.
		System.out.println("4번 문제");
		int array4[]= {5,11,2,0,7};
		int max = array4[0];
		for(i=0; i<array4.length; i++) {
			if(max < array4[i]) {
				max = array4[i];
			}
			
		}System.out.println("배열의 최댓값은"+max);
		System.out.println();
		
		//★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆
		//★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆
		//5번 문제   아래 배열을 선언하고 정렬하시오. (풀 수 있는사람만)
		System.out.println("5번 문제");
		int array5[] = {5,11,2,0,7};
		System.out.println();
		int arr=0;
		int j;
		
		//{0 2 5 7 11}가 나오게 
		//다시 풀어보기 ~~!
		for(i=1; i<array5.length; i++) { 
			for(j=0; j<array5.length-1; j++) {
				if(array5[i]<array5[j]) { 
					arr = array5[i]; 
					array5[i] = array5[j]; 
					array5[j] = arr;
				}
				for(j=0; j<array5.length; j++) {
					System.out.print(array5[j]+" ");
					System.out.println();
					
				}
			}
		
//			Arrays.sort(array5);
//			System.out.println(array5[i]);
		}
		
		
	}

}
