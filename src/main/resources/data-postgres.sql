INSERT INTO digicode.departments(name)
VALUES ('development'),
       ('qa'),
       ('integration');

INSERT INTO digicode.users(name, department_id)
VALUES ('Adam Sandler', 1),
       ('Vladyslav Zakharzhevskyi', 1),
       ('Wes Anderson', 1),
       ('Lucianno Pavorotti', 2),
       ('Tom Waits', 2),
       ('Burbeck', 2),
       ('Patricia Silveron', 3),
       ('Diana Way', 3),
       ('Barbara Stoun', 3);

INSERT INTO digicode.tasks(date_created, theme, description, author_id, assigned_user_id, status)
VALUES (now(), 'Initialize project ig Git', 'First stage', 2, 2, 'FINISHED'),
       (now(), 'Create DTO and Controller', 'Second stage', 2, 2, 'FINISHED'),
       (now(), 'Create DB structure with optional (docker-compose file)', 'Third stage', 2, 2, 'FINISHED'),
       (now(), 'Add Docker container itself', 'Third stage', 2, 2, 'NEW'),
       (now(), 'Create Services and DAO layers', 'Fourth stage', 2, 2, 'NEW'),
       (now(), 'Create Hibernate entities', 'Fourth stage', 2, 2, 'NEW'),
       (now(), 'Write Tests', 'Fifth stage', 2, 2, 'NEW'),
       (now(), 'Optional (add Elasticsearch)', 'Sixth stage', 2, 2, 'NEW'),
       (now(), 'Send link to github repo', 'Seventh stage', 2, 2, 'NEW'),
       (now(), 'Simultaneously interviews processing', '', 2, 2, 'IN_PROGRESS'),
       (now(), 'Write documentation', '', 1, 3, 'NEW');

INSERT INTO digicode.comments(
    task_id, user_id, comment)
VALUES (1, 2, 'Completed'),
       (2, 3, 'Use encrypted password');

INSERT INTO digicode.attachments(
    task_id, blob)
VALUES (1, 'daf438uf9vnapdi490qroiqjgiahpju90d');