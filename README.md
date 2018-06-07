# CapitalFloatChallenge
Spring Boot API for CRUD functionality on Postgresql

1) url: /students
    Request: Get
    //return all elements from db students
    E.g:
    [
        {
           "id": 1,
           "name": "GEORGE",
           "course": "Computer Science"
        },
        {
            "id": 2,
            "name": "XYZ",
            "course": "Finance"
        }
    ]

2) url: /students/id
    Request: Get
    //return entry from db based on id specified(id can be 1, 2,....etc)
    E.g:
    for url /students/2 
    {
        "id": 2,
        "name": "XYZ",
        "course": "Finance"
    }

3) url: /students/id
    Request: Delete
    //deletes entry from db based on id specified(id can be 1, 2,....etc)
    E.g:
    for url /students/2
    //would delete the row with id=2 from Database
    
4) url: /students
    Request: Put
    //edits entry from db depending on the id
    E.g:
    for url: /students
    {
		    "id":1,
        "name": "Meep",
        "course": "Arts"
    }
    //this would change the row in database id=1 to name=Meep and course=Arts
    
5) url: /students
    Request: Post
    //adds entry to db
    E.g:
    {
        "name": "Aravind",
        "course": "Computer Science"
    }
    //This would add Aravind, Computer Science to db...id will be auto-generated.
