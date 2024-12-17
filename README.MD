# Proyecto de Gestion de Libros y Autores

Este proyecto es una aplicación de consola desarrollada en **Java** utilizando **Spring Boot** y **Spring Data JPA**. Permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre libros y autores, además de consultar información de una API externa.

La aplicación organiza libros y autores en una base de datos local y también permite buscar información de libros específicos consultando una API externa.

---

## Funcionalidades Principales

### 1. **Gestíon de Autores**
- **Crear Autores**: Permite agregar autores a la base de datos con atributos como nombre, fecha de nacimiento y fecha de fallecimiento.
- **Listar Autores por Año**: Busca y muestra los autores que estaban vivos en un año específico.
- **Mostrar Todos los Autores**: Lista todos los autores disponibles en la base de datos.

### 2. **Gestíon de Libros**
- **Buscar Libros por Título**: Consulta una API externa para encontrar libros y autores según el título.
- **Guardar Libro en la Base de Datos**: Al encontrar un libro a través de la API, se puede guardar junto con su autor en la base de datos.
- **Mostrar Todos los Libros**: Lista todos los libros registrados en la base de datos.

### 3. **Interacción con una API Externa**
- La aplicación se conecta a una API externa para buscar información de libros usando el título como criterio de búsqueda.
- Los datos obtenidos se serializan utilizando **records** en Java.

---

## Tecnologías Utilizadas

- **Java 22**
- **Spring Boot**: Framework para simplificar el desarrollo de aplicaciones Java.
- **Spring Data JPA**: Simplifica el acceso y gestión de la base de datos.
- **H2 Database**: Base de datos en memoria para desarrollo y pruebas.
- **Gson**: Para parsear datos JSON obtenidos desde la API externa.
- **API Externa**: Se conecta a una API de libros para realizar búsquedas de información.

---

## Requisitos Previos

- **Java 22**
- **Spring Boot**
- IDE como IntelliJ IDEA, Eclipse o NetBeans.
- Conexión a Internet para consumir la API externa.

---

## Estructura del Proyecto

El proyecto tiene la siguiente estructura:

```
/src
|-- main
|   |-- java
|   |   |-- com.example.demo
|   |   |   |-- DemoApplication.java         # Clase principal
|   |   |   |-- Servicio.java                # Lógica del programa
|   |   |   |-- repositorio
|   |   |   |   |-- AutorRepositorio.java    # Repositorio para Autores
|   |   |   |   |-- LibroRepositorio.java    # Repositorio para Libros
|   |   |   |-- entidad
|   |   |   |   |-- Autor.java               # Clase entidad Autor
|   |   |   |   |-- Libro.java               # Clase entidad Libro
|   |   |   |-- modelo
|   |   |   |   |-- Datos.java               # Record para resultados API
|   |   |   |   |-- DatosLibros.java         # Record para datos de libros
|-- resources
|   |-- application.properties              # Configuración de la base de datos
```

---

## Configuración de la Base de Datos

Se utiliza **H2 Database** como base de datos en memoria. No requiere configuración adicional.

**application.properties**:
```properties
spring.datasource.url=jdbc:h2:mem:gestionlibros
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

---

## Ejecución del Proyecto

1. Clona el repositorio:
   ```bash
   git clone <URL-del-repositorio>
   ```
2. Abre el proyecto en tu IDE.
3. Ejecuta la clase principal `DemoApplication.java`.
4. Interactúa con la aplicación desde la consola:
   - Selecciona las opciones del menú para buscar, listar o guardar autores/libros.

---

## Uso de la API Externa

La aplicación consume una API externa para buscar libros por su título. La respuesta de la API se deserializa usando **records**. Asegúrate de tener conexión a Internet al ejecutar esta funcionalidad.

Ejemplo de respuesta JSON de la API:
```json
{
  "resultados": [
    {
      "titulo": "El Quijote",
      "autor": ["Miguel de Cervantes"]
    }
  ]
}
```

---

## Ejemplo de Uso

1. **Buscar un libro por título**:
   - Ingrese el título: `Don Quijote`
   - La aplicación muestra los resultados obtenidos de la API y guarda el libro en la base de datos.

2. **Listar autores vivos en un año**:
   - Ingrese el año: `1605`
   - Resultado: Lista de autores vivos en ese año.

---

## Contribución

Si deseas contribuir a este proyecto:
1. Haz un fork del repositorio.
2. Crea una rama con tus cambios:
   ```bash
   git checkout -b feature/nueva-funcionalidad
   ```
3. Sube tus cambios:
   ```bash
   git push origin feature/nueva-funcionalidad
   ```
4. Crea un Pull Request.

---

## Autores
- **[Marcelo Damian Aquino]** 

---

