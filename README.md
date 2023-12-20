# Automatización de Búsqueda y Selección Aleatoria de Video en YouTube - POM 

Este proyecto está diseñado para automatizar el proceso de búsqueda y selección aleatoria de un video en YouTube utilizando la herramienta Serenity BDD, Gradle como sistema de construcción y Firefox como navegador de prueba. La automatización se realiza mediante el framework de pruebas Serenity BDD junto con JUnit para las aserciones.

## Requisitos Previos

Antes de ejecutar las pruebas automatizadas, asegúrate de tener instalados los siguientes elementos:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Gradle](https://gradle.org/install/)
- [Firefox](https://www.mozilla.org/en-US/firefox/new/)

## Configuración del Proyecto

Este comando limpiará el proyecto, compilará el código y ejecutará las pruebas automatizadas.

## Estructura del Proyecto

- `src/test/java`: Contiene los paquetes y clases con los casos de prueba.
- `src/test/resources`: Contiene archivos de configuración y datos de prueba.
- `serenity.conf`: Archivo de configuración para Serenity BDD.

## Caso de Prueba Principal

El caso de prueba principal se encuentra en la clase `SearchAndSelectVideoTest`. Este caso de prueba realiza la siguiente secuencia de acciones:

1. Abre el navegador Firefox.
2. Accede a la página de YouTube.
3. Realiza una búsqueda aleatoria.
4. Selecciona el primer video de los resultados.

## Dependencias

- [Serenity BDD](https://serenity-bdd.github.io/serenity-docs/): Framework de automatización basado en el patrón de diseño Screenplay.
- [JUnit](https://junit.org/junit5/): Biblioteca de pruebas para Java.

## Contribuciones

Siéntete libre de contribuir al proyecto, ya sea informando problemas, proponiendo mejoras o implementando nuevas características. ¡Toda contribución es bienvenida!

## Licencia

¡Gracias por tu interés en la automatización de YouTube con Serenity BDD y Gradle! ¡Esperamos que encuentres útil este proyecto!
