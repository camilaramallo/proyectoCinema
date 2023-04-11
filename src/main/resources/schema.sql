drop table if exists pelicula;
create table pelicula
(
   id integer not null auto_increment,
   anioEstreno integer,
   disponible boolean,
   duracion integer,
   nombre varchar(255) not null,
   tituloOriginal varchar(255) not null,

   primary key(id)
);