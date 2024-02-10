create table usuarios(

    id bigint not null auto_increment,
    nome varchar(30) not null,
    email varchar(100) not null unique,
    senha varchar(20) not null,
    create_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,

    primary key(id)

);