### `interceptor`
```
사용자가 요청(URL)을 서버에 보낼 때 마다
중간에 요청을 가로챌 수 있음

사용자 ===== 요청 ===== > 서버
              ↑  (여기서 인터셉트!)
              :컨트롤러마다 ip메소드를 적어주지 않아도 가능!\
```
```java
com.dw.board.interceptor / interceptor.java
* ip 메소드


@Component
public class Interceptor implements HandlerInterceptor{

	//preHandle : 컨트롤러에 도착하기 전에 요청을 가로채는 함수
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		String url = request.getRequestURI();
		String ip = request.getHeader("X-Forwarded-For");
		if(ip == null) ip = request.getRemoteAddr();
		System.out.println("접속한 아이피 ==> "+ip);
		System.out.println("요청 받은 URL ==>" + url);
		return true;
	}
```
이 아이들은 무슨 역할?
```java
com.dw.board.interceptor / interceptor.java


	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}
	
```

---


```
카카오맵 api 
카카오 개발자에 들어가서 key를 발급받는다.

카카오맵 웹 -> 샘플 -> 원하는 것 선택 후
아래 코드를 복사해 각 위치에 넣어준다.
키 입력 위치에 알맞은 키도 입력해주면 됨.


<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=키입력칸"></script>
//카카오맵 
         var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
            mapOption = { 
                center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
                level: 3 // 지도의 확대 레벨
            };

        var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

        // 마커가 표시될 위치입니다 
        var markerPosition  = new kakao.maps.LatLng(33.450701, 126.570667); 

        // 마커를 생성합니다
        var marker = new kakao.maps.Marker({
            position: markerPosition
        });
        // 마커가 지도 위에 표시되도록 설정합니다
        marker.setMap(map);
    }
```
```

```