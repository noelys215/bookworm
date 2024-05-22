SET FOREIGN_KEY_CHECKS = 0;

TRUNCATE TABLE user;
TRUNCATE TABLE books;

UPDATE user
SET role = 'admin'
WHERE user.username = 'testuser';

select *
from user;

