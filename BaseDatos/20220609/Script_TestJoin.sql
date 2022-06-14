
use TestJoin;

SELECT * FROM Alumnos;
SELECT * FROM Grupos;

-- INNER JOIN
-- Obtener los datos que coinciden en ambas tablas, excluyendo los no relacionados o NULL.
select *
from Alumnos a
inner join Grupos g
on a.grupo_id = g.id;
order by a.grupo_id DESC; 

select *
from Alumnos a
inner join Grupos g
on a.grupo_id = g.id
where g.id = 4
;
-- Especificar las columnas que queremos visualizar y su respectivo Alias.
select a.id, a.nombre Alumno, g.nombre Grupo
from Alumnos a
inner join Grupos g
on a.grupo_id = g.id
where g.id = 4
;

-- LEFT INNER
-- Obtener los datos de la tabla A (izquierda) mas las coincidencias de la tabla B (derecha). 
-- En este caso nos muestra los Alumnos NULL, pero no los grupos NULL.
select *
from Alumnos a
left join Grupos g
on a.grupo_id = g.id
WHERE grupo_id = NULL;

-- Para obtener solamente los datos que no estan relacionados en la tabla priorizando la tabla de la izquierda.
-- DATOS NULL 
select *
from Alumnos a
left join Grupos g
on a.grupo_id = g.id
WHERE grupo_id is NULL;

-- Especificar las columnas que queremos visualizar y su respectivo Alias.
select a.id, a.nombre Alumno, g.nombre Grupo
from Alumnos a
left join Grupos g
on a.grupo_id = g.id;

-- RIGHT JOIN
-- Obtener los datos de la tabla B (derecha) mas las coincidencias de la tabla A (izquierda). 
-- En este caso nos muestra los grupos NULL, pero no los Alumnos NULL.
select *
from Alumnos a
RIGHT join Grupos g
on a.grupo_id = g.id;

-- Para obtener solamente los datos que no estan relacionados en la tabla priorizando la tabla de la derecha.
-- DATOS NULL 
select *
from Alumnos a
RIGHT join Grupos g
on a.grupo_id = g.id
WHERE a.grupo_id is NULL;

-- Especificar las columnas que queremos visualizar y su respectivo Alias.
select a.id, a.nombre Alumno, g.nombre Grupo
from Alumnos a
RIGHT join Grupos g
on a.grupo_id = g.id;

-- FULL JOIN
--Obtener los datos de ambas tablas y sus coincidencias (INCLUYE LOS NULL).
-- Esta estructura no funciona en MYSQL por la version.
/*select *
from Alumnos a
FULL OUTER join Grupos g
on a.grupo_id = g.id;
*/

--Tenemos la alternativa de utilizar el full pero agregando la palabra 'UNION' a un RIGHT y LEFT.
select *
from Alumnos a
RIGHT join Grupos g
on a.grupo_id = g.id
UNION
select *
from Alumnos a
left join Grupos g
on a.grupo_id = g.id;

/*
select * from (select a.id, a.nombre as 'alumno',g.id as 'grupoId',  g.nombre as 'nombreGrupo'
FROM alumnos a
Right JOIN grupos g 
on a.grupo_id = g.id
UNION
select a.id, a.nombre as 'alumno',g.id as 'grupoId', g.nombre as 'nombreGrupo'
FROM alumnos a
LEFT JOIN grupos g 
on a.grupo_id = g.id
) as universo
-- where -- is null
	;
*/


