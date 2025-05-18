package bloque5_6.enfoque1;

public class validarUsuario {

    public void validarUsuario(String nombre, int edad) throws nombreInvalido, edadInvalida{
        if (nombre == null || nombre.isBlank()) {
            throw new nombreInvalido("El nombre no puede estar vacio."); 
        }
        if (edad < 18) {
            throw new edadInvalida("Tiene que ser mayor de edad.");
        }
    }
}

class edadInvalida extends Exception{
    public edadInvalida(String mensaje){
        super(mensaje);
    }
}

class nombreInvalido extends Exception{
    public nombreInvalido(String mensaje){
        super(mensaje);
    }
}
