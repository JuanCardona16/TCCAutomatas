# Usamos la imagen de Java 21 como base
FROM openjdk:21-jdk-slim

# Establecemos el directorio de trabajo en el contenedor
WORKDIR /app

# Copiamos el archivo .jar de la aplicación al contenedor
COPY target/turingmachinecipher-0.0.1-SNAPSHOT.jar app.jar

# Exponemos el puerto en el que Spring Boot escuchará (por defecto, 8080)
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
