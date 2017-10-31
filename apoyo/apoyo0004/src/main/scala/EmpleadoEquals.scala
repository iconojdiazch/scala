class Empleado (nombre: String, edad: Int) {
    def canEqual(a: Any) = a.isInstanceOf[Empleado]
    override def equals(that: Any): Boolean =
        that match {
            case that: Empleado => that.canEqual(this) && this.hashCode == that.hashCode
            case _ => false
     }
    override def hashCode: Int = {
        val primo = 31
        var resultado = 1
        resultado = primo * resultado + edad;
        resultado = primo * resultado + (if (nombre == null) 0 else nombre.hashCode)
        return resultado
    }
}

class EmpleadoSinEquals(nombre: String, edad: Int) {
  
}