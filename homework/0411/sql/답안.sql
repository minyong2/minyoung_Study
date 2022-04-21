CREATE TABLE IF NOT EXISTS customer
(
    customer_id VARCHAR(20) NOT NULL PRIMARY KEY COMMENT '고객 아이디',
    customer_name VARCHAR(20) NOT NULL COMMENT '고객 이름',
    grade VARCHAR(20) CHECK (grade IN ('브론즈', '실버', '골드', 'VIP')) COMMENT '고객 등급',
    is_use BOOLEAN COMMENT '회원 탈퇴 여부 (true: 탈퇴, false, 미탈퇴)',
    create_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '고객 등록날짜'
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS customer_history_purchase
(
    history_no BIGINT(20) AUTO_INCREMENT NOT NULL PRIMARY KEY COMMENT '히스토리 번호',
    customer_id VARCHAR(20) NOT NULL COMMENT '고객 아이디',
    cost INTEGER(4) COMMENT '비용',
    create_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '구매 날짜',
    FOREIGN KEY (customer_id) REFERENCES customer (customer_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 문제1
select customer_id,customer_name,grade from customer
where is_use = false 

-- 문제2
select  count(*) as 고객수 from customer
where date_format(create_at,'%Y-%m-%d') > '2021-12-09'; 

-- 문제3
select  c.customer_id as 고객아이디,
		c.customer_name as 고객이름, 
		h.create_at as 구매날짜, 
		h.cost as 비용 
from customer as c 
inner join customer_history_purchase as h 
on c.customer_id = h.customer_id 

-- 문제4 등록된 고객 중 한 번도 구매 이력이 없는 고객 아이디, 이름, 회원 탈퇴 여부 조회
select c.customer_id as 고객아이디, c.customer_name as 고객이름, c.is_use as 탈퇴여부 from customer as c
left join customer_history_purchase as h 
on c.customer_id = h.customer_id 
where h.cost is null 

-- 문제5 '2022-01-03'기준 고객 아이디별 구매 건수와 총 비용, 이름, 등급 조회.
select c.customer_id as 고객아이디 , count(h.customer_id) as 구매건수 ,
	   sum(h.cost) as 총비용 , c.customer_name as 이름 , c.grade as 등급
from customer as c
inner join customer_history_purchase as h 
on c.customer_id = h.customer_id 
group by c.customer_id 

-- 문제6 '2022-01-03'기준 3번 이상 구매한 고객 아이디, 이름, 등급 조회.
select c.customer_id as 고객아이디, c.customer_name as 고객이름, c.grade as 고객등급 from customer as c
left join customer_history_purchase as h 
on c.customer_id = h.customer_id 
where date_format(h.create_at, '%Y-%m-%d') = '2022-01-03' 
group by c.customer_id 
having count(h.customer_id) >= 3 

-- 문제7 고객번호가 5194998인 고객 등급을 골드로 업데이트 하시오.
update customer 
set grade = '골드'
where customer_id = 5194998

