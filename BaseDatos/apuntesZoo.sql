
/*Show the name and population in millions and the GDP in billions for the countries of the continent 'South America'. Use the ROUND function to show the values to two decimal places.
For South America show population in millions and GDP in billions both to 2 decimal places.
Millions and billions
Divide by 1000000 (6 zeros) for millions. Divide by 1000000000 (9 zeros) for billions.*/

select name, round (population/1000000,2), round (GDP/1000000000,2)
from world
where continent = 'South America'

/*Exclusive OR (XOR). Show the countries that are big by area (more than 3 million) or big by population (more than 250 million) but not both. Show name, population and area.*/

select name, population, area
from world
where (area > 3000000 and population < 250000000) or (area < 3000000 and population > 250000000)

/*Show the name and per-capita GDP for those countries with a GDP of at least one trillion (1000000000000; that is 12 zeros). Round this value to the nearest 1000.
Show per-capita GDP for the trillion dollar countries to the nearest $1000.*/

select name, round (gdp/population,-3)
from world
where gdp > 1000000000000

/*Greece has capital Athens.
Each of the strings 'Greece', and 'Athens' has 6 characters.
Show the name and capital where the name and the capital have the same number of characters.
You can use the LENGTH function to find the number of characters in a string*/

SELECT name, capital
FROM world
WHERE LENGTH(name) = LENGTH (capital)

/*The capital of Sweden is Stockholm. Both words start with the letter 'S'.
Show the name and the capital where the first letters of each match. Don't include countries where the name and the capital are the same word.
You can use the function LEFT to isolate the first character.
You can use <> as the NOT EQUALS operator.*/

SELECT name, capital
FROM world
where LEFT(name,1) = LEFT(capital,1)
and name <> capital



/*Equatorial Guinea and Dominican Republic have all of the vowels (a e i o u) in the name. They don't count because they have more than one word in the name.
Find the country that has all the vowels and no spaces in its name.
You can use the phrase name NOT LIKE '%a%' to exclude characters from your results.
The query shown misses countries like Bahamas and Belarus because they contain at least one 'a'*/

SELECT name
FROM world
WHERE name LIKE '%a%' and name like '%e%' and name like '%i%' and name like '%o%' and name like '%u%'
AND name NOT LIKE '% %'
