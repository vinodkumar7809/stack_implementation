# Stack(LIFO) Implementation

* 
 ```sh
 ## PostgreSql
spring.datasource.url=jdbc:postgresql://DB_ALIAS/admin?stringtype=unspecified
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.jpa.hibernate.ddl-auto=create
  ```
## Dependencies Added

```sh
        <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-boot-starter</artifactId>
			<version>3.0.0</version>
		</dependency>
  ```
  
## exposed REST API endpoints:
- http://localhost:8080/push
- http://localhost:8080/pop
  
### Swaager Api documentation links:
- http://localhost:8080/swagger-ui/
- http://localhost:8080/v2/api-docs

