use world;
select * from cities join countries on countries.id= cities.country_id;

-- 1. ¿Qué consulta harías para obtener todos los países que hablan esloveno? Tu consulta debe 
-- devolver el nombre del país, el idioma y el porcentaje de idioma. 
-- Tu consulta debe organizar el resultado por porcentaje de idioma en orden descendente. (1)

select c.name, l.percentage from countries as c 
join languages as l on (c.id = l.country_id)
where l.language = 'Slovene'
order by l.language desc;

-- 2. ¿Qué consulta ejecutarías para mostrar el número total de ciudades para cada país? 
-- Su consulta debe devolver el nombre del país y el número total de ciudades. 
-- Tu consulta debe organizar el resultado por el número de ciudades en orden descendente. (3)

select count(c.country_code), co.name from cities as c
join countries as co on (c.country_id=co.id)
group by co.name
order by co.name desc;

-- 3. ¿Qué consulta harías para obtener todas las ciudades de México con una población de más de 500,000? 
-- Tu consulta debe organizar el resultado por población en orden descendente. (1)

select ci.name, ci.population from cities as ci
join countries as co on (co.id=ci.country_id)
where (ci.population>500000 and co.name='Mexico') 
order by ci.population desc;

-- 4. ¿Qué consulta ejecutarías para obtener todos los idiomas en cada país con un porcentaje superior al 89%? Tu consulta 
-- debe organizar el resultado por porcentaje en orden descendente. (1)

select co.name, la.language, la.percentage from languages as la 
join countries as co on (la.country_id = co.id)
where la.percentage>89;

-- 5. ¿Qué consulta haría para obtener todos los países con un área de superficie inferior a 
-- 501 y una población superior a 100,000? (2)

select co.name, co.surface_area, co.population from countries as co
where co.surface_area<501 and co.population > 100000;


-- 6. ¿Qué consulta harías para obtener países con solo Monarquía Constitucional con un capital superior a 200 
-- y una esperanza de vida superior a 75 años? (1)

select co.name, co.life_expectancy, co.capital from countries as co 
where co.government_form = 'Constitutional Monarchy' and co.life_expectancy>75 and capital>200;

-- 7. ¿Qué consulta harías para obtener todas las ciudades de Argentina dentro del distrito de Buenos Aires y tener una población superior 
-- a 500,000? La consulta debe devolver el nombre del país, el nombre de la ciudad, el distrito y la población. (2)

select co.name, ci.name, ci.district, ci.population from cities as ci
join countries as co on (co.id=ci.country_id)
where co.name='Argentina' and ci.population >500000 and ci.district ='Buenos Aires';


-- 8. ¿Qué consulta harías para resumir el número de países en cada región? La consulta debe mostrar el nombre de la región y el número de países. 
-- Además, la consulta debe organizar el resultado por el número de países en orden descendente. (2)

select co.region, count(co.region) as Paises from countries as co
group by co.region
order by count(co.name) desc;







