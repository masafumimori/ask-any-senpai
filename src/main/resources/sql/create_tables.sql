CREATE TABLE mst_user (
    id int(11) PRIMARY KEY AUTO_INCREMENT,
    user_name varchar 32 NOT NULL UNIQUE,
    password varchar 16 NOT NULL,
    email varchar 32 NOT NULL,
    area varchar 50 NOT NULL,
    nation varchar 100 NOT NULL
);