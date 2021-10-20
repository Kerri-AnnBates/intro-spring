DELETE FROM cats;
INSERT INTO cats (catid, catname) VALUES (1, 'Tiger');
alter sequence hibernate_sequence restart with 2;