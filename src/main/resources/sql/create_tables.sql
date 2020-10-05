USE studyabroad;

CREATE TABLE mst_user (
    id INT(11) PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(32) NOT NULL UNIQUE,
    password VARCHAR(16) NOT NULL,
    email VARCHAR(32) NOT NULL,
    area VARCHAR(16) NOT NULL,
    nation VARCHAR(16) NOT NULL,
    created_at TIMESTAMP NOT NULL default now(),
    updated_at TIMESTAMP NOT NULL default now() 
);