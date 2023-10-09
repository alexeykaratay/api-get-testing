# api-get-testing
1. Send a GET request to the specified URL.
2. Check that the Status Code of the response is 200.
3. Check that the body of the response contains an instance with the specified parameters.
## Content
- [Technologies](#technologies)
- [Getting started](#getting_started)
- [Testing](#testing)
- [Result](#result)

## Technologies
- [Java](https://www.java.com/)
- [Maven](https://maven.apache.org/)
- [REST Assured](https://mvnrepository.com/artifact/io.rest-assured/rest-assured)
- [JUnit Jupiter API](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api)
- [Apache HTTPClient](https://hc.apache.org/httpcomponents-client-5.2.x/)

## Getting started
To start testing, you need to install the following dependencies:
```
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.13.0</version>
</dependency>

<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>rest-assured</artifactId>
    <version>5.3.2</version>
    <scope>test</scope>
</dependency>

<dependency>
            <groupId>org.apache.httpcomponents.client5</groupId>
            <artifactId>httpclient5</artifactId>
            <version>5.2.1</version>
        </dependency>
```

## Testing
1. Check that the Status Code of the response is 200.
2. Check that the body of the response contains an instance with the given parameters.
    

## Result
Our tests are tested for functionality API with HTTP Client.
   
