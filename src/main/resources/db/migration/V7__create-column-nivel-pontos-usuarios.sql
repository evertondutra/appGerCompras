create table atacadao(

    id bigint not null auto_increment,
    nome varchar(30) not null,
    marca varchar(30) not null,
    tipo varchar(20) not null,
    quantidade_Item int not null,
    quantidade_Medida int not null,
    medida varchar(20) not null,
    quantidade_Kit int,
    preco_Cx decimal (10, 2),
    preco_Unidade decimal (10, 2) not null,
    estabelecimento varchar(50) not null,
    create_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,


    primary key(id)

);