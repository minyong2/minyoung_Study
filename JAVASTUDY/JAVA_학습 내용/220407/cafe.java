package 상속;

class alohanoc{
	int coffee_cnt;
	int total_coffee;
	String rank;	
	
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
//		if(total_coffee > 0 && total_coffee<= 10) { //1~10
//			System.out.println("고객님의 랭크는 '브론즈'입니다.");
//		}
//		if(total_coffee >= 11 && total_coffee<=20) { //11~20
//			System.out.println("고객님의 랭크는 '실버'입니다.");
//		}
//		if(total_coffee >=21 && total_coffee<=30) { //21~30
//			System.out.println("고객님의 랭크는 '골드'입니다.");
//		}
	}

	public int getCoffee_cnt() {
		return coffee_cnt;
	}

	public void setCoffee_cnt(int coffee_cnt) {
		this.coffee_cnt = coffee_cnt;
		System.out.println("커피를 "+coffee_cnt+"잔 주문하였습니다.");
		total_coffee += coffee_cnt;
	}

	public int getTotal_coffee() {
		return total_coffee;
	}

	public void setTotal_coffee(int total_coffee) {
		this.total_coffee = total_coffee;
	}
	
	

	public void selectRank() {
		if(total_coffee > 0 && total_coffee<= 10) { //1~10
			System.out.println("고객님의 랭크는 '브론즈'입니다.");
			System.out.println("-----------------------------");
		}
		if(total_coffee >= 11 && total_coffee<=20) { //11~20
			System.out.println("고객님의 랭크는 '실버'입니다.");
			System.out.println("-----------------------------");
		}
		if(total_coffee >=21) { //21~
			System.out.println("고객님의 랭크는 '골드'입니다.");
			System.out.println("-----------------------------");
		}

	}
	public void checkTotal() {
		System.out.println("고객님의 총 주문건 수는 "+total_coffee+"잔 입니다.");
	}
}

public class cafe { //카페

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alohanoc aloha = new alohanoc();
		aloha.setCoffee_cnt(10);
		aloha.selectRank();
		aloha.setCoffee_cnt(5);
		aloha.selectRank();
		aloha.setCoffee_cnt(15);
		aloha.selectRank();
		aloha.checkTotal();
		
		
	}

}
