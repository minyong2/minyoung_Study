package 생성자;

public class UserVO {

	private int age;
	private String name;
	private String nickName;
	private String addr;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
////////////////////////UserVO/////////////////////////////////

package 생성자;

public class User {
	
	private int count;
	

	public boolean setUser(UserVO vo) {
		System.out.println(vo.getAddr());
		System.out.println(vo.getAge());
		System.out.println(vo.getName());
		System.out.println(vo.getNickName());
		return true;
	}
	public int getUserCount() {
		return 0;
	}
	public int updateUser(UserVO x) {
		return 0;
	}
	public int deleteUser(UserVO x) {
		return 0;
	}
	public UserVO getUser(int z) {
		return null ;
	}

}

////////////////////////User//////////////////////////////////


package 생성자;

public class UserCall {
	private User user() {
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User a  = new User();
		UserVO vo = new UserVO();
		
		vo.setAddr("대전");
		vo.setAge(24);
		vo.setName("민영");
		vo.setNickName("미뇽");
		a.setUser(vo);
		System.out.println();
		
	}

}
//////////////////////////UserCall////////////////////////////