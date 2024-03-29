# Principios SOLID

## Single Responsibility
- Nunca debe haber más de una razón por la cuál una clase deba cambiar.
- La clase debe enfocarse en una funcionalidad específica.
[Ver ejemplo](SinglleResponsability/SingleResponsibility.md)

## Open - Close
- Entidades de software (Clases, Módulos, Métodos, etc) deben ser abiertos a extenderse, pero cerrados a la modificación.
    - Open to extension: Se puede extender su comportamiento. Es decir, que se puede extender una clase o interfaz y sobreescribir el comportamiento de un método.
    - Closed for modification: No se puede cambiar el comportamiento del código existente. No debemos modificar el código escrito.
[Ver ejemplo](Open-Close/OpenClose.md)

## Liskov Substitution
- Se puede sustituir una instancia de la clase base con instancias de una clase hija y no se debe modificar el comportamiento o las características del programa

## Interface Segregation
- Los clientes no deben ser forzados a implementar métodos que nunca van a usar.  
- Evitar el concepto de: Interface Pollution
  - Clases que tienen métodos con implementaciones vacías.
  - Métodos que retornan una excepción de tipo UnsupportedOperationException.
  - Métodos que retornan valores nulos o por defecto.

## Dependency Inversion
- Módulos de alto nivel no deben depender de módulos de bajo nivel. Ambos deben depender de abstracciones
- Abstracciones no deben depender de detalles
- Los detalles deben depender de abstracciones.
- **Si necesito una instancia de un objeto, no la debo crear, me la deben pasar como parámetro definido como una abstracción.**
