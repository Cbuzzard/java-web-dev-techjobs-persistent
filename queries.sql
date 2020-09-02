--## Part 1: Test it with SQL
SHOW FIELDS FROM job;

--## Part 2: Test it with SQL
SELECT * FROM employer
WHERE location = 'St. Louis';

--## Part 3: Test it with SQL
DROP TABLE job;

--## Part 4: Test it with SQL
SELECT s.name, s.description FROM
(SELECT distinct s.id, s.name, s.description from skill s
INNER JOIN job_skills js
ON s.id = js.skills_id) s;