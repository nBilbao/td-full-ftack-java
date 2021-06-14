use amigos;

-- 1.- Devuelva a todos los usuarios que son amigos de Kermit, asegúrese de que sus nombres se muestren en los resultados.
select * from users;
select * from friendships;

select u.first_name, u.last_name, user2.first_name, user2.last_name
from users as u 
left join friendships as fi on (u.id = fi.user_id)
left join users as user2 on (user2.id = fi.friend_id)
where u.id = 4;

-- 2.- Devuelve el recuento de todas las amistades.

select u.first_name, u.last_name, user2.first_name, user2.last_name
from users as u 
left join friendships as fi on (u.id = fi.user_id)
left join users as user2 on (user2.id = fi.friend_id);

-- 3.- Descubre quién tiene más amigos y devuelve el recuento de sus amigos.

select u.first_name as nombre, count(u.first_name) as amigos
from users as u 
join friendships as fi on (u.id = fi.user_id)
group by u.first_name;

-- 4.- Crea un nuevo usuario y hazlos amigos de Eli Byers, Kermit The Frog y Marky Mark.

insert into users (first_name,last_name,created_at,updated_at) values ("Juan","Perez","2019-02-08 11:12:11","2019-02-08 11:12:11");
insert into friendships (user_id,friend_id,created_at) values ("2","6","2019-02-08 12:12:11");
insert into friendships (user_id,friend_id,created_at) values ("4","6","2019-02-08 13:12:11");
insert into friendships (user_id,friend_id,created_at) values ("5","6","2019-02-08 16:12:11");

-- 5.- Devuelve a los amigos de Eli en orden alfabético.

select * from users;
select u.first_name, user2.first_name
from users as u 
left join friendships as fi on (u.id = fi.user_id)
left join users as user2 on (user2.id = fi.friend_id)
where u.id=2   order by user2.first_name asc;

-- 6.- Eliminar a Marky Mark de los amigos de Eli.

delete from friendships where friendships.user_id=2 and friendships.friend_id = 5;

-- 7.- Devuelve todas las amistades, mostrando solo el nombre y apellido de ambos amigos

select u.first_name, u.last_name, user2.first_name, user2.last_name
from users as u 
join friendships as fi on (u.id = fi.user_id)
join users as user2 on (user2.id = fi.friend_id);










