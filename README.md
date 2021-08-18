# devon4quarkus-cicd-testapp-service-b
Service which is called by devon4quarkus-cicd-testapp-service-a.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode using: `shell script ./mvnw compile quarkus:dev `

## Access your REST endpoint

`curl -w "\n" http://localhost:8081/hello`

or

`curl -w "\n" http://localhost:8081/hello/Florian`

## Running tests

You can run tests from your IDE or via Maven. Simply run ./mvnw test or ./mvnw package

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar