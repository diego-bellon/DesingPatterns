#Open - Close

En este ejemplo se simula el comportamiento de una compañía telefónica. Que ofrece servicios de internet, telefonía, televisión. NUestro trabajo consiste en hacer seguimiento al consumo de los suscriptores.

En este caso nos centraremos en la clase [Suscriber.java](src/main/java/Subscriber.java), la cual concentra el comportamiento de los diferentes suscriptores. Si no se tuviera esta agrupación tendríamos código duplicado en la implementación de cada suscriptor.
En la clase se define un método abstracto **calculateBilling()** que debe ser implementado por cada uno de los suscriptores, debido a que cada tipo de suscriptor calcula la factura basado en variables diferentes. 

En este caso, la clase [Suscriber.java](src/main/java/Subscriber.java) está cerrada a modificación (no se debe tocar ese código), pero abierta a extensión porque cada suscriptor implementa su generación de factura.