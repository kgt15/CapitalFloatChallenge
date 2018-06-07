# CapitalFloatChallenge
Spring Boot API for CRUD functionality on Postgresql

1)url: /students <br/>Request: Get <br/>//return all elements from db students <br/>E.g:<br/> [ { "id": 1, "name": "GEORGE", "course": "Computer Science" }, { "id": 2, "name": "XYZ", "course": "Finance" } ]

2)url: /students/id<br/> Request: Get<br/> //return entry from db based on id (specified id can be 1, 2,....etc)<br/> E.g:<br/> for url /students/2<br/> { "id": 2, "name": "XYZ", "course": "Finance" }

3)url: /students/id <br/>Request: Delete <br/>//deletes entry from db based on id specified(id can be 1, 2,....etc)<br/> E.g:<br/> for url /students/2<br/> //would delete the row with id=2 from Database

4)url: /students <br/>Request: Put<br/> //edits entry from db depending on the id <br/>E.g:<br/> for url: /students<br/> { "id":1, "name": "Meep", "course": "Arts" } <br/>//this would change the row in database id=1 to name=Meep and course=Arts

5)url: /students <br/>Request: Post<br/> //adds entry to db <br/>E.g: <br/>for url: /students<br/>{ "name": "Aravind", "course": "Computer Science" } <br/>//This would add Aravind, Computer Science to db...id will be auto-generated.
