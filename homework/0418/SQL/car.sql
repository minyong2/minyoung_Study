

-- 차량 수 조회
select count(*) as 차량의수 from car_information

-- 차량에 부착된 디바이스 uuid, battery, create_at 조회.
select car_info.device_uuid as uuid ,
	   d.battery as 배터리,
	   car_info.create_at 
from car_information car_info
right join devices d
on d.device_uuid = car_info.device_uuid 


-- UUID '20130099', 배터리 100, 펌웨어 버전 '1.0.1', 사용여부 TRUE인 디바이스를 devices에 등록하시오.
insert into devices (device_uuid, battery, firmware_ver, is_use)
values ('20130099',100,'1.0.1',true)

-- 2022-04-11 이후 탈착 이벤트가 1건 이상 발생된 UUID, 펌웨어 버전 조회.
select d.device_uuid ,d.firmware_ver from car_event_log l
right outer join devices d 
on 
where date_format(l.create_at, '%Y-%m-%d') >= '2022-04-11' 

--

select 
	d.device_uuid,
	d.firmware_ver
from devices as d
inner join car_information as ci
on d.device_uuid = ci.device_uuid
inner join car_event_log as cel
on ci.car_number = cel.car_number
where 
	date_format(cel.create_at, '%Y-%m-%d')  >= '2022-04-11'
	and cel.event_type = '3'
group by d.device_uuid

-- 2022-04-11 ~ 2022-04-13 일별 이벤트 카운트 조회.
select count(l.log_srl) from car_event_log l
where date_format(l.create_at,'%Y-%m-%d') between '2022-04-11' and '2022-04-13' 	

-- 전체 디바이스 수, 차량에 부착된 디바이스 수, 차량에 부착하지 않은 디바이스 수 조회.
select count(d.device_uuid) as 전체디바이스수, count(car_info.device_uuid) as 부착된디바이스수 from devices d
left join car_information car_info
on d.device_uuid = car_info.device_uuid

-- 차량번호 '359서 9096'의 2022-04-11 ~ 2022-04-13일까지 이벤트별 카운트 조회
select count(l.car_number) as 이벤트카운트 from car_event_log l
where l.car_number = '359서 9096' and date_format(create_at,'%Y-%m-%d') between '2022-04-11' and '2022-04-13'

-- UUID가 '20133344'인 디바이스의 2022-04-11 ~ 2022-04-13에 발생한 이벤트타입, 이벤트 날짜, 차량번호판, 담당자 조회.
select car_info.device_uuid as UUID,
       l.event_type as 이벤트타입, 
	   l.create_at as 이벤트날짜,
	   l.car_number as 차량번호판,
	   car_info.admin_name as 담당자
from car_event_log l
left join car_information car_info
on l.car_number = car_info .car_number 
where car_info.device_uuid = '20133344' and date_format(l.create_at,'%Y-%m-%d') between '2022-04-11' and '2022-04-13'
