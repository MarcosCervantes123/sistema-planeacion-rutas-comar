# Fase 4 Readme Resumen Ejecutivo Proyecto Comar en Java
Sistema en Java para registro de pedidos, asignación de rutas y unidades para Comar Logística y Transportes S.A. de C.V.

**Descripcion del Proyecto**

El Proyecto consiste en desarrollar un sistema en Java para Comar Logistica y Transportes S.A. de C.V. Este sistema sera capaz de registrar pedidos, asignar rutas, controlar las unidades. El sistema que se desarrollo permitira a los empleados de Comar tener una forma de organizar la informacion de los pedidos de clientes, de las rutas y unidades asignadas a un pedido y de el estado actual de pedidos, rutas, unidades, demoras, etc. 

Actualmente la empresa cuenta con muchos procesos manuales para la asignacion de rutas y pedidos y no se cuenta con algun programa o sistema que le facilite a los empleados sus actividades. Como resultado de esto se han generado errores a la hora de levantar pedidos, de asignar rutas lo que ha provocado quejas de cliente asi como entregas tardias o entregas incompletas a los clientes. En los casos mas extremos por una mala comunicacion y organizacion el pedido del cliente le llego incompleto. 

**Problemas Identificados**
- Rutas ineficientes
- Errores en pedidos
- Rutas con poca capacidad de carga
- Tiempos de entrega largos
- Entregas de pedidos incompletos
- Mala comunicacion entre Operaciones y Planeacion

**Solucion**
Desarrollar un sistema en JAVA que permita hacer lo siguiente:
- Dar de alta pedidos
- Asignar pedidos a una ruta
- Asignar una unidad a la ruta
- Generar salida
- Registrar entrega al cliente

**Arquitectura**
<img width="900" height="1004" alt="Arquitectura Fase 4" src="https://github.com/user-attachments/assets/1626f0eb-b568-44f2-abaa-9dd08eb38b29" />


- Fase3MarcosCervantes.java es la clase principal. (Este nombre de clase se usa unicamente para las entregas de este taller)
- SistemaPlaneacion.java tiene el sistema y la logica general.
- Pedido.java maneja la informacion de pedidos.
- Ruta.java maneja la informacion de rutas.
- Unidad.java maneja la informacion de unidades.
- PedidoPrueba.java permite validar el funcionamiento con pruebas unitarias.

**Servidores de Aplicacion, Web y Bases de Datos**
Actualmente el proyecto funciona como una aplicación local de consola desarrollada en Java y no es necesario un servidor web ni un servidor de aplicaciones.
Tampoco requiere una base de datos, ya que la información se maneja directamente en memoria mediante objetos Java.
Como mejora futura el sistema podría conectarse a una base de datos (MySQL) para permitir almacenamiento permanente y acceso a multiples usuarios.

**Paquetes Adicionales**
Este proyecto utiliza los siguientes paquetes:
- Maven
- JUnit5
- Maven Surefire Plugin

**Version de Java**
La version de Java utilizada para desarrollar el proyecto es Java 11.
El IDE utilizado para este proyecto fue NetBeans.

**Instalacion**
**¿Como instalar el ambiente de desarrollo?**
1. Instalar Java JDK 11.
2. Instalar Apache Maven.
3. Instalar NetBeans IDE.
4. Clonar el repositorio de GitHub.
5. Abrir el proyecto en NetBeans.
6. Descargar las dependencias necesarias mediante Maven.
7. Dar click en Clean and Build para verificar que el proyecto funcione.

**¿Como ejecutar pruebas manualmente?**
1. Abrir el proyecto en NetBeans.
2. Abrir la clase PedidoPrueba.java
3. Ejecutar la prueba.
4. Verificar que se ejecute correctamente sin errores.

**¿Como implementar la solucion en produccion?**
1. Abrir el proyecto en NetBeans.
2. Ejecutar Clean and Build
3. Buscar el archivo generado en la carpeta target
4. Ejecutar el archivo .jar

El proyecto usa un archivo .jar para que cada empleado pueda ejecutar el sistema en su maquina. La mejora a futuro seria implementar el sistema en la nube o contar con una base de datos a la que puedan acceder los empleados.

**Configuracion**
**Configuracion del Producto**
El proyecto utiliza Maven como herramienta para la administracion y configuracion. 
La configuracion dentro del archivo pom.mxl especifica lo siguiente:
- Nombre del proyecto
- Version del proyecto
- Tipo de empaquetado JAR
- Version de Java
- Dependencias utilizadas
- Plugins de pruebas

<packaging>jar</packaging>
<maven.compiler.source>11</maven.compiler.source>
<maven.compiler.target>11</maven.compiler.target>

**Configuracion de los Requerimientos**
Para el uso del sistema se requiere lo siguiente:
- Java 11 o una version mas reciente. Se recomienda el uso de Java 11.
- Maven instalado.
- Netbeans instalado.
- JUnit 5.
- Maven Surefire Plugin.

**Uso**
**¿Como usar el producto?**
1. Ejecutar la clase principal Fase3MarcosCervantes.java (Este nombre de la clase se usa unicamente para las entregas de este proyecto, la clase tiene otro nombre en el sistema de Comar)
2. Registrar un pedido con los datos del cliente.
3. Registrar una ruta.
4. Registrar una unidad.
5. Utilizar la clase SistemPlaneacion.java para asignar la unidad y la ruta al pedido previamente creado.
6. Consultar que la informacion generada sea correcta en la consola del sistema.

Ejemplo de Uso:

<img width="365" height="577" alt="image" src="https://github.com/user-attachments/assets/2a9104b8-e06a-4e79-96e4-c68164ee6ddb" />

**Contribucion**
**¿Como contribuir al producto?**
1. Crear una nueva rama a partir de develop. Asegurese de no realizar los cambios directamente en Main. 
2. Realizar los cambios.
3. Hacer commit de los cambios.
4. Crear un Pull Request hacia la rama develop.
5. Esperar la revision y aprobacion del lider del proyecto o owner del sistema.

El proyecto cuenta con 2 ramas, la rama Main es la version final o que se le conoce en otros lados como la version de produccion.
La version develop es donde se van integrando los cambios que son puestos a prueba y validados. Es como un servidor de prueba. 

Todas las clases:
- Pedido
- Unidad
- Ruta
- SistemPlaneacion
- Fase3MarcosCervantes

Estan ligadas directamente a la rama develop. Una vez que todos los cambios se validan se hace un pull request de develop a main. 

La versión actual del sistema funciona como una aplicación de consola con datos de ejemplo definidos en la clase principal, lo cual permite validar la logica general del proyecto y su correcta ejecución mediante un archivo JAR funcional. En el futuro se podria incorporar una entrada interactiva de datos y almacenamiento constante.

**Roadmap**
**Mejoras futuras**
<img width="468" height="1550" alt="Roadmap" src="https://github.com/user-attachments/assets/6cefe7e6-c1ec-4bbf-9226-82a771c38625" />

Autor
Marcos Cervantes
