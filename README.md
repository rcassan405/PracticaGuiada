# PracticaSpring

Aplicación web de inventario migrada del tutorial Spring MVC 5 a Spring Framework 7, con Spring Data JPA y Jakarta JSP/JSTL.

## Requisitos

- JDK 17 o posterior
- Apache Tomcat 11
- MySQL local

## Base de datos

Ejecuta como administrador de MySQL, en este orden:

```sql
SOURCE db/springapp.sql;
SOURCE db/load_data.sql;
```

Si aparece `Unknown database 'springapp'`, aún no se ha ejecutado `db/springapp.sql`. En MySQL Workbench, abre y ejecuta primero ese archivo; después abre y ejecuta `db/load_data.sql`. Conéctate a la instancia local como `root`.

La conexión está configurada en `src/main/resources/application.properties` para el usuario `root` con la contraseña indicada para el entorno local. Ajusta esos valores si tu configuración de MySQL cambia.

## Ejecución

En NetBeans, despliega el proyecto Maven WAR en Tomcat 11. La página inicial redirige a `/hello.htm`; desde allí puedes consultar los productos y abrir el formulario para incrementar sus precios.
