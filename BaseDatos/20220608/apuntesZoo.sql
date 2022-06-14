
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



/*The expression subject IN ('chemistry','physics') can be used as a value - it will be 0 or 1.
Show the 1984 winners and subject ordered by subject and winner name; but list chemistry and physics last.*/

SELECT winner, subject
FROM nobel
WHERE yr=1984
ORDER BY  subject IN ('physics','chemistry'), subject, winner 

/*Select the code that shows how many Chemistry awards were given between 1950 and 1960*/
SELECT COUNT(subject) FROM nobel
WHERE subject = 'Chemistry'
AND yr BETWEEN 1950 and 1960


/*Pick the code that shows the amount of years where no Medicine awards were given*/
SELECT COUNT(DISTINCT yr) FROM nobel
WHERE yr NOT IN (SELECT DISTINCT yr FROM nobel WHERE subject = 'Medicine')

/*Select the code which would show the year when neither a Physics or Chemistry award was given*/
SELECT yr FROM nobel
WHERE yr NOT IN(SELECT yr 
FROM nobel
WHERE subject IN ('Chemistry','Physics'))

/*Select the code which shows the years when a Medicine award was given but no Peace or Literature award was*/
SELECT DISTINCT yr
FROM nobel
WHERE subject='Medicine' 
AND yr NOT IN(SELECT yr FROM nobel 
WHERE subject='Literature')
AND yr NOT IN (SELECT yr FROM nobel
WHERE subject='Peace')

/*List each country name where the population is larger than that of 'Russia'.*/
SELECT name FROM world
WHERE population >
(SELECT population FROM world
WHERE name='Russia')

/*Show the countries in Europe with a per capita GDP greater than 'United Kingdom'.*/
select name from world
where gdp/population > 
(select gdp/population from world 
where name = 'United Kingdom')
and continent = 'Europe'

/*Which country has a population that is more than United Kingom but less than Germany? Show the name and the population.*/
select name, population from world 
where population > (select population from world 
where name = 'United Kingdom') 
and population < (select population from world 
where name = 'Germany')

/*Germany (population 80 million) has the largest population of the countries in Europe. Austria (population 8.5 million) has 11% of the population of Germany.
Show the name and the population of each country in Europe. Show the population as a percentage of the population of Germany.*/

select name, CONCAT(ROUND(100*population/(select population from world where name = 'Germany'))
, '%')  
from world
where continent = 'Europe'

/*For each continent show the continent and number of countries.*/
select continent, count(name) from world
group by continent
/*For each continent show the continent and number of countries with populations of at least 10 million.*/
select continent, count(name) from world
where population > 10000000
group by continent


