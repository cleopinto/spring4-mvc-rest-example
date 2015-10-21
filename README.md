# spring4-mvc-rest-example

Sample Rest API application using servlet 3, spring 4 with java configurations and spring data with mongo repository

To import the application into eclipse. Use <code>gradle cleaneclipse eclipse</code>

To play around with the APIs you can use either Postman or curl. Methods supported are GET, POST, PUT, DELETE and PATCH Below are some examples:

``curl -X POST -H "Content-Type: application/json" -H  -d '{
"id":"1001",
"jerseyNumber":8,
"name":"Steven Gerrard"
}' 'http://localhost:8080/spring-rest-mvc/football/player'``

``curl -X GET 'http://localhost:8080/spring-rest-mvc/football/player'``

``curl -X GET 'http://localhost:8080/spring-rest-mvc/football/player/1000'``

``curl -X PUT -H "Content-Type: application/json" -d '{
"id":"1000",
"jerseyNumber":28,
"name":"Danny Ings"
}' 'http://localhost:8080/spring-rest-mvc/football/player/1000'``

``curl -X PATCH -H "Content-Type: application/json" -d '{
"jerseyNumber":20
}' 'http://localhost:8080/spring-rest-mvc/football/player/1000'``

``curl -X DELETE 'http://localhost:8080/spring-rest-mvc/football/player/1000'``

This application uses:</br>
 <ol><li> Servlet 3</li>
 <li> Spring 4 java configurations</li>
  <li>Spring data - mongo repository to connect to local mongo db</li></ol>
