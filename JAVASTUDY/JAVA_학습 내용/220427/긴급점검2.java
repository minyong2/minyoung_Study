package test;

import java.util.ArrayList;
import java.util.List;

class Food{
	private String foodName;

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	public void print() {
//		System.out.println(this.foodName);
	}



	
}

public class 긴급점검2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] array = {1,2,3,4,5};
		
		//배열 ! 배열하고 다르게 길이를 유동적으로 컨트롤
		//컬렉션 중 list
		//1. list안에 데이터 타입 확인
		List<Food> list = new ArrayList<Food>();
		//2. 클래스 타입이면 클래스를 호출해준다. (String 제외)
		Food f = new Food();
		//3. 호출한 클래스를 list에 담는다.
		f.setFoodName("김치우동");
		list.add(f); //set한 것을 리스트에 추가 함


		//방법1. 클래스에서 사용하고싶은 메소드가 많을때
		Food f2 = new Food();
		f2.setFoodName("우동");
		f2.print();
		list.add(f2);
		//방법2. 얘는 1개밖에 못씀
		list.add(new Food());
		
		
//		Food f3 = list.get(0);
		
		//-------------------------------
//		new Food().setFoodName("우동");
//		new Food().setFoodName("우동");
//		new Food().setFoodName("우동");
		//이 3개는 각각 다른것.
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).getFoodName());
//		}
		
		for(Food food : list) { //== Food f3 = list.get(0); (get생략됨!!)
			System.out.println("ㅇ"+food.getFoodName());
		}
	}

}
