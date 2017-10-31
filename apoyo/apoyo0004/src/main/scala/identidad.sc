object identidad {
  println("Welcome to the Scala worksheet")
  new Empleado("a", 20) == new Empleado("a", 20)
  new Empleado("a", 20) != new Empleado("a", 22)
  new Empleado("a", 20) eq new Empleado("a", 20)

  new EmpleadoSinEquals("a", 20) == new EmpleadoSinEquals("a", 20)
  new EmpleadoSinEquals("a", 20) eq new EmpleadoSinEquals("a", 20)

}