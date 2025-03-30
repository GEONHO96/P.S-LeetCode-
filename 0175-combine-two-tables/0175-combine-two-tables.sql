SELECT p.firstName, p.lastName, a.city, a.state
FROM Person P
LEFT JOIN Address A
ON p.personId = a.personId;