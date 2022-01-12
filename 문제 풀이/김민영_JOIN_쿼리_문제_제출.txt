SELECT * FROM dw.emp;
-- 1번 문제
select e.ename,d.dname,e.deptno,d.loc from emp as e
join dept as d
on e.deptno = d.deptno

SELECT * FROM dw.emp;
-- 2번 문제 부서별 급여합계, 부서이름 조회
select sum(sal), d.dname from emp as e
join dept as d
on e.deptno = d.deptno
group by e.deptno

SELECT * FROM dw.emp;
-- dname 부서 이름 , loc 지역 , 3번 문제
-- 사원이름, 급여 조회
select ename, sal from emp as e
 join dept as d
 on d.deptno = e.deptno
 where d.loc = 'NEW YORK' and e.job = 'manager' 

SELECT * FROM dw.emp;
-- 4번 문제 사원이름, 부서이름,직업 조회
select ifnull(comm,100),e.ename,d.dname,e.job,date_format(HIREDATE,'%Y') from emp as e
join dept as d
on e.deptno = d.deptno

where hiredate >= '1983-01-01'