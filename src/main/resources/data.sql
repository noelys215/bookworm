delete
from user
where id = 14;

delete
from user
where id = 15;


select *
from user;

-- Users
INSERT INTO user (username, password, email, role)
VALUES ('admin', '$2a$10$BIv9MoJwh4671Eb/FockwuuNQAUXQH7Gc8DkzhvFqNTpVuwoClUP2', 'admin@example.com', 'ROLE_ADMIN'),
       ('user1', '$2a$10$KRTUSo1PDfdf1vkXbRw1eO1UoJPQrCOWrT9bcEjBqmBKdCVLFEnOe', 'user1@example.com', 'ROLE_USER');

-- Books
INSERT INTO book (title, author, genre, publication_date, isbn)
VALUES ('Spring Boot in Action', 'Craig Walls', 'Technology', '2016-01-01', '9781617292545'),
       ('Clean Code', 'Robert C. Martin', 'Technology', '2008-08-01', '9780132350884');


