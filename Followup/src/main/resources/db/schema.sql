
CREATE TABLE FOLLOWUPPERSON(
    personId         Long     NOT NULL PRIMARY KEY,
    name             VARCHAR(32),
    phone            Long

);

CREATE TABLE Persons  (

    id            Long           NOT NULL PRIMARY KEY,
    name          varchar(35),
    address       varchar(250),
    email         varchar(30),
    phoneNumber   Long,
    prayerRequest varchar(250),
    address       TEXT,
    AssignTo      INTEGER           NOT NULL REFERENCES FOLLOWUPPERSON(personId) ON DELETE CASCADE,
    PRIMARY KEY (id),
    FOREIGN KEY (personId) REFERENCES FOLLOWUPPERSON(personId)
);

