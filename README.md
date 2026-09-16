# Informe de Laboratorio 1: Introducción a SpringBoot y React

## 1. Introducción y Objetivos

**Introducción**
El presente proyecto consiste en el desarrollo de una aplicación web que simula las transacciones de una entidad bancaria, permitiendo a los usuarios realizar transferencias entre cuentas y consultar el histórico de movimiento. La solución se divide en un backend que expone una API REST y un frontend interactivo.

**Objetivos**
*   **General:** Desarrollar una aplicación web transaccional full-stack utilizando buenas prácticas de ingeniería de software y patrones de diseño.
*   **Específico 1:** Implementar una API RESTful en Spring Boot estructurada por capas (Modelo, Repositorio, Servicio, Controlador)
*   **Específico 2:** Construir una interfaz de usuario funcional con React JS que consuma los endpoints del backend mediante peticiones HTTP

---

## 2. Tecnologías y Arquitectura

**Herramientas de SW Empleadas**
El proyecto hace uso del siguiente stack tecnológico:
*   **Backend:** Java JDK 17, Spring Boot, Maven, Spring Data JPA, Lombok, MapStruct.
*   **Frontend:** NodeJS, React JS, Axios.
*   **Base de Datos:** MySQL.
*   **Entorno:** IDE IntelliJ IDEA, Visual Studio Code, Navegador Web.

**Arquitectura Propuesta**
Se implementó una arquitectura basada en capas orientada al dominio. El frontend actúa como cliente enviando peticiones HTTP al controlador REST del backend El controlador delega la lógica de negocio a la capa de servicios, la cual interactúa con la base de datos a través de los repositorios JPA. Para mantener la seguridad y desacoplamiento, la comunicación de datos hacia el exterior se realiza exclusivamente mediante objetos de transferencia de datos (DTOs) apoyados por Mappers.

---

## 3. Procedimiento

El desarrollo se llevó a cabo siguiendo estas fases principales:
1.  **Configuración del Backend:** Inicialización del proyecto con Spring Initializr y configuración de credenciales para MySQL en `application.properties`.
2.  **Desarrollo de la API:** Creación de las entidades `Customer` y `Transaction`, interfaces de repositorio, y la lógica transaccional en la capa de servicios.
3.  **Implementación de DTOs:** Configuración de MapStruct para mapear entidades a DTOs y evitar la exposición de la estructura interna de la base de datos.
4.  **Desarrollo del Frontend:** Creación de un proyecto React con Axios para consumir las rutas y maquetación de tres vistas obligatorias: Consulta de clientes, Transferencias y el Histórico por cuenta. Se habilitó la política CORS en los controladores para permitir la comunicación entre puertos.

---

## 4. Conclusiones y Anexos

**Conclusiones**
*   La separación de responsabilidades a través de una arquitectura por capas facilita la mantenibilidad del código, permitiendo aislar errores específicos en la lógica de negocio o en el acceso a datos.
*   El uso del patrón DTO es fundamental en las APIs REST, ya que previene vulnerabilidades al exponer únicamente los datos estrictamente necesarios para la vista del cliente.

**Bibliografía**
*   Documento guía: *Laboratorio Nro 1: Introducción a SpringBoot*. Arquitectura de Software.

**Proyecto Anexo**
*   **Repositorio GitHub:** [Ingresa aquí tu enlace, ej: https://github.com/tu-usuario/lab1-banco-2025]
