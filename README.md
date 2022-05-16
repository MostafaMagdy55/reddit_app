# reddit_app

## Technologies :computer:

- Java
- Spring boot
- Spring Data JPA 
- MySql
- Spring security 
- JWT
- Map Struct Library
- Swagger 
- Lombok

## Features :fire:  
- Sign up and Sign in
- CRUD Operation with posts and comments
- Posts have an up/down vote section
- CRUD Operation with subreddit 

## How to use :wave: (IF YOU WANT TO USE IT LOCALLY) 

To clone and run this application by yourself, make sure you have at least Java 8 and all JDK stuff (including JRE), Maven to build the dependencies,
Ecplise or STS, and Postman (it's not necessary, though it's really useful to handle a rest API. After that, do the following instructions

- Clone this repository
```bash
$ https://github.com/MostafaMagdy55/reddit_app.git
```
- Open this project using Eclipse or Spring tool Suit

- Run ```SubredditRepository.java```
  > This is gonna be building the maven dependencies too

- The endpoints are located in 'http://localhost:8080/' and config its port on ```src/main/resources/application.properties```
  > Use a software like postman to do the resquests. 
  
- Make sure to create a database called **reddit** 
  > or create it with another name. However, you must to rename its name in ```src/main/resources/application.properties```

 **By the way, you can change the port (8080) to another one, just change the line in ```src/main/resources/application.properties```**

  **Now, you are able to run this Java application locally.** :heavy_check_mark:



# API Documentation :memo:

Swagger is responsible to provide a documentation of the API, it break down the endpoints and the models of the application.


 <img  width="600" height="290" src="https://github.com/MostafaMagdy55/reddit_app/blob/master/images/swagger1.PNG">  
  <img  width="600" height="290" src="https://github.com/MostafaMagdy55/reddit_app/blob/master/images/swagger2.PNG">  
  <img  width="600" height="290" src="https://github.com/MostafaMagdy55/reddit_app/blob/master/images/swagger3.PNG">  
 
 




