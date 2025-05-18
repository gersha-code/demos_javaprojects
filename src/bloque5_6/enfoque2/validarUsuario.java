package bloque5_6.enfoque2;

public class validarUsuario {

    public void validarUsuario(String nombre, int edad, String correo) throws UsuarioException{
        StringBuilder mensaje = new StringBuilder();

        if (nombre == null || nombre.isBlank()) {
            mensaje.append("\n-El nombre no puede estar vacio\n");
        }
        if (edad < 18) {
            mensaje.append("-Debes ser mayor de edad\n");
        }
        if (correo == null || !correo.contains("@")) {
            mensaje.append("-Correo invalido");
        }

        if (mensaje.length() > 0) {
            throw new UsuarioException("Errores encontrados: " + mensaje.toString());
        }

        System.out.println("Usuario valido");
    
    }
}
