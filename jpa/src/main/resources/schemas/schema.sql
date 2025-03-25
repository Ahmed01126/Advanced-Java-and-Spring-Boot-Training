CREATE TABLE IF NOT EXISTS student
(
    id           UUID PRIMARY KEY,
    name         VARCHAR(50)         NOT NULL,
    email        VARCHAR(100) UNIQUE NOT NULL,
    age          INTEGER             NOT NULL,
    degree       FLOAT,
    phone_number VARCHAR(13)         NOT NULL
);

CREATE TABLE IF NOT EXISTS address
(
    id               UUID PRIMARY KEY,
    apartment_number INTEGER NOT NULL,
    home_number      INTEGER NOT NULL,
    street           VARCHAR NOT NULL,
    city             VARCHAR NOT NULL,
    state            VARCHAR NOT NULL,
    country          VARCHAR NOT NULL
);

ALTER TABLE student
    ADD COLUMN address_id UUID REFERENCES address (id);
