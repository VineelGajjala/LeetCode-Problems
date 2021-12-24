# Write your MySQL query statement below
Select name, population, area
FROM World
WHERE world.population >= 25000000 OR world.area >= 3000000
