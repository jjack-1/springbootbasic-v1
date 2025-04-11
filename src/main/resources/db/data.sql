insert into user_tb(username, password, email, created_at)
values ('ssar', '1234', 'ssar@nate.com', now());
insert into user_tb(username, password, email, created_at)
values ('cos', '1234', 'cos@nate.com', now());

insert into board_tb(title, user_id, created_at)
values ('제목1', 1, now());
insert into board_tb(title, content, user_id, is_public, created_at)
values ('제목2', 1, now());
insert into board_tb(title, content, user_id, is_public, created_at)
values ('제목3', 2, now());

