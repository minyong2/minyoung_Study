package user;

import java.util.List;

public interface UserServiceImple {

	/**
	 * @param list
	 * @param dname
	 * @return List
	 * @date : 2022. 4. 20.
	 * @author : minyoung Kim
	 */
	public List<UserVO> updateSal(List<UserVO> list, String dname);
	public List<UserVO> updateLv(List<UserVO> list);
	public List<UserVO> deleteUser(List<UserVO> list, int lv);
	public UserVO selectUserByEname(List<UserVO> list, String ename);
}
