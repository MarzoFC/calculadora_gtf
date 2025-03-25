Para generar el .jar necesitamos tan sólo abrir una ventana bash en el directorio donde se encuentre el repositorio actual y lanzar:

mvn clean install

Posteriormente, y en caso de que el clean install hayan sido satisfactorio, ejecutaremos en al misma consola:

mvn spring-boot:run 

Con ello, nos levantará la aplicación en el puerto que esté indicado en el archivo ./resources/application.properties
