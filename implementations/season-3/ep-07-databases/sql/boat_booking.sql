DROP DATABASE IF EXISTS boat_booking;
CREATE DATABASE boat_booking;
\c boat_booking;

CREATE TABLE sailors(
    sailor_id INTEGER,
    sailor_name VARCHAR(15),
    rating NUMERIC(4,2),
    age INTEGER,
    PRIMARY KEY (sailor_id)
);

CREATE TABLE boats(
    boat_id INTEGER,
    boat_name VARCHAR(15),
    color VARCHAR(15),
    PRIMARY KEY (boat_id)
);

CREATE TABLE reservations(
    sailor_id INTEGER, 
    boat_id INTEGER, 
    day DATE,
    PRIMARY KEY (boat_id, day),
    FOREIGN KEY (sailor_id) REFERENCES sailors(sailor_id),
    FOREIGN KEY (boat_id) REFERENCES boats(boat_id)
);

