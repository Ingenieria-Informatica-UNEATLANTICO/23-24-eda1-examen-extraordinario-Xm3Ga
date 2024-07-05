### Propuesta de solución

Dejaremos atrás los arrays (al menos parcialmente) y procederemos a refactorizar el programa usando Listas de Java.

### Solución (TODO)

Modificamos la clase hamburguesa para que utilize un List<Ingrediente> ingredientes. Esto nos va a permitir mucha más libertad a la hora de añadir los ingredientes y solo hace faltan unos pocos metodos adicionales para completar el CRUD. Cambiamos también el constructor de la clase para que la hamburguesa, en vez de tener una estructura fija, sea un ArrayList de ingredientes, esto permite poner cualquier ingrediente en cualquier posición, además de libertad de tamaño.
Gracias a la estructura del programa, no necesitamos hacer cambios adicionales en las demás clases del programa para adoptar la refactorización de Hamburguesa.
Finalmente, cambiamos Cocinero para implementar un nuevo proceso de creación de la hamburguesa.

Métodos implementados:

C (agregarIngrediente)
R (mostrar y describir)
U (actualizarIngrediente)
D (quitarIngrediente)

Además, reorganizarIngredientes

TODO

Todo hecho ^^

# PlantUML

Se a añadido un PlantUML del proyecto ya finalizado