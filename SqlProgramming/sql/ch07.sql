--Section01 테이블 구조를 만드는 CREATE TABLE문
create table member(   --VARCHAR는 길이가 들쑥날쑥한 데이터를 저장하는데 쓴다
  mid VARCHAR(10) not null,     --고정된 길이의 데이터를 저장할때는 CHAR(ex.주민등록번호)
  mname VARCHAR(10) not null,  -- 낫널=>값이 없을수없다
  mage NUMBER(3,0) null,   --널=> 없어도된다
  mbirth DATE
);

create table board(
  bno NUMBER(10),
  btitle VARCHAR(100) not null,
  bcontent VARCHAR(4000) not null,
  bwriter VARCHAR(10) not null,
  bhitcount NUMBER(5)null,
  bdate DATE null
  );
  
  --Section02 테이블 구조를 변경하는 ALTER TABLE 문
  alter table member add email varchar(100) null;
  alter table member modify email varchar(50);
  alter table member drop column email;
  
  --Section03 테이블 명을 변경하는 RENAME문
  alter table member2 rename to member;
  
  --Section04 테이블 삭제하는 DROP TABLE문
  drop table member;
  drop table board;