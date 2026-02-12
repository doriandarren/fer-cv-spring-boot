# CV Project by Sping Boot

- Java 21
- Sping Boot version 3.5.10 (Generate by https://start.spring.io/)
- Maven
- Jar

## Run server

```sh

./mvnw spring-boot:run                                      ## para ejecutar servidor hot-reload

```

## Docker

```sh

cd docker
docker compose up -d

```

## Comandos

```sh

./mvnw spring-boot:run                                      ## para ejecutar servidor hot-reload

./mvnw clean package                                        ## Compila el proyecto

java -jar target/tu-cv-spring-boot-0.0.1-SNAPSHOT.jar       ## Ejecutar el .jar


## Eliminar proceso
lsof -i :8080
kill -9 24509                                               ## reemplazar ultimo numero por el PID que se va a ejecutar

```
