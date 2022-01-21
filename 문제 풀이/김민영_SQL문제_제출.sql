#1번 문제
select e.ename , e.sal , d.loc from emp as e
join dept as d
on e.DEPTNO = d.DEPTNO 
where d.DNAME = 'research'

#2번 문제
select e.ENAME , e.JOB , e.SAL , d.DNAME from emp as e
join dept as d 
on e.DEPTNO = d.DEPTNO 
where comm > 0

#3번 문제
select e.ENAME , e.job, d.DNAME , d.LOC from emp as e
join dept as d 
on e.DEPTNO = d.DEPTNO 
where left(ename, 1) = 'A'

#4 사수가 없는 사람도 포함
select sawon.ename as "사원 명" , sasu.DEPTNO as "사수 번호",
sasu.ENAME as "사수 이름"  from emp as sawon
inner join emp as sasu
on sawon.mgr = sasu.MGR 

#5 사원명, 사수번호, 사수 이름을 출력
   #단, 사수가 없는 사원만
select sawon.ename, sasu.EMPNO , sasu.ENAME from emp as sawon
join emp as sasu 
on sawon.ENAME = sasu.ENAME 
where sawon.MGR is null

#6 상사번호가 7698 
select sawon.ENAME , sawon.EMPNO , sawon.mgr , sasu.ename from emp as sawon
join emp as sasu
on sawon.mgr = sasu.empno
where sawon.mgr = '7698'

#7 
select sawon.ename as "사원 이름", sawon.HIREDATE, 
sasu.ENAME as "상사 이름" , sasu.HIREDATE  from emp as sawon
join emp as sasu
on sawon.mgr = sasu.EMPNO 
where sawon.HIREDATE < sasu.HIREDATE 

#8 입사날짜가 1982년에 입사한 사원
select e.ename, e.EMPNO , e.sal, e.job, d.dname from emp as e
join dept as d 
on d.DEPTNO = e.DEPTNO 
where job = 'manager' or job = 'CLERK' 

#9 단 사원이 없는 부서도 포함 
select 
d.DEPTNO as '부서번호',d.DNAME as '부서명', sum(e.SAL) as '급여 총합'
from emp as e
right join dept as d 
on e.DEPTNO = d.DEPTNO 
group by d.DEPTNO
order by sum(e.SAL) desc


#10 ★★★
select sawon.ENAME as "사원 이름", sawon.DEPTNO as "부서 번호" , d.DNAME as "부서 명", d.LOC as "근무 지역"
from emp as sasu
join emp as sawon
on sawon.ename = sasu.ENAME 
join dept as d 
on d.DEPTNO = sawon.DEPTNO 


#11
select sawon.EMPNO as "사원 번호" ,
sawon.ENAME as "사원 이름" , sasu.EMPNO as "사수 번호" ,
sasu.ENAME as "사수 이름" , sasu.SAL as "사수 급여" , 
d.DNAME as "부서 이름", sawon.HIREDATE as "사원 입사일" from emp as sawon
join dept as d 
on d.DEPTNO = sawon.DEPTNO 
join emp as sasu 
on sawon.mgr = sasu.mgr
where d.loc = 'CHICAGO'
order by sawon.HIREDATE asc 
