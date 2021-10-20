CREATE TABLE CATS (catid int, catname varchar(255));
DELETE FROM CATS;
INSERT INTO CATS (catid, catname) VALUES (1, 'Tiger');
alter sequence hibernate_sequence restart with 15;