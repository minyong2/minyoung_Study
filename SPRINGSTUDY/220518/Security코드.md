## WebSecurityConfig
```java
package com.dw.board.conf;

@Configuration
@EnableWebSecurity //웹 보안 관련된 것을 가능하게 하겠다.
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.csrf().disable()
		.formLogin().disable();
	}
}
```

```java
---service---
//학생 저장
	public int insertStudents(StudentsVO vo) {
		//학생 비밀번호 암호화
		String password = vo.getStudentsPassword();
		password = passwordEncoder.encode(password);
		vo.setStudentsPassword(password);
		return studentsMapper.insertStudents(vo);
	}
```

### @CrossOrigin 어노테이션을 붙여주면 기본적으로 '모든 도메인, 모든 요청방식' 에 대해 허용 한다는 뜻이다.