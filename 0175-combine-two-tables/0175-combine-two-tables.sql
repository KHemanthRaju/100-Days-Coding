select firstName, lastName, City, state from Person
Left join address
on person.personId = Address.personId