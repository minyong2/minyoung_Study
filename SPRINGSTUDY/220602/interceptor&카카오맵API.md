### interceptor
```
사용자가 요청(URL)을 서버에 보낼 때 마다
중간에 요청을 가로챌 수 있음
```
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