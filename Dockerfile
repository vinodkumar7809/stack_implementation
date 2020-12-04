FROM java:8

EXPOSE 8080

ADD target/stack_implementation.jar stack_implementation.jar

ENTRYPOINT ["java","-jar","stack_implementation.jar"]