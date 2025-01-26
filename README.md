# Spring Boot + PostgreSQL + Docker

Este proyecto es una aplicación básica de Spring Boot para gestionar franquicias, sucursales y productos.

## Requisitos previos

- **Java 23**
- **Spring Boot 3.4.2**
- **Docker y Docker Compose**
- **Maven 3.8+**

## Pasos para ejecutar el proyecto

1. **Clona el repositorio**

   ```bash
   git clone git@github.com:almeidaAldis/franquiciasNequi.git
   cd springboot-postgresql-docker
   ```

2. **Construye el proyecto**

   Usa Maven para compilar el proyecto y generar el archivo JAR:

   ```bash
   mvn clean package
   ```
   
3. **Configura Docker**

   Asegúrate de que Docker esté ejecutándose. Luego, inicia los servicios:

   ```bash
   docker-compose build
   docker-compose up 
   ```

   Esto levantará una instancia de la aplicacion JAVA en el puerto `localhost:8082` y PostgreSQL en `localhost:5432` con:
   - Usuario: `postgres`
   - Contraseña: `postgres`
   - Base de datos: `demo_db`


4. **Pruebas**

   Pueden realizar las pruebas con la siguiente colección de postman:
   https://grey-spaceship-424235.postman.co/workspace/Team-Workspace~68edb600-ee5d-4c38-8b36-a536e03fe47c/collection/7360325-5230f1fc-2df4-41fa-aca7-dfa4d9073cb0?action=share&creator=7360325&active-environment=7360325-554d1cfe-4b8d-4391-a4de-9a3a3e1f19df 

## Notas adicionales

- Puedes modificar las credenciales de la base de datos en `src/main/resources/application.properties` si es necesario.
- Usar la versión correcta de Java (23) y Spring Boot (3.4.2).
- Si necesitas ayuda adicional, no dudes en contactar.
