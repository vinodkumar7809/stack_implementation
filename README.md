# Stack(LIFO) Implementation

  ### .

* Spring boot actuator provides production grade metrics, auditing, and monitoring features to your application.
* Just adding the actuator dependency makes it available on our 8080 port. If
  we add hateoas as well, it will make it restfully navigable under /actuator.
  No code is required.
* We’ll also disable actuator endpoint security to make this demo run smoother of course J. We can do this by adding these two properties:
 
 ```sh
 1 security.basic.enabled=false
 2 management.security.enabled=false
  ```

## Actuator Features to Notice
* Live thread dumps
* Live stack traces
* Logger configurations
* Password-masked properties file auditing
* Heap dump trigger (can be disabled)
* Web-request traces
* Application metrics
* Spring bean analysis
* More! (and it’s extensible)

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

