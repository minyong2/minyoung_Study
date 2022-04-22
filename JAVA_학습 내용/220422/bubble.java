package onetwothreefour;

public class bubblebubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {9,6,7,3,5};
		boolean isChange = false; //회전여부 판단
		//4회전
		//1회전 : 배열값 네 번 체크 (최솟값을 찾자!)
		
		for(int i=0; i<(array.length-1); i++) {
			int min = array[i]; //0번째 원소를 초기값으로 세팅
			int index = 0;
			for(int j=i+1; j<array.length; j++) {
				int jIndex = array[j];
				if(min > array[j]) {
					min = jIndex;
					index = j;
					isChange = true; //최솟값이 있음.
				}
				
			}
			if(isChange) {
				int temp = array[i];
				array[i] = min;
				array[index] = temp;
			}
			if(!isChange) break; //최솟값이 없다고 판단 , 정렬되어 있음.
		
		}
		

	}

}
