[![Board Status](https://dev.azure.com/gianluc4t/b33c5a65-3c6c-420c-ab5e-cbbe64b94149/124eb064-fdad-4a98-b40a-cfa7110facb7/_apis/work/boardbadge/769d8c1e-7c51-4b94-8d5d-b1af4b689ac1)](https://dev.azure.com/gianluc4t/b33c5a65-3c6c-420c-ab5e-cbbe64b94149/_boards/board/t/124eb064-fdad-4a98-b40a-cfa7110facb7/Microsoft.RequirementCategory)
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
