# Single Responsibility

En este ejemplo se simulará un MVC, donde la clase [UserController.java](/src/main/java/UserController.java) tiene toda la atención, ya que allí es que se puede ver la aplicación del principio. Esta clase sería la encargada de procesar el request y enviar la petición a la capa correspondiente.

En la clase se puede observar una instancia de [UserValidator](/src/main/java/UserValidator.java) que es la encargada de verificar que el parámetro recibido cumpla con las condiciones para poder ser procesado. Se estaría violando el principio en el caso que sea la clase UserController el mismo encargado de realizar esa validación.

De la misma forma se puede apreciar que la clase [UserPersistenceService](/src/main/java/UserPersistenceService.java) es la encargada de manejar la persistencia del objeto User.

