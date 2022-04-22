package user;

import java.util.List;

/**
 * @author minyoung Kim
 * @Date 2022. 4. 20.
 * comment : 유저로직 처리 클래스
 */
public class UserService implements UserServiceImple{

	@Override
	public List<UserVO> updateSal(List<UserVO> list, String dname) {
		//약한결합
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserVO> updateLv(List<UserVO> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserVO> deleteUser(List<UserVO> list, int lv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO selectUserByEname(List<UserVO> list, String ename) {
		// TODO Auto-generated method stub
		return null;
	}

}
