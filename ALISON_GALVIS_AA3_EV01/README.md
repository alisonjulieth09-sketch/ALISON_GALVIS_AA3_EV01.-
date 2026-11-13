# Tienda de Ropa AYB - GA7-220501096-AA3-EV01
Codificación de módulos del software web aplicando Spring Boot.

Tecnologías: Java 17, Spring Boot, Spring MVC, Thymeleaf, HTML5, CSS3, Maven y Git/GitHub.

Módulos: inicio, productos y clientes. El proyecto usa solicitudes GET para mostrar formularios y POST para procesarlos. El código contiene comentarios y sigue convenciones de nombres y separación por capas.

Ejecutar con JDK 17 y Maven:
mvn spring-boot:run

Abrir: http://localhost:8080/

## Estructura del proyecto

```
ALISON_GALVIS_AA3_EV01/
├── pom.xml
├── .gitignore
├── ENLACE REPOSITORIO.txt
├── docs/PRUEBAS.md
└── src/
    ├── main/
    │   ├── java/co/ayb/
    │   │   ├── TiendaAybApplication.java
    │   │   ├── controller/AybController.java
    │   │   └── model/ (Producto.java, Cliente.java)
    │   └── resources/
    │       ├── application.properties
    │       ├── static/css/estilos.css
    │       └── templates/ (index, productos, clientes, resultado-producto, resultado-cliente)
    └── test/java/co/ayb/
        ├── TiendaAybApplicationTests.java
        └── controller/AybControllerTests.java
```

Ejecutar pruebas: `mvn test`
