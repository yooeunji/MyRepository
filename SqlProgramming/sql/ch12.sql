-- 행 순번 붙이기
-- rownum이 실행되고 order by를 하기 때문에 원하는 결과가 안나온다.
select rownum, bno, btitle
from board
order by bno;

select rownum, bno, btitle
from (select bno, btitle from board order by bno);

select rownum, bno, btitle
from (select bno, btitle from board order by bno desc);

--최근 삽입된 행 5개를 가져와라
select rownum, bno, btitle
from(select bno, btitle from board order by bno desc)
where rownum<=5;

--select rownum, bno, btitle
--from(select bno, btitle from board order by bno desc)
--where rownum>11;   <-시작하자마자 이게 false다 아무데이터도 가져오지않는다.

--행의 순번이 11번~20번까지를 가져와라
select rn,bno, btitle
from( --1부터 20까지 일단 가져오기
  select rownum as rn, bno, btitle  --rownum은 where절이 false이기 전까지 순번을 매긴다.
  from(select bno, btitle from board order by bno desc)
  where rownum<=20
)
where rn>=11;

--1페이지에10개씩 구성하고, n번째 페이지를 가져와라
select rn,bno, btitle
from( --1부터 20까지 일단 가져오기
  select rownum as rn, bno, btitle  --rownum은 where절이 false이기 전까지 순번을 매긴다.
  from(select bno, btitle from board order by bno desc)
  where rownum<=(n*10)
)
where rn>=((n-1)*10+1);
