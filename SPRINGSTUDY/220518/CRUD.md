# CRUD

## CONTROLLER
```java
@RestController
@RequestMapping("/api/v1")
public class StudentsRestController {
	@Autowired
	private StudentsService studentsService;
	
	//학생 저장
		//post는 body로 데이터를 받는다. (왜냐? 보안때문에)
		@CrossOrigin
		@PostMapping("/student")
		public int callSaveStudents(@RequestBody StudentsVO vo) {
			return studentsService.insertStudents(vo);
		}

	//학생 조회
		@GetMapping("/student")
		public List<StudentsVO> callStudentsList(){
			return studentsService.getAllStudentsList();
		}
		
		@GetMapping("/student/map")
		public List<Map<String, Object>> callStudentsListByMap(){
			return studentsService.getStudentsListByMap();
		}
		
	//특정 학생 조회(PK로 조회)
		@GetMapping("/student/id/{id}")
		public StudentsVO callStudent(@PathVariable("id") int studentsId) {
			return studentsService.selectStudents(studentsId);
		}
		
	//특정 학생 삭제
		@DeleteMapping("/student/id/{id}")
		public int callRemoveStudents(@PathVariable("id") int studentsId) {
			return studentsService.removeStudents(studentsId);
		}
		
	// 특정 학생 수정
		@PatchMapping("/student/id/{id}")
		public int callPatchStudents(@PathVariable("id") int studentsId,
				@RequestBody StudentsVO vo) {
			return studentsService.updateStudents(studentsId, vo);
		}
}
```
## SERVICE
```java
@Service
public class StudentsService {
	
	@Autowired
	private StudentsMapper studentsMapper;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	//학생 저장
	public int insertStudents(StudentsVO vo) {
		//학생 비밀번호 암호화
		String password = vo.getStudentsPassword();
		password = passwordEncoder.encode(password);
		vo.setStudentsPassword(password);
		return studentsMapper.insertStudents(vo);
	}
	
	//학생 전체 조회
	public List<StudentsVO> getAllStudentsList(){
		return studentsMapper.selectAllStudentsList();
	}
	
	public List<Map<String, Object>> getStudentsListByMap(){
		return studentsMapper.getStudentsListByMap();
	}
	
	public StudentsVO selectStudents(int studentsId) {
		return studentsMapper.selectStudents(studentsId);
	}

	@Transactional(rollbackFor = Exception.class)
	public int removeStudents(int studentsId) {
		return studentsMapper.removeStudents(studentsId);
	}
	
	@Transactional(rollbackFor = Exception.class)
	public int updateStudents(int studentsId, StudentsVO vo) {
		vo.setStudentsId(studentsId);
		return studentsMapper.updateStudents(vo);
	}
}
```
## MAPPER
```java
package com.dw.board.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.dw.board.vo.StudentsVO;

@Mapper
public interface StudentsMapper {

	
	/**
	 * @param vo
	 * @return
	 * @author : Minyoung Kim
	 * @date : 2022. 5. 18.
	 * comment : 
	 */
	public int insertStudents(StudentsVO vo);
	
	/**
	 * @return
	 * @author : Minyoung Kim
	 * @date : 2022. 5. 18.
	 * comment : 
	 */
	public List<StudentsVO> selectAllStudentsList();
	//전체조회라서 List
	
	public List<Map<String, Object>> getStudentsListByMap();
	//Map으로 조회
	
	public StudentsVO selectStudents(int studentsId);
	
	/**
	 * @param studentsId
	 * @return
	 * @author : Minyoung Kim
	 * @date : 2022. 5. 18.
	 * comment : 특정 학생 삭제
	 */
	public int removeStudents(int studentsId);
	public int updateStudents(StudentsVO vo);
}
```
## XML
```xml
<mapper namespace="com.dw.board.mapper.StudentsMapper">
	<insert id="insertStudents">
	INSERT INTO students(
	students_name, 
	students_password
	)VALUES(
	#{studentsName},
	#{studentsPassword}
	<!-- 여긴 VO랑 똑같이 해줘야 함 -->
	)
	</insert>
	
	<select id="selectAllStudentsList" resultType="StudentsVO">
	SELECT
	students_id as studentsId,  
	students_name as studentsName,
	students_password as studentsPassword,
	create_at as createAt
	FROM students
	</select>
	
	<select id="getStudentsListByMap" resultType="Map">
	SELECT
	students_id as studentsId,  
	students_name as studentsName,
	students_password as studentsPassword,
	create_at as createAt
	FROM students
	</select>
	
	<select id="selectStudents" resultType="StudentsVO">
	SELECT
	students_id as studentsId,  
	students_name as studentsName,
	students_password as studentsPassword,
	create_at as createAt
	FROM students
	WHERE students_id = #{studentsId}
	</select>
	
	<delete id="removeStudents">
	DELETE FROM students
	WHERE students_id = #{students_id}
	</delete>
	
	<update id="updateStudents">
	UPDATE students
	SET 
		students_password = #{studentsPassword}
	WHERE students_id = #{studentsId}
	</update>

</mapper>
```
   