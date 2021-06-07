
use sakila;
select * from actor;

-- 1. ¿Qué consulta ejecutarías para obtener todos los clientes dentro de city_id = 312? Su consulta debe devolver el nombre, apellido, 
-- correo electrónico y dirección del cliente.

select c.first_name, c.last_name, c.email, a.address from customer as c
join address as a on (c.address_id = a.address_id)
where a.city_id=312;

-- 2. ¿Qué consulta harías para obtener todas las películas de comedia? Su consulta debe devolver el título de la película, la 
-- descripción, el año de estreno, la calificación, las características especiales y el género (categoría).

select fi.title, fi.description, fi.release_year,fi.rental_rate, fi.special_features, ca.name 
from film as fi, category as ca
where ca.name='comedy';  

-- 3. ¿Qué consulta harías para obtener todas las películas unidas por actor_id = 5? Su consulta debe devolver la identificación 
-- del actor, el nombre del actor, el título de la película, la descripción y el año de lanzamiento.

select a.actor_id, a.first_name, a.last_name,f.title, f.description, f.release_year
from actor as a, film as f
where a.actor_id =5;

-- 4. ¿Qué consulta ejecutaría para obtener todos los clientes en store_id = 1 y dentro de estas ciudades (1, 42, 312 y 459)? Su 
-- consulta debe devolver el nombre, apellido, correo electrónico y dirección del cliente.

select c.store_id, ci.city_id, c.first_name, c.last_name, c.email , a.address
from customer as c, address as a,city as ci
where  c.store_id=1
and ci.city_id in (1,42,312,459);

-- 5. ¿Qué consulta realizarías para obtener todas las películas con una "calificación = G" y "característica especial = detrás de escena", 
-- unidas por actor_id = 15? Su consulta debe devolver el título de la película, la descripción, el año de lanzamiento, 
-- la calificación y la función especial. Sugerencia: puede usar la función LIKE para obtener la parte 'detrás de escena'.

select fi.title, fi.description, fi.release_year, fi.rental_rate, fi.special_features from film as fi, actor as ac
where ac.actor_id = 15
and fi.rating = 'G' 
and fi.special_features like '%Behind the Scenes%'; 

-- 6. ¿Qué consulta harías para obtener todos los actores que se unieron en el film_id = 369? Su consulta debe devolver film_id, title, 
-- actor_id y actor_name.

select fi.film_id, fi.title, ac.actor_id, ac.first_name,ac.last_name from film as fi, actor as ac
where fi.film_id = 369; 

-- 7. ¿Qué consulta harías para obtener todas las películas dramáticas con una tarifa de alquiler de 2.99? 
-- Su consulta debe devolver el título de la película, la descripción, el año de estreno, la calificación, las características especiales 
-- y el género (categoría).

select fi.title, fi.description,fi.release_year, fi.rating,fi.special_features from film as fi, category as ca
where fi.rental_rate=2.99
and ca.name = 'Drama' ;

-- 8. ¿Qué consulta harías para obtener todas las películas de acción a las que se une SANDRA KILMER? Su consulta 
-- debe devolver el título de la película, la descripción, el año de estreno, la calificación, las características especiales, el género 
-- (categoría) y el nombre y apellido del actor.


select ac.actor_id, fi.title, fi.description, fi.release_year, fi.rating,fi.special_features,ca.name
from film as fi, actor as ac, category as ca
where (fi.film_id = ac.actor_id)
and (fi.film_id = ca.category_id)
and ca.name='Action'
and ac.first_name='SANDRA'
and ac.last_name='KILMER'; 





















