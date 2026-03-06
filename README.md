# 🌐 GlobalDocs Solution - Factory Method Pattern

## 📝 Descripción del Proyecto
**GlobalDocs Solution** es una aplicación desarrollada en Java que automatiza el procesamiento de documentos comerciales, adaptándose a las normativas fiscales de distintos países (Colombia, México, Argentina y Chile). 

El proyecto implementa el patrón de diseño creacional **Factory Method** para lograr un código desacoplado y escalable, permitiendo que el sistema decida en tiempo de ejecución qué procesador de país instanciar según la necesidad del usuario.

## 🏗️ Arquitectura del Patrón
La solución sigue estrictamente la estructura de cuatro capas del patrón Factory Method:

* **Product (Interfaz):** `ProcesadorDocumento` - Define los métodos esenciales `validarRegulaciones()` y `generarCertificado()`.
* **Concrete Products:** Clases específicas por país (`ProcesadorColombia`, `ProcesadorMexico`, etc.) que contienen la lógica de negocio para entidades como la DIAN, SAT, AFIP y SII.
* **Creator (Clase Abstracta):** `DocumentoFactory` - Define el método de fábrica (`factoryMethod`) que sirve como punto de entrada para la creación de objetos.
* **Concrete Creators:** Subclases que implementan la lógica de instanciación específica para cada mercado nacional.



## 🚀 Funcionalidades Principales
* **Interfaz Interactiva:** Uso de la librería `javax.swing` para crear menús visuales y amigables.
* **Procesamiento Dinámico:** Simulación de validaciones fiscales y generación de certificados digitales en tiempo real.
* **Arquitectura Limpia:** Separación total entre la interfaz de usuario y la lógica de creación de objetos.

## 🛠️ Tecnologías y Herramientas
* **Lenguaje:** Java (OpenJDK 25).
* **IDE:** IntelliJ IDEA (Entorno de desarrollo principal).
* **Gestión de Versiones:** Git y GitHub para el control de código fuente.

## 👨‍💻 Autor
**Luis Sebastian Diaz** *Estudiante de Ingeniería de Software - 4to Semestre* **Universidad Cooperativa de Colombia (UCC)**
