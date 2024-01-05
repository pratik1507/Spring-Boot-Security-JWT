# Spring-Boot-Security-JWT
This repository is related to spring boot security with JWT (JSON WEB TOKEN) . </br>
In this project we will see how to configure InMemory user and JWT authentication using latest Spring Boot version 3.2.

# Create new Spring Boot Project :
Go to spring initializer and create new project with dependencies </br>
Add the following dependencies
# For Web :
![web-dep](https://github.com/pratik1507/Spring-Boot-Security---JWT/assets/110710381/c4b554dd-7892-40be-b737-047f2fae936f)

# For security :
![security-dep](https://github.com/pratik1507/Spring-Boot-Security---JWT/assets/110710381/68e2f9fa-4836-41d7-8571-c8243a711b49)

# Lombok :
![lambok](https://github.com/pratik1507/Spring-Boot-Security---JWT/assets/110710381/f4937e14-303e-4d2c-9b9c-da3a1478cc56)

# JWT :
![jwt-dep](https://github.com/pratik1507/Spring-Boot-Security---JWT/assets/110710381/f37e8daf-8f2a-4067-9796-58c6ce767617)

# JWT Authentication Flow : 
![image](https://github.com/pratik1507/Spring-Boot-Security---JWT/assets/110710381/49ba67dc-46aa-4ce0-8d52-50b247801802)

# Output : 
When you are trying to access the api without token : 
![image](https://github.com/pratik1507/Spring-Boot-Security---JWT/assets/110710381/23f84be2-033f-48f3-b028-2c1a50fe9ad6)

For login : (http://localhost:8080/auth/login) : This api is permitted without the valid jwt token .</br>
After hitting this api a valid JWT token has been generated with which you can access other protected api's.
![image](https://github.com/pratik1507/Spring-Boot-Security---JWT/assets/110710381/6ec71ee5-4307-4584-ac8a-83e4cc29f73f)

After login : </br>
When you are hitting any protected api you need to pass the generated jwt token with the api </br>
Key : Authentication </br>
value : Bearer + blank space + generated jwt token </br>

![image](https://github.com/pratik1507/Spring-Boot-Security---JWT/assets/110710381/aee1e8d3-3c9d-481c-b328-fc58e28513e0)

In the below image you can see the difference when you pass a invalid jwt token and a valid jwt token. When you pass a invalid jwt token you will get a message in the console as Invalid Header Value .

![image](https://github.com/pratik1507/Spring-Boot-Security---JWT/assets/110710381/892775f3-edd3-4458-98c4-bcc0f6f56e9f)
![image](https://github.com/pratik1507/Spring-Boot-Security---JWT/assets/110710381/5e46db01-e38e-4b74-b4ea-9661c8f89ca8)






