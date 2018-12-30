# circuit-breaker
Circuit Breaker using Netflix libraries.
Technologies used:
* Netflix Hystrix
* Netflix Eureka
* Netflix Turbine
* Spring Cloud Stream using Rabbit MQ

## Rabbit MQ
* Run rabbit mq server, for example in Mac:
```
$ cd /usr/local/Cellar/rabbitmq/3.7.9/sbin/
$ ./rabbitmq-server
```

## Discovery Server
* Go to discovery-server
* Run ``./gradlew bootRun``

## App
* Go to app directory
* Run ``./gradlew bootRun``
* Go to ``http://localhost:8080/hello``
* You may get "world!" or "fallback!" in the response, refresh a few times
* You should also be able to go to ``http://localhost:8080/actuator/hystrix.stream``
* You should get pings and data refreshed continuously

## Turbine
* Go to app directory
* Run ``./gradlew bootRun``
* Go to ``http://localhost:8082/turbine.stream?cluster=APP`` or ``http://localhost:8082/hystrix.stream``
* You should get pings and data refreshed continuously

## Dashboard
* Go to dashboard directory
* Run ``./gradlew bootRun``
* Go to ``http:://localhost:8081/hystrix``
* Add ``http://localhost:8082/turbine.stream?cluster=APP`` or ``http://localhost:8082/hystrix.stream``
* You should see Hystrix dashboard
* Keep refreshing the app and see the dashboard getting updated