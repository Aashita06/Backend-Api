
drop table if exists User;
CREATE TABLE User (
    id INT NOT NULL PRIMARY KEY,
    name VARCHAR(250) NOT NULL,
    email VARCHAR(250) NOT NULL,
    role VARCHAR(100) NOT NULL
);

drop table if exists Book;
CREATE TABLE Book (
    id INT NOT NULL PRIMARY KEY,
    book_name VARCHAR(250) NOT NULL
);

drop table if exists BookUser;
CREATE TABLE BookUser (
    bookid INT NOT NULL,
    userid INT NOT NULL,
    FOREIGN KEY (bookid) REFERENCES Book(id),
    FOREIGN KEY (userid) REFERENCES User(id),
    PRIMARY KEY (bookid, userid)
);


drop table if exists Security;
CREATE TABLE Security (
    id INT NOT NULL PRIMARY KEY,
    isin VARCHAR(100) NOT NULL,
    cusip VARCHAR(100) NOT NULL,
    issuer VARCHAR(250) NOT NULL,
    maturitydate DATE NOT NULL,
    coupon DECIMAL(10, 2) NOT NULL,
    type VARCHAR(100) NOT NULL,
    facevalue DECIMAL(10, 2) NOT NULL,
    status VARCHAR(50) NOT NULL
);

drop table if exists Counterparty;
CREATE TABLE Counterparty (
    id INT NOT NULL PRIMARY KEY,
    name VARCHAR(250) NOT NULL
);

drop table if exists Trade;
CREATE TABLE Trade (
    id INT NOT NULL PRIMARY KEY,
    bookid INT NOT NULL,
    counterpartyid INT NOT NULL,
    securityid INT NOT NULL,
    quantity INT NOT NULL,
    status VARCHAR(50) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    buysell VARCHAR(10) NOT NULL,
    Tradedate DATE NOT NULL,
    settlementdate DATE NOT NULL,
    FOREIGN KEY (bookid) REFERENCES Book(id),
    FOREIGN KEY (counterpartyid) REFERENCES Counterparty(id),
    FOREIGN KEY (securityid) REFERENCES Security(id)
);