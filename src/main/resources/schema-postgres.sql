CREATE SCHEMA IF NOT EXISTS digicode;

drop table if exists
    digicode.departments, digicode.users,
    digicode.tasks, digicode.comments,
    digicode.attachments
    cascade;

create table digicode.departments
(
    id   int generated always as identity,
    name varchar(20) not null,
    primary key (id)
);


create table digicode.users
(
    id            int generated always as identity,
    name          varchar(40) not null,
    department_id int         not null,
    primary key (id)
);

alter table digicode.users
    add constraint userHasAssignedDepartment_fk foreign key (department_id)
        references digicode.departments (id)
        on delete set null on update cascade;



create table digicode.tasks
(
    id               int generated always as identity,
    date_created     timestamp default null,
    theme            varchar(100) not null,
    description      varchar(100),
    author_id        int,
    assigned_user_id int,
    status           varchar(20) not null,
    primary key (id)
);

alter table digicode.tasks
    add constraint taskHasAuthor_fk foreign key (author_id)
        references digicode.users (id)
        on delete set null on update cascade;

alter table digicode.tasks
    add constraint taskHasAssignedUser_fk foreign key (assigned_user_id)
        references digicode.users (id)
        on delete set null on update cascade;


create table digicode.comments
(
    id      int generated always as identity,
    task_id int,
    user_id int,
    comment varchar(100) not null,
    primary key (id)
);

alter table digicode.comments
    add constraint commentAddedToTask_fk foreign key (task_id)
        references digicode.tasks (id)
        on delete cascade on update cascade;

alter table digicode.comments
    add constraint commentHasCreator_fk foreign key (user_id)
        references digicode.users (id)
        on delete set null on update cascade;


create table digicode.attachments
(
    id      int generated always as identity,
    task_id int,
    blob    bytea,
    primary key (id)
);

alter table digicode.attachments
    add constraint attachmentHasAddedToTask_fk foreign key (task_id)
        references digicode.tasks (id)
        on delete cascade on update cascade;