package test;

import java.util.ArrayList;
import java.util.List;

class Lunch{
	private String foodName;

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
}

public class 긴급점검3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Lunch> list = new ArrayList<Lunch>();
		Lunch l = new Lunch();
		l.setFoodName("칼국수");
		
		Lunch l2 = new Lunch();
		l2.setFoodName("스바라시 라멘");
		list.add(l);
		list.add(l2);
		
		//포이치 해서 출력
		for(Lunch lunch : list) {
			System.out.println(lunch.getFoodName());
		}

	}

}
