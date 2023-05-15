# Parcial2
Basándome en el patrón MVC (Modelo-Vista-Controlador), aquí está la arquitectura del sistema para la librería "Libros para Todos" y cómo se dividirían las responsabilidades entre los componentes:

Modelo (Model):

El Modelo es responsable de manejar la lógica de negocio y los datos del sistema.
En el caso de la librería, el Modelo incluiría la clase Libro y el LibroModelo, que se encargaría de manejar la colección de libros, agregar nuevos libros, buscar libros y realizar operaciones relacionadas con la gestión de libros.
El Modelo proporciona métodos y funciones para interactuar con los datos subyacentes y realizar operaciones como agregar, buscar y obtener libros.
Vista (View):

La Vista es responsable de la presentación de la información al usuario y la interfaz de usuario.
En el caso de la librería, la Vista sería representada por la clase LibroVista, que se encargaría de mostrar los libros en la pantalla y recibir las interacciones del usuario.
La Vista obtiene la información necesaria del Modelo y la presenta de forma legible y comprensible para el usuario.
La Vista también puede enviar eventos y acciones del usuario al Controlador para su procesamiento.
Controlador (Controller):

El Controlador actúa como intermediario entre el Modelo y la Vista, y es responsable de coordinar las interacciones entre ambos componentes.
En el caso de la librería, el Controlador sería representado por la clase LibroControlador.
El Controlador recibe las acciones del usuario desde la Vista y realiza las operaciones correspondientes en el Modelo.
El Controlador actualiza la Vista con los resultados obtenidos del Modelo, asegurando que la información mostrada sea precisa y actualizada.
El Controlador también puede realizar acciones adicionales, como validar los datos ingresados por el usuario antes de enviarlos al Modelo.
La división de responsabilidades entre los componentes sería la siguiente:

El Modelo se encarga de manejar la lógica de negocio y los datos, incluyendo la gestión de libros y la realización de operaciones en la colección de libros.
La Vista se encarga de mostrar los libros en la interfaz de usuario y recibir las interacciones del usuario.
El Controlador se encarga de recibir las acciones del usuario desde la Vista, realizar las operaciones correspondientes en el Modelo y actualizar la Vista con los resultados obtenidos.
Esta división de responsabilidades permite una mayor modularidad y separación de preocupaciones en el sistema. Cada componente tiene su propia responsabilidad y se comunica con los demás componentes de acuerdo con las reglas del patrón MVC. Esto facilita el mantenimiento, la extensibilidad y la reutilización del código, ya que los cambios en un componente no afectarán directamente a los demás.
