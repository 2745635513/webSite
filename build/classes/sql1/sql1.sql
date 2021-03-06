CREATE TABLE
TBL_USER
(
ID INTEGER NOT NULL
,NAME VARCHAR2(18)NOT NULL
,PASS VARCHAR2(14)NOT NULL
,QUE VARCHAR2(18)NOT NULL
,ANS VARCHAR2(28)NOT NULL
,EMAIL VARCHAR2(50)NOT NULL
,REALNAME VARCHAR2(20)NOT NULL
,SEX VARCHAR2(2)
,IDEN VARCHAR2(18)NOT NULL
,TEL VARCHAR2(11)NOT NULL
,AREA VARCHAR2(100)NOT NULL
,ADDRESS VARCHAR2(50)NOT NULL
,POST VARCHAR2(20)NOT NULL
);

ALTER TABLE
	TBL_USER
ADD CONSTRAINT
	PK_TBL_USER_ID PRIMARY KEY(ID);
	
ALTER TABLE
	TBL_USER
ADD CONSTRAINT
	UQ_TBL_USER_NAME UNIQUE(NAME);
	
CREATE SEQUENCE
	SEQ_TBL_USER_ID ;

INSERT INTO
TBL_USER
(
ID
,NAME 
,PASS 
,QUE 
,ANS 
,EMAIL 
,REALNAME 
,SEX 
,IDEN 
,TEL 
,AREA 
,ADDRESS 
,POST 
)
values
(
SEQ_TBL_USER_ID
,'A123456'
,'123456'
,'ABCDEF'
,'123456'
,'A@B.COM'
,'FRS'
,'GIRL'
,'123456789012345678'
,'12345678901'
,'AREA'
,'����'
,'116021'
);


SELECT * FROM TBL_USER;