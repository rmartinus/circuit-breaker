# circuit-breaker
Circuit Breaker using Netflix Hystrix

## App
* Go to app directory
* Run ./gradlew bootRun
* Go to http://localhost:8080/hello
* You may get "world!" or "fallback!" in the response, refresh a few times
* You should also be able to go to http://localhost:8080/actuator/hystrix.stream

## Dashboard
* Go to dashboard directory
* Run ./gradlew bootRun
* Go to http:://localhost:8081/hystrix
* Add http://localhost:8080/actuator/hystrix.stream
