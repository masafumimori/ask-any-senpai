USE studyabroad;

CREATE TABLE mst_user (
	id INT(11) PRIMARY KEY AUTO_INCREMENT,
	user_name VARCHAR(32) NOT NULL UNIQUE,
	password VARCHAR(16) NOT NULL,
	email VARCHAR(32) NOT NULL,
	area VARCHAR(16),
	nation VARCHAR(16),
	purpose VARCHAR(16),
	created_at TIMESTAMP NOT NULL default now(),
	updated_at TIMESTAMP NOT NULL default now() 
);

CREATE TABLE mst_user_sns (
	id INT(11) PRIMARY KEY AUTO_INCREMENT,
	user_id INT(11) NOT NULL,
	user_name VARCHAR(32) NOT NULL UNIQUE,
	twitter VARCHAR(50),
	instagram VARCHAR(50),
	facebook VARCHAR(50),
	created_at TIMESTAMP NOT NULL default now(),
	updated_at TIMESTAMP NOT NULL default now(),
	FOREIGN KEY(user_id) REFERENCES mst_user(id)
);

CREATE TABLE inquiry (
	id INT(11) PRIMARY KEY AUTO_INCREMENT,
	subject  VARCHAR(20) NOT NULL,
	name VARCHAR(32) NOT NULL,
	email VARCHAR(32) NOT NULL,
	content VARCHAR(255) NOT NULL
)
