package test;

import java.util.ArrayList;
import java.util.List;

class Lunch{
	private List<String> foodName;

	public List<String> getFoodName() {
		return foodName;
	}

	public void setFoodName(List<String> foodName) {
		this.foodName = foodName;
	}

	
}

public class 긴급점검3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("우동");
		list.add("스바라시라멘");
		
		Lunch lunch1 = new Lunch();
		lunch1.setFoodName(list);
		
		
		//포이치 해서 출력
		for(String lunch:lunch1.getFoodName()) {
			System.out.println(lunch);
			
		}

	}

}
