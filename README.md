# Blux

Simple tweeter blog on web flux

## Architecture
Spring boot 2.0 example application with Mono And Flux support for stream based response, based on https://www.callicoder.com/reactive-rest-apis-spring-webflux-reactive-mongo/ 

## Usage
- Spin up a mongodb instance
- `./gradlew bootRun` it and check out the controllers for the request/response objects.

## Integration tests
 There is an integration test suite using `docker-compose-rule-junit4:0.31.1` to spin up a test mongodb container.
 
Feel free to send me issues and PR's to enhance it. 