# Eureka Naming Server
Java Spring Boot Eureka Naming Server by ToniSun
![](src/main/resources/asserts/colorful-wall_sm_tra.png)

### Input & Output
* http://localhost:8765
* ${ZIPKIN_SERVER:http://localhost:9876/}

### Build *jar File
```mvn clean install```

### Build Docker Image ```tonisun-eureka-naming-server```
```docker build . -t tonisun-eureka-naming-server:latest ```