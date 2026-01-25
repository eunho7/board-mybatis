# board-mybatis

## 참고 깃헙
https://github.com/codingrecipe1/board_springboot_mybatis?tab=readme-ov-file#table-%EC%A0%95%EC%9D%98

## table 정의
```sql
-- board_table
-- board_table
drop table if exists board_table;
create table board_table
(
    ID bigint primary key auto_increment,
    BOARD_TITLE varchar(50),
    BOARD_WRITER varchar(20),
    BOARD_PASS varchar(20),
    BOARD_CONTENTS varchar(500),
    BOARD_HITS int default 0,
    CREATED_AT datetime default now(),
    FILE_ATTACHED int DEFAULT 0
);
-- board_file_table
drop table if exists board_file_table;
create table board_file_table
(
    ID	bigint auto_increment primary key,
    ORIGINAL_FILENAME varchar(100),
    STORED_FILENAME varchar(100),
    BOARD_ID bigint,
    constraint fk_board_file foreign key(BOARD_ID) references board_table(ID) on delete cascade
);
```
