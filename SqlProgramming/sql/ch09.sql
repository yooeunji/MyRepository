--Section04 유일한 값만 허용하는 UNIQUE제약 조건
drop table member;
create table member(
  mid varchar(10) unique not null,
  mname varchar(10) not null,
  mage number(3, 0) null,
  email char(50) unique null,
  mbirth date null);
  
  insert into member values('user1', '사용자1', 25, 'user1@sw.com', sysdate);
  insert into member values('user2', '사용자1', 25, 'user2@sw.com', sysdate);
  insert into member values('user3', '사용자1', 25, null, sysdate);
  insert into member values('user4', '사용자1', 25, null, sysdate);  --널은 값이 아니다.
  
  --Section06 데이터 구분을 위한 PRIMARY KEY제약조건
  --unique + not null
  --한테이블 당 1개만 설정 가능
  --행을 구별하는 식별값으로 사용
  
  drop table member;
  create table member(
  mid varchar(10) primary key,  --mid가 식별값으로 쓰이겠구나(디폴트가 not null이다)
  mname varchar(10) not null,
  mage number(3) null,
  email char(50) unique not null,  --not null을 생략하면 디폴트인 null로 인식 
  mbirth date null);
  
  --section 07 참조 무결성을 위한 FOREIGN KEY제약조건
  --외부 테이블의 PK값만 입력할수 있도록함
drop table board;

  create table board(
  bno NUMBER(10) primary key,
  btitle VARCHAR(100) not null,
  bcontent VARCHAR(4000) not null,
  bwriter VARCHAR(10) references member(mid) , --mid가 FOREIGN KEY는 아니다, FROEIN키는 외부의 PK값을 가져와서 넣겠다는 값, 그러므로 포린은 널이될수없다. 
  bhitcount NUMBER(5) null,
  bdate DATE null
  );
  
  insert into board values(1, '제목1', '내용1', 'user1', 0, sysdate); 
  insert into board values(2, '제목2', '내용2', 'user1', 0, sysdate);
  
  
  --Section08 CHECK 제약조건
  drop table board;
  drop table member;
  create table member(
  mid varchar(10) primary key,  --mid가 식별값으로 쓰이겠구나(디폴트가 not null이다)
  mname varchar(10) not null,
  mage number(3) check(mage>=0 and mage<150), 
  msex varchar(4) check(msex in ('남자', '여자')),
  email char(50) unique null,  --not null을 생략하면 디폴트인 null로 인식 
  mbirth date null);
  
  insert into member values('user1', '사용자1', 25, '남자', 'user1@sw.com', sysdate);
  insert into member values('user2', '사용자1', 100,'여자', null, sysdate);
  insert into member values('user3', '사용자1', 50, null, null, sysdate);
  insert into member values('user4', '사용자1', 20, '중성', null, sysdate);
  
--Section 09 DEFALUT 제약조건
 drop table board;
 
create table board(
  bno NUMBER(10) primary key,
  btitle VARCHAR(100) not null,
  bcontent VARCHAR(4000) not null,
  bwriter VARCHAR(10) not null , --mid가 FOREIGN KEY는 아니다, FROEIN키는 외부의 PK값을 가져와서 넣겠다는 값, 그러므로 포린은 널이될수없다. 
  bhitcount NUMBER(5) default 0,
  bkind varchar(15) default '자유',
  bdate DATE null
  );
  
 insert into board values(1, '제목1', '내용1', 'user1', 0, '자유' ,sysdate); 
 insert into board values(2, '제목1', '내용1', 'user2', default, default ,sysdate);
 insert into board(bno, btitle, bcontent, bwriter) values(3, '제목3', '내용3', 'user3');
 
 --Section05 컬럼 레벨로 제약조건 설정
 drop table board;
 drop table member;
 
 create table member(
  mid varchar(10) constraint pk_member_mid primary key,
  mname varchar(10) constraint ch_member_mage check(mage>=0 and mage<150)
 );
create table board(
  bno number(10) constraint pk_board_bno primary key,
  bwriter varchar(10)constraint fk_board_bwriter references member(mid));
 
 
 --Section10 table 레벨로 제약조건 설정
 create table member(
  ssn1 varchar(6) not null,
  ssn2 varchar(7) not null,
  mage varchar(10) not null,
  constraint pk_member_ssn primary key(ssn1, ssn2),
  constraint ch_member_mage check(mage>=0 and mage<150));
  
   create table board(
  bno number(10),
  bwriter varchar(10),
  constraint pk_board_bno primary key(bno),
  constraint fk_board_bwriter foreign key(bwriter) references member(mid)   --foreign 키에 대한 명시가 들어가야한다.
  );
  
  --Section11 제약조건 변경하기
  --11.1 제약 조건 추가하기
  drop table member;
  create table member(
    ssn1 varchar(6) not null,
    ssn2 varchar(7) not null,
    mage varchar(10) not null
    );
    alter table member
    add constraint pk_member_ssn primary key(ssn1, ssn2);
    alter table member
    add constraint ch_member_mage check(mage>=0 and mage<150);
    
  create table board(
  bno number(10),
  bwriter varchar(10));
  alter table member
  add constraint pk_board_bno primary key(bno);
  
  alter table member
  add constraint fk_board_bwriter foreign key(bwriter) references member(mid);
    
    --11.3 제약조건 제거하기 
 create table member(
    ssn1 varchar(6) not null,
    ssn2 varchar(7) not null,
    mage varchar(10) not null,
  constraint pk_member_ssn primary key(ssn1, ssn2),
  constraint ch_member_mage check(mage>=0 and mage<150));
  
 
 
  alter table member drop primary key;  --테이블당 하나니까 콜롬명안줘도된다
  alter table member drop constraint ch_member_mage;  --한테이블의 체크제약은 여러개니까 이름이 들어가야한다.
  
  --Section12 제약조건의 비활성화와 CASCADE
drop table board;
drop table member;
 
 create table member(
  mid varchar(10) constraint pk_member_mid primary key,
  mage varchar(10) constraint ch_member_mage check(mage>=0 and mage<150)
  );
  
  create table board(
  bno number(10) constraint pk_board_bno primary key,
  bwriter varchar(10)constraint fk_board_bwriter references member(mid)
  );
  
  --제약조건의 비활성화
  alter table board disable primary key;
  alter table board enable primary key;
  
  alter table member disable primary key cascade; --참조하고 있는 모든 테이블이 비활성화가 된다. 다시 활성화 할때는 참조하고있는 포린키는 하나하나활성화시켜준다.
  alter table member enable primary key;
  alter table board enable constraint fk_board_bwriter;
  
  
    
  
  