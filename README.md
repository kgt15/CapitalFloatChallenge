# CapitalFloatChallenge


## Spring Boot API for CRUD functionality on Postgresql

url: '/students'

<br> Request Type : **GET** <br/>
<br/> Description : **return all elements from db students**<br/> 
    
### E.g: 

```javascript
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
```

url: '/students/id'

<br/> Request: **GET**<br/>

<br> Description : return entry from Database based on 'id' <br/> 

### E.g:

<br> for url '/students/2' </br>
```javascript
    { 
        "id": 2, 
        "name": "XYZ", 
        "course": "Finance" 
    }
```

url: '/students/id' 
<br/> Request: **DELETE** <br/>

<br/> Description: deletes entry from db based on id<br/> 

 ### E.g:

<br/> for url /students/2<br/> 

url: '/students' <br/>Request: **PUT**<br/> 
<br/> Description : **edits entry from db depending on the id** <br/>
### E.g:

<br/> for url: '/students'<br/> 

```javascript
    { 
        "id":1, 
        "name": "Meep", 
        "course": "Arts"
     } 
```

<br/> Description : **this would change the row in database id=1 to name=Meep and course=Arts**</br>

url: '/students' 

<br/>Request: **POST**
<br/> Description : **adds entry to Database**<br/>
### E.g: 
<br/>for url: '/students'<br/>

```javascript

    {
         "name": "Aravind", 
         "course": "Computer Science"
    } 
```


<br/> This would add Aravind, Computer Science to db...id will be auto-generated.<br/>
