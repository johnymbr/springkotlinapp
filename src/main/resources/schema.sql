DROP TABLE IF EXISTS USERS;

CREATE TABLE USER (
    id INTEGER IDENTITY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(50),
    phone VARCHAR(50)
);