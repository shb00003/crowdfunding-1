drop table member;

CREATE TABLE member
(
    `mem_idx`                 INT             NOT NULL    AUTO_INCREMENT COMMENT 'PK(고유번호)',
    `mem_type`                INT             NULL  default 0      COMMENT '회원타입(0:일반 / 1:메이커 / 2: 관리자)', 
    `mem_email`               VARCHAR(45)     NULL        COMMENT '회원 이메일 겸 아이디', 
    `mem_password`            VARCHAR(30)    NULL        COMMENT '회원 패스워드', 
    `mem_name`                VARCHAR(10)     NULL        COMMENT '회원 이름(회원이름추가-현재)', 
    `mem_phone`               VARCHAR(20)     NULL        COMMENT '전화번호', 
    `mem_birth`               INT             NULL        COMMENT '생년월일', 
    `mem_sex`                 INT             NULL        COMMENT '성별(남: 1,3,5,7/ 여:2,4,6,8)', 
    `mem_lastlogin_datetime`  DATETIME        NULL   default now()     COMMENT '최종 로그인 시간', 
    `mem_register_datetime`   DATETIME        NULL	 default now()     COMMENT '회원 등록일', 
    `mem_email_cert`          TINYINT         NULL   default 0     COMMENT '이메일 인증을 받았는지 여부', 
    
    `mem_zipcode`             INT             NULL        COMMENT '우편번호 -다음 우편번호 api', 
    `mem_address1`            VARCHAR(45)     NULL        COMMENT '집주소1 - 도로명 주소 (결제 할때 넣어줌)', 
    `mem_address2`            VARCHAR(45)     NULL        COMMENT '집주소2 - 지번주소', 
    `mem_address3`            VARCHAR(45)     NULL        COMMENT '집주소3 - 상세주소', 
    `mem_address4`            VARCHAR(45)     NULL        COMMENT '집주소4 - 참고항목', 
    `mem_photo`               VARCHAR(50)     NULL        COMMENT '회원 이미지 경로', 
    
    `session_key`             VARCHAR(50)     NULL   default 'none'     COMMENT 'session 아이디 보관', 
    `session_limit`           DATETIME       NULL        COMMENT '자동로그인 유효시간 기록', 
    PRIMARY KEY (mem_idx) 
)charset=UTF8 ;


insert into member(mem_email, mem_password, mem_name, mem_birth, mem_sex)
values('aa@aaa.com', '1234', '향숙이', '150725', '1');
insert into member(mem_email, mem_password, mem_name, mem_birth, mem_sex)
values('bb@bbb.com', '1234', '산이', '150725', '2');
insert into member(mem_email, mem_password, mem_name, mem_birth, mem_sex)
values('test2@bbb.com', '1234', '레이', '150425', '1');
insert into member(mem_type,mem_email, mem_password, mem_name, mem_birth, mem_sex)
values('2', 'test@aaa.com', '1234', '관리자1', '150731', '1');
insert into member(mem_type,mem_email, mem_password, mem_name, mem_birth, mem_sex)
values('1', 'maker1@aaa.com', '1234', '메이커1', '150831', '2');


CREATE TABLE Maker
(
    `maker_idx`       INT            NOT NULL    AUTO_INCREMENT COMMENT '메이커 id', 
    `maker_name`      VARCHAR(20)    NULL        COMMENT '이름', 
    `maker_phone`     VARCHAR(20)    NULL        COMMENT '전화번호', 
    `maker_zipcode`   INT            NULL        COMMENT '우편번호', 
    `maker_address1`  VARCHAR(45)    NULL        COMMENT '도로명주소', 
    `maker_address2`  VARCHAR(45)    NULL        COMMENT '지번주소', 
    `maker_address3`  VARCHAR(45)    NULL        COMMENT '상세주소', 
    `maker_address4`  VARCHAR(45)    NULL        COMMENT '참고항목', 
    `maker_intro`     VARCHAR(45)    NULL        COMMENT '메이커 소개', 
    `maker_photo`     VARCHAR(45)    NULL        COMMENT '메이커 이미지 경로', 
    `mem_idx`         INT            NULL        COMMENT '메이커의 개인정보 pk', 
    PRIMARY KEY (maker_idx)
);

ALTER TABLE Maker
    ADD CONSTRAINT FK_Maker_mem_idx_member_mem_idx FOREIGN KEY (mem_idx)
        REFERENCES member (mem_idx) ON DELETE RESTRICT ON UPDATE RESTRICT;

insert into maker(maker_name, maker_phone,maker_zipcode,maker_address1,mem_idx)
values('솔데스크', '02-000-0000', '12345','서울시 종로구','1' ) ;
        
insert into maker(maker_name, maker_phone,maker_zipcode,maker_address1,mem_idx)
values('가나다', '02-000-0000', '12345','서울시 종로구','2' ) ;

insert into maker(maker_name, maker_phone,maker_zipcode,maker_address1,mem_idx)
values('하하하', '02-000-0000', '12345','서울시 종로구','5' ) ;

drop table project;


CREATE TABLE project
(
    `pro_idx`       INT            NOT NULL    AUTO_INCREMENT COMMENT 'PK', 
    `pro_name`      VARCHAR(45)    NULL        COMMENT '프로젝트명', 
    `pro_type1`     TINYINT        NULL        COMMENT '1: 요청전, 2: 요청 후 대기, 3: 펀딩 진행중,  4: 펀딩 종료', 
    `pro_type2`     TINYINT        NULL        COMMENT '1: 추천펀딩, 2:인기순 3: 신규펀딩 4: 예정 펀딩', 
    `pro_summary`   VARCHAR(20)    NULL        COMMENT '프로젝트에 대한 간단한 설명', 
    `pro_content`   MEDIUMTEXT     NULL        COMMENT '프로젝트 상세 설명 (스마트 에디터)', 
    `pro_price`     INT            NULL        COMMENT '프로젝트의 목표 가격', 
    `pro_image`     VARCHAR(45)    NULL        COMMENT '프로젝트 대표 이미지', 
    `pro_datetime`  DATETIME       NULL        COMMENT '프로젝트 입력 시간', 
    `pro_category`  VARCHAR(20)    NULL        COMMENT '프로젝트 카테고리', 
    `pro_keyword1`  VARCHAR(20)    NULL        COMMENT '검색에 필요한 키워드', 
    `pro_keyword2`  VARCHAR(20)    NULL        COMMENT '검색에 필요한 키워드', 
    `pro_keyword3`  VARCHAR(20)    NULL        COMMENT '검색에 필요한 키워드', 
    `pro_start`     DATETIME       NULL        COMMENT '프로젝트 시작일', 
    `pro_end`       DATETIME       NULL        COMMENT '프로젝트 종료일', 
    `maker_idx`     INT            NULL, 
    PRIMARY KEY (pro_idx)
);


ALTER TABLE project
    ADD CONSTRAINT FK_project_maker_idx_Maker_maker_idx FOREIGN KEY (maker_idx)
        REFERENCES Maker (maker_idx) ON DELETE RESTRICT ON UPDATE RESTRICT;

    
    insert into project(pro_name, maker_idx, pro_start, pro_end, pro_type1)
    values('수공예 야옹이 인식표', '1', '2019-09-20','2019-10-20', '1');
    
    insert into project(pro_name, maker_idx, pro_start, pro_end, pro_type1)
    values('전동 삼륜자전거','2', '2019-09-20','2019-10-20', '2');
    
    insert into project(pro_name, maker_idx, pro_start, pro_end, pro_type1)
    values('칼슘 사과', '3', '2019-09-20','2019-10-20', '3');
    
    
    alter table project modify pro_type_progress TINYINT not null default 1;
	 

drop table admin;
CREATE TABLE admin
(
    `admin_id`     VARCHAR(12)    NOT NULL, 
    `admin_pw`     VARCHAR(20)    NOT NULL, 
    `admin_name`     VARCHAR(10)    NOT NULL, 
    `admin_email`  VARCHAR(40)    NOT NULL, 
    `admin_type`   TINYINT        NOT NULL default 1, 
    PRIMARY KEY (admin_id)
);

    
    
    
