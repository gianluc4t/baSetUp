# Template project
____

app with maven profiles, swagger a some minor test

____
 
** Prerequisites **

1. java 8
1. mvn 3.5
 
____
  
** Run local **
 
> mvn clean spring-boot:run

____
  
** docker: install **
 
> mvn clean install dockerfile:build

____
  
** docker: run **
 
> docker run -p 8090:8090 -t julip/perfilalo

____

** swagger **

swagger documentation/test pages can be found [here](http://localhost:8090/swagger-ui.html)
