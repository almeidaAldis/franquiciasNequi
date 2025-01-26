# Spring Boot + PostgreSQL + Docker

Este proyecto es una aplicación básica de Spring Boot para gestionar franquicias, sucursales y productos. Incluye APIs documentadas con Swagger, configuración de PostgreSQL en Docker, y soporte para pruebas unitarias con Mockito.

## Requisitos previos

- **Java 23**
- **Spring Boot 3.4.2**
- **Docker y Docker Compose**
- **Maven 3.8+**

## Pasos para ejecutar el proyecto

1. **Clona el repositorio**

   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd springboot-postgresql-docker
   ```

2. **Configura Docker**

   Asegúrate de que Docker esté ejecutándose. Luego, inicia los servicios:

   ```bash
   docker-compose up
   ```

   Esto levantará una instancia de PostgreSQL en `localhost:5432` con:
   - Usuario: `postgres`
   - Contraseña: `postgres`
   - Base de datos: `demo_db`

3. **Construye el proyecto**

   Usa Maven para compilar el proyecto y generar el archivo JAR:

   ```bash
   mvn clean package
   ```

4. **Ejecuta la aplicación**

   Inicia la aplicación con:

   ```bash
   java -jar target/springboot-postgresql-docker-0.0.1-SNAPSHOT.jar
   ```

5. **Accede al Swagger**

   La documentación del API estará disponible en:  
   [http://localhost:8080/swagger-ui/](http://localhost:8080/swagger-ui/)

## Pruebas Unitarias

Este proyecto incluye dependencias para realizar pruebas unitarias con **Mockito**. Para ejecutar las pruebas, usa:

```bash
mvn test
```

## Estructura del proyecto

- `controller`: Contiene los controladores para los endpoints.
- `model`: Define las entidades (Franchise, Branch, Product).
- `repository`: Interfaces para interactuar con la base de datos.
- `service`: Contiene la lógica de negocio.

## Notas adicionales

- Puedes modificar las credenciales de la base de datos en `src/main/resources/application.properties` si es necesario.
- Asegúrate de usar la versión correcta de Java (23) y Spring Boot (3.4.2).
- Si necesitas ayuda adicional, no dudes en contactar.
