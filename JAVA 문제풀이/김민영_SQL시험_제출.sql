#1번
select ENAME as "직원 이름" , job as "직업" from emp 
where job = 'manager'
 
#2번
select job as"직업" ,avg(SAL) as"평균 급여" from emp 
where job = 'manager'

#3번
select * from emp 
where comm is not null and job = 'salesman'

#4번
select * from emp 
where DEPTNO = 20 and SAL > 2000

#5번 BRIAN이 이미 있어서 BRIAN~으로 했습니다 ..!
update emp 
set ENAME = 'BRIAN~'
where EMPNO = 7369



#6번
select
e.ENAME as "직원 이름",
e.SAL as"급여 "  ,d.LOC as"근무 지역"
from emp as e
join dept as d 
where d.DNAME = 'research'

#7번
select e.ENAME as"직원 이름", e.SAL as"급여" from emp as e
join dept as d 
where d.LOC = 'new york' and job = 'manager'
	  
#8번	  
select 
won.ENAME as"사원 이름" , won.HIREDATE as"사원 입사일" ,
boss.ENAME as"상사 이름", boss.HIREDATE as"상사 입사일"
from emp as won
join emp as boss 
on won.mgr = boss.EMPNO 
where won.HIREDATE < boss.HIREDATE 

#9번
select e.DEPTNO as "부서 번호" , sum(sal) as "급여 합계"from emp as e
join dept as d 
on e.DEPTNO = d.DEPTNO 
where e.DEPTNO = 10 or e.DEPTNO = 30
group by e.DEPTNO 
having sum(sal) > 5000

#10번
select 
won.ENAME as "사원 번호" , won.ENAME as "사원 이름" , won.HIREDATE as "사원 입사일"
,d.DNAME as "부서 명" , boss.EMPNO as "상사 번호" , boss.ENAME as "상사 이름",
boss.SAL as "사수 급여" 
from emp as won
join emp as boss 
on won.mgr = boss.EMPNO 
join dept as d 
on won.DEPTNO = d.DEPTNO 
where d.LOC = 'chicago' and boss.SAL < 5000
order by won.HIREDATE asc 

#11번
select job as "직책",sum(SAL) as "급여 합계" , avg(SAL) as "평균 급여" from emp 
where job != 'manager'
group by job
having avg(SAL) > 1000

#12번....
b > f > a > e > c > d
