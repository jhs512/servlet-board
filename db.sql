# DB 생성
DROP DATABASE IF EXISTS am;
CREATE DATABASE am;
USE am;

# 게시물 테이블 생성
CREATE TABLE article (
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    regDate DATETIME NOT NULL,
    title CHAR(255) NOT NULL,
    `body` LONGTEXT NOT NULL
);

# 게시물 테이블 데이터 생성

INSERT INTO article 
SET regDate = NOW(),
title = '제목1',
`body` = '내용1';

INSERT INTO article 
SET regDate = NOW(),
title = '제목2',
`body` = '내용2';

INSERT INTO article 
SET regDate = NOW(),
title = '제목3',
`body` = '내용3';

# 회원 테이블 생성
CREATE TABLE `member` (
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    regDate DATETIME NOT NULL,
    loginId CHAR(100) NOT NULL UNIQUE,
    loginPw CHAR(100) NOT NULL,
    `name` CHAR(100) NOT NULL
);

# 회원 테이블 데이터 생성
INSERT INTO `member` 
SET regDate = NOW(),
loginId = 'admin',
`loginPw` = 'admin',
`name` = '관리자';

INSERT INTO `member` 
SET regDate = NOW(),
loginId = 'user1',
`loginPw` = 'user1',
`name` = '유저1';

INSERT INTO `member` 
SET regDate = NOW(),
loginId = 'user2',
`loginPw` = 'user2',
`name` = '유저2';

# 게시물 테이블에 memberId 칼럼 추가
ALTER TABLE `article` ADD COLUMN memberId INT(10) UNSIGNED NOT NULL AFTER regDate;

# 기존 게시물은 그냥 2번 회원이 전부 작성한걸로 정한다.
UPDATE article
SET memberId = 2
WHERE memberId = 0;


