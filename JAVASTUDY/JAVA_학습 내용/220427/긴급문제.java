package test;

import java.util.ArrayList;
import java.util.List;

class Chef{
	private int chefAge;

	public int getChefAge() {
		return chefAge;
	}

	public void setChefAge(int chefAge) {
		this.chefAge = chefAge;
	}
}

public class 긴급문제 {

		public static List<Chef> getChefList(){
			List<Chef> list = new ArrayList<Chef>();
			Chef chef30 = new Chef();
			chef30.setChefAge(30);
			Chef chef40 = new Chef();
			chef40.setChefAge(40);
			Chef chef50 = new Chef();
			chef50.setChefAge(50);
			Chef chef60 = new Chef();
			chef60.setChefAge(60);
			
			
			list.add(chef30);
			list.add(chef40);
			list.add(chef50);
			list.add(chef60);
			
			for(Chef chef : list) {
				System.out.println(chef.getChefAge());
			}
			
			return list;
		}
		
		//===================================================
		
		public static int getChefListCount(List<Chef> list) {
			int count=0;
			
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getChefAge() >= 50) {
					++count;
				}
			}
			System.out.println(count);
			
			return count;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("*쉐프의 나이는*");
			List<Chef> list = getChefList();
//			getChefList();
			
			
			System.out.println("*나이가 50 이상인 요리사의 수는* ");
			getChefListCount(list);
			
			
			
			//int age = getChefListCount(list); 를 해도 같은 값 출력. 
			

	}

}
